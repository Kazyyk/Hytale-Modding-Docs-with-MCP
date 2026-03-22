# Hytale Modding Documentation Generator — Spec Addendum: Release Automation & Full Source Coverage

> **Version:** 0.1.0 (Draft)
> **Parent Spec:** `spec/generator-spec.md` v1.0.0
> **Status:** Proposed
> **Purpose:** Extend the pipeline with automated release detection, full source
> coverage (~6,862 types), incremental regeneration, and multi-version deployment
> for both stable and pre-release branches.

---

## 1. Goals

1. **Automated release detection.** A long-running process on a dedicated VPS
   polls for new Hytale server builds (stable and pre-release) and triggers the
   pipeline without human intervention.

2. **Full source coverage.** Expand documentation from the ~811 API surface types
   to all ~6,862 types in the server JAR. Every type gets a full-depth
   documentation page suitable for both human browsing and agent consumption
   via MCP.

3. **Incremental regeneration.** Avoid re-analyzing the entire source on every
   release. Diff the decompiled source against the previous version, identify
   changed and affected types, and regenerate only what's necessary.

4. **Multi-version deployment.** Serve documentation for both stable and
   pre-release branches on separate subdomains with independent MCP endpoints.

5. **Notification system.** Alert the operator via email (informational) and
   SMS/push (critical) for pipeline events and failures.

---

## 2. Architecture Overview

```
                     ┌──────────────────────────────┐
                     │  VPS — Orchestrator Daemon    │
                     │                              │
                     │  ┌────────────────────────┐  │
                     │  │  Version Poller         │  │
                     │  │  (cron: hourly)         │  │
                     │  │                        │  │
                     │  │  stable ──┐            │  │
                     │  │  pre-release ──┐       │  │
                     │  └────────────┬───┴───────┘  │
                     │               │               │
                     │       ┌───────▼────────┐      │
                     │       │ Token Manager  │      │
                     │       │ (OAuth2 lifecycle) │   │
                     │       └───────┬────────┘      │
                     │               │               │
                     │  ┌────────────▼────────────┐  │
                     │  │  Pipeline Runner         │  │
                     │  │                          │  │
                     │  │  Phase 0: Download JAR   │  │
                     │  │  Phase 1: Decompile      │  │
                     │  │  Phase 1.5: Diff & Plan  │  │
                     │  │  Phase 2: Classify       │  │
                     │  │  Phase 3: Map Systems    │  │
                     │  │  Phase 4: Generate Docs  │  │
                     │  │  Phase 4.1: Validate     │  │
                     │  │  Phase 5: Deploy         │  │
                     │  └────────────┬────────────┘  │
                     │               │               │
                     │       ┌───────▼────────┐      │
                     │       │ Notifier       │      │
                     │       │ (email + SMS)  │      │
                     │       └────────────────┘      │
                     └──────────────────────────────┘
                                     │
                       ┌─────────────┴──────────────┐
                       ▼                            ▼
              hydex.dev                       pre.hydex.dev
              ┌──────────────┐                ┌──────────────┐
              │ Pages Site   │                │ Pages Site   │
              │ R2 Bucket    │                │ R2 Bucket    │
              │ AI Search    │                │ AI Search    │
              │ MCP Worker   │                │ MCP Worker   │
              └──────────────┘                └──────────────┘
```

---

## 3. Version Poller

### 3.1 Detection Method

The Hytale Downloader CLI is the detection mechanism. It is already a pipeline
dependency (required to download the JAR), so no additional tooling is needed.

```bash
# Check latest available version without downloading
./hytale-downloader -print-version

# Check pre-release channel
./hytale-downloader -print-version -patchline pre-release
```

The poller runs both commands on a schedule (default: hourly, configurable) and
compares the output against the last-known version stored in a local state file.

### 3.2 State File

```json
{
  "stable": {
    "version": "2026.02.10-a1b2c3d4e",
    "jar_hash": "sha256:b728b1b83750fadfbacc7ae98bb7ae424d5947114bc13308337e8fd5dab364a8",
    "last_checked": "2026-03-18T12:00:00Z",
    "last_pipeline_run": "2026-02-10T03:15:00Z",
    "status": "idle"
  },
  "pre_release": {
    "version": "2026.03.15-f5e6d7c8b",
    "jar_hash": "sha256:...",
    "last_checked": "2026-03-18T12:00:00Z",
    "last_pipeline_run": "2026-03-15T14:22:00Z",
    "status": "idle"
  }
}
```

### 3.3 Poll Logic

```
for each branch in [stable, pre-release]:
    latest = run `hytale-downloader -print-version [-patchline pre-release]`
    if latest != state[branch].version:
        notify(INFO, "New {branch} version detected: {latest}")
        state[branch].status = "pipeline_running"
        trigger_pipeline(branch, latest)
    state[branch].last_checked = now()
```

If the poller itself fails (e.g., network error, CLI crash), it logs the failure
and retries on the next cycle. Three consecutive poller failures trigger a
warning notification.

---

## 4. OAuth2 Token Lifecycle

### 4.1 Token Storage

Tokens are stored in a file on the VPS with restricted permissions (`chmod 600`).
The file is outside the project repository and never committed.

```
/etc/hydex/credentials.json
```

```json
{
  "access_token": "eyJhbGci...",
  "refresh_token": "xreEsdDGr...",
  "token_type": "Bearer",
  "expires_at": "2026-03-18T13:00:00Z",
  "refresh_expires_at": "2026-04-17T12:00:00Z",
  "last_refreshed": "2026-03-18T12:00:00Z"
}
```

### 4.2 Refresh Strategy

The orchestrator proactively refreshes tokens **7 days before the refresh token
expiry** (estimated at 30 days from issuance). This provides a generous window
for transient failures.

```
refresh_deadline = refresh_expires_at - 7 days

on each poll cycle:
    if now() >= refresh_deadline:
        attempt token refresh via OAuth2 refresh_token grant
        if success:
            store new tokens
            notify(INFO, "OAuth tokens refreshed successfully")
        if failure:
            notify(CRITICAL, "OAuth token refresh failed — manual re-auth required")
            retry on next cycle
            if 3 consecutive failures:
                notify(CRITICAL, "OAuth refresh failing repeatedly — pipeline is degraded")
```

### 4.3 Initial Setup and Recovery

Initial authentication requires the device code flow, which involves opening a
URL in a browser. This is a one-time manual step performed during VPS setup.

Recovery from expired tokens follows the same manual flow. The orchestrator
detects the expired state and sends a CRITICAL notification with instructions:

```
CRITICAL: Hytale OAuth tokens have expired.
Manual re-authentication required.

SSH into the VPS and run:
    hytale-orchestrator auth login

Then follow the device code flow in your browser.
```

---

## 5. Full Source Coverage

### 5.1 Scope

The pipeline documents all types in the JAR (~7,016 as of the current build).
Every type receives a full documentation page with the same template and depth:

- Frontmatter (kind, FQCN, package, api_surface flag, tags)
- Class/interface/enum declaration with full signature
- Inheritance hierarchy
- Field documentation
- Method documentation with parameter descriptions
- Cross-references to related types
- Usage context and system membership where determinable
- Prose description of purpose (or explicit "purpose unknown" annotation)

### 5.2 API Surface as Metadata

The `api_surface` classification (from Phase 2) is a boolean frontmatter field
on each page. It does not affect file placement or generation scope — all types
get pages regardless. The classification serves three purposes:

1. **Site navigation.** The documentation site promotes API surface types in
   its sidebar, search ranking, and landing pages. Internal types are accessible
   but not featured.

2. **MCP search ranking.** The MCP `search_docs` tool weights API surface
   results higher for unscoped queries, while still returning internal types
   when relevant.

3. **Generation priority.** On incremental runs, API surface types are processed
   first. If the pipeline is interrupted, the highest-value docs are updated.

### 5.3 Package-Based Organization

Documentation is organized in a unified `packages/` tree using flat directories
named after Java packages. There is no separate `api/` directory — the
`api_surface` frontmatter field drives navigation prominence instead.

```
output/docs/{branch}/
├── index.md                          # Landing page
├── packages/                         # All types, by Java package
│   ├── com.hypixel.hytale.plugin/
│   │   ├── index.md                  # Package overview
│   │   ├── JavaPlugin.md             # api_surface: true
│   │   ├── PluginManager.md          # api_surface: false
│   │   └── ...
│   ├── com.hypixel.hytale.server.core/
│   │   ├── index.md
│   │   ├── Message.md                # api_surface: true
│   │   └── ...
│   ├── com.hypixel.hytale.protocol/
│   │   ├── index.md
│   │   └── ...
│   └── .../
├── schemas/                          # JSON data asset schemas
│   ├── index.md
│   └── ...
└── meta.json
```

Inner classes use the format `OuterClass.InnerClass.md` within the outer
class's package directory.

### 5.4 Sub-Agent Strategy

Full source generation is too large for a single LLM context pass. The pipeline
uses a coordinator/worker pattern with Claude Code sub-agents.

**Coordinator agent** responsibilities:
- Reads `class-index.json`, `surface.json`, `systems.json`, `cross-refs.json`
- Partitions work into package-scoped batches
- Dispatches sub-agents with scoped context
- Collects results and validates cross-package references
- Runs Phase 4.1 link validation on the combined output

**Worker sub-agent** responsibilities:
- Receives a package scope (e.g., `com.hypixel.hytale.server.world.*`)
- Receives the decompiled source for that package
- Receives the full `class-index.json` for resolving external type references
- Receives relevant slices of `systems.json` and `cross-refs.json`
- Generates documentation for all types in the assigned package
- Returns generated pages and a manifest of cross-package references made

**Partitioning heuristic:**

Partition by top-level subsystem package. Estimated partition sizes (based on
current build):

| Partition | Estimated Types | Priority |
|-----------|-----------------|----------|
| `*.plugin.*`, `*.api.*`, `*.event.*` | ~811 | 1 (API surface) |
| `*.server.core.*` | ~500 | 2 |
| `*.server.world.*` | ~400 | 3 |
| `*.protocol.*` | ~800 | 4 |
| `*.codec.*` | ~300 | 5 |
| `*.logger.*`, `*.metrics.*` | ~100 | 6 |
| Remaining packages | ~3,951 | 7 |

The coordinator may subdivide large partitions further if they exceed the
sub-agent's effective context budget. The target is for each sub-agent to hold
all decompiled source for its partition plus the index artifacts in a single
context window.

### 5.5 Invocation

Sub-agents are invoked via Claude Code in headless mode:

```bash
claude -p "$(cat prompts/generate-package.md)" \
  --allowedTools bash,read,write \
  --max-turns 50 \
  2>&1 | tee logs/generate-${PACKAGE}.log
```

The prompt template (`prompts/generate-package.md`) is parameterized with the
package scope, file paths, and quality rules extracted from AGENTS.md.

---

## 6. Incremental Pipeline

### 6.1 Phase 1.5 — Diff & Plan (New Phase)

After Phase 1 decompiles the new JAR, and before Phases 2-4 run, a new
deterministic phase computes the changeset.

**Inputs:**
- `artifacts/decompiled/` (new version, from Phase 1)
- `artifacts/decompiled-prev/` (previous version, preserved from last run)
- `artifacts/dependency-graph.json` (from previous run)

**Outputs:**
- `artifacts/changeset.json` — List of changed, added, and deleted source files
- `artifacts/regeneration-plan.json` — List of types whose docs must be
  regenerated, with reasons

**Algorithm:**

```
1. git diff --name-status artifacts/decompiled-prev/ artifacts/decompiled/
   → produces list of Added, Modified, Deleted files

2. Map each changed file to its FQCN via the class index.

3. For each changed FQCN, look up its dependents in dependency-graph.json.
   A "dependent" is any type whose documentation page references the changed
   type (method signatures, cross-refs, inheritance, etc.).

4. The regeneration set = changed types ∪ their dependents.

5. Write regeneration-plan.json:
   {
     "version": "2026.03.15-f5e6d7c8b",
     "previous_version": "2026.03.10-a1b2c3d4e",
     "total_types": 6862,
     "changed_files": 47,
     "changed_types": 52,
     "dependent_types": 118,
     "regeneration_set": 170,
     "added_types": ["com.hypixel.hytale.server.core.NewFeature", ...],
     "deleted_types": ["com.hypixel.hytale.server.core.OldFeature", ...],
     "modified_types": ["com.hypixel.hytale.server.core.Message", ...],
     "affected_types": ["com.hypixel.hytale.plugin.JavaPlugin", ...]
   }
```

### 6.2 Dependency Graph

The dependency graph is built as a side-effect of Phase 4 generation and
maintained across runs.

```json
{
  "version": "1.0.0",
  "generated_at": "2026-03-10T03:15:00Z",
  "edges": {
    "com.hypixel.hytale.server.core.Message": {
      "referenced_by": [
        "com.hypixel.hytale.plugin.JavaPlugin",
        "com.hypixel.hytale.server.core.command.system.CommandContext"
      ],
      "references": [
        "com.hypixel.hytale.server.core.MessageType",
        "java.lang.String"
      ]
    }
  }
}
```

`referenced_by` captures types whose documentation pages contain references to
this type (as links, in method signatures, in prose, etc.). This is the reverse
lookup needed for regeneration planning: if type A changes, all types in
`A.referenced_by` need regeneration.

Standard library types (java.*, javax.*) are excluded from the graph.

### 6.3 Selective Phase Execution

On an incremental run, the pipeline adapts:

| Phase | Full Run | Incremental Run |
|-------|----------|-----------------|
| 0. Download | Always | Always |
| 1. Decompile & Index | Always | Always (fast, deterministic) |
| 1.5. Diff & Plan | N/A | Always |
| 2. Classify | Full | Re-run on added/deleted types only |
| 3. Map Systems | Full | Re-run for systems containing changed types |
| 4. Generate Docs | All types | Regeneration set only |
| 4.1. Validate | Full scan | Full scan (fast, deterministic) |
| 5. Deploy | Always | Always |

The first run after this addendum is implemented is always a full run (no
previous artifacts to diff against). Subsequent runs use the incremental path.

### 6.4 Artifact Preservation

After each successful pipeline run, the orchestrator:

1. Copies `artifacts/decompiled/` to `artifacts/decompiled-prev/`
2. Commits updated `artifacts/` and `output/docs/` to git
3. Tags the commit with the version identifier

The `decompiled-prev/` directory is gitignored (too large to commit) but
preserved on the VPS filesystem between runs.

---

## 7. Multi-Version Deployment

### 7.1 Subdomains

| Branch | Site | MCP Endpoint |
|--------|------|-------------|
| stable | `hydex.dev` | `mcp.hydex.dev/mcp` |
| pre-release | `pre.hydex.dev` | `mcp.pre.hydex.dev/mcp` |

Stable lives on the root domain — no subdomain needed.

### 7.2 Infrastructure Per Branch

Each branch has independent:

- **Git branch** in the repository (`docs/stable`, `docs/pre-release`)
- **Cloudflare Pages project** (git-integrated, auto-deploys on push)
- **R2 bucket** (`hydex-corpus-stable`, `hydex-corpus-pre`)
- **AI Search instance** (indexes from its respective R2 bucket)
- **MCP Worker** (queries its respective AI Search instance)

### 7.3 Repository Structure

```
hydex/
├── output/
│   ├── stable/
│   │   └── docs/          # Generated docs for stable branch
│   └── pre-release/
│       └── docs/          # Generated docs for pre-release branch
├── artifacts/
│   ├── stable/
│   │   ├── decompiled/
│   │   ├── decompiled-prev/  (gitignored)
│   │   ├── class-index.json
│   │   ├── surface.json
│   │   ├── systems.json
│   │   ├── cross-refs.json
│   │   ├── dependency-graph.json
│   │   ├── changeset.json
│   │   └── regeneration-plan.json
│   └── pre-release/
│       └── (same structure)
├── orchestrator/          # New: automation daemon
│   ├── config.json
│   ├── state.json
│   ├── prompts/
│   │   ├── generate-package.md
│   │   └── coordinator.md
│   └── src/
│       ├── poller.sh
│       ├── pipeline.sh
│       ├── diff.sh
│       ├── notify.sh
│       └── token-manager.sh
├── mcp/
│   ├── stable/            # MCP worker for hydex.dev
│   │   ├── wrangler.jsonc
│   │   └── src/index.ts
│   └── pre-release/       # MCP worker for pre.hydex.dev
│       ├── wrangler.jsonc
│       └── src/index.ts
└── site/
    ├── stable/            # Starlight site for hydex.dev
    └── pre-release/       # Starlight site for pre.hydex.dev
```

### 7.4 Deployment Flow

```
Pipeline completes for {branch}
    │
    ├─ Commit output/{branch}/docs/ to git
    │
    ├─ Push triggers Cloudflare Pages build for {branch} site
    │
    ├─ GitHub Action syncs output/{branch}/docs/ to R2 bucket
    │     └─ AI Search re-indexes automatically
    │
    └─ notify(INFO, "Docs deployed for {branch} version {version}")
```

---

## 8. Notification System

### 8.1 Notification Tiers

| Tier | Channel | Use Cases |
|------|---------|-----------|
| INFO | Email | New version detected, pipeline started, pipeline completed, docs deployed |
| WARNING | Email | Poller failures (3+ consecutive), non-critical pipeline errors, disk space low |
| CRITICAL | Email + SMS/Push | OAuth token refresh failed, pipeline hard failure, deployment failure |

### 8.2 Notification Events

| Event | Tier | Message |
|-------|------|---------|
| `version.detected` | INFO | "New {branch} version detected: {version}" |
| `pipeline.started` | INFO | "Pipeline started for {branch} {version}" |
| `pipeline.phase_complete` | INFO | "Phase {n} complete for {branch} {version} ({duration})" |
| `pipeline.complete` | INFO | "Pipeline complete for {branch} {version}. {n} types regenerated in {duration}." |
| `pipeline.failed` | CRITICAL | "Pipeline failed at Phase {n} for {branch} {version}: {error}" |
| `deploy.complete` | INFO | "Docs deployed: {url}" |
| `deploy.failed` | CRITICAL | "Deployment failed for {branch}: {error}" |
| `auth.refreshed` | INFO | "OAuth tokens refreshed. Next refresh due: {date}" |
| `auth.refresh_failed` | CRITICAL | "OAuth token refresh failed. Manual re-auth required." |
| `auth.expiry_warning` | WARNING | "OAuth refresh token expires in {n} days." |
| `poller.consecutive_failures` | WARNING | "Version poller has failed {n} consecutive times." |

### 8.3 Implementation

Email: Any transactional email provider (SES, Postmark, Mailgun, or a simple
SMTP relay). The orchestrator sends via CLI or a lightweight HTTP call.

SMS/Push: Twilio for SMS, or Pushover/Ntfy for push notifications. Ntfy is
self-hostable and free, which aligns with keeping dependencies minimal.

Configuration:

```json
{
  "notifications": {
    "email": {
      "enabled": true,
      "provider": "smtp",
      "to": "kaz@kobo.dev",
      "from": "noreply@hydex.dev"
    },
    "sms": {
      "enabled": true,
      "provider": "ntfy",
      "topic": "hydex-alerts",
      "priority": "critical_only"
    }
  }
}
```

---

## 9. Quality Gates

### 9.1 Deterministic Post-Generation Validation

The parent spec's Phase 4.1 validates link integrity. This addendum adds a
**signature verification** gate that runs after Phase 4 and before deployment.

For every generated documentation page:

1. Extract all method signatures documented on the page.
2. Look up the corresponding type in `class-index.json`.
3. Assert that every documented signature exists in the class index.
4. Assert that every public/protected method in the class index is documented.
5. Violations are logged to `artifacts/{branch}/validation-report.json`.

**Failure behavior:**

- Signature mismatches on API surface types: **block deployment**, notify CRITICAL.
- Signature mismatches on internal types: **log warning**, deploy anyway. These
  will be corrected on the next run. The priority is availability over perfection
  for internal types.

### 9.2 Diff Sanity Check

Before starting Phases 2-4, the orchestrator verifies the regeneration plan is
reasonable:

- If `regeneration_set` > 80% of `total_types`, fall back to a full run. A
  near-total regeneration via the incremental path is less efficient than a
  clean full run due to dependency graph overhead.
- If `added_types` + `deleted_types` > 500, notify WARNING ("Large API surface
  change detected") before proceeding. This may indicate a major version bump
  that warrants human review.

---

## 10. VPS Requirements

### 10.1 System Requirements

| Resource | Minimum | Recommended |
|----------|---------|-------------|
| CPU | 4 cores | 8 cores |
| RAM | 16 GB | 32 GB |
| Disk | 100 GB SSD | 200 GB SSD |
| Java | JDK 25 | JDK 25 |
| Node.js | 22+ | 22+ |
| OS | Ubuntu 24.04 LTS | Ubuntu 24.04 LTS |

The primary resource consumers are:
- Vineflower decompilation (CPU + RAM, ~5 min)
- JavaParser indexing (CPU + RAM, ~3 min)
- Claude Code sub-agents (network-bound, minutes to hours depending on scope)
- Two copies of decompiled source per branch (disk, ~2 GB each)

### 10.2 Required Software

- Java 25 JDK (Adoptium Temurin)
- Node.js 22+ (for site builds and Wrangler)
- Wrangler CLI (Cloudflare Workers deployment)
- Claude Code CLI (LLM agent invocation)
- Hytale Downloader CLI
- Git
- jq (JSON processing in shell scripts)
- aws-cli (R2 sync)

### 10.3 Security

- OAuth credentials stored outside the repo with `600` permissions
- Claude Code API key stored similarly
- VPS access via SSH key only, no password auth
- Orchestrator runs as a dedicated unprivileged user (`hydex`)
- Firewall allows outbound HTTPS only (no inbound except SSH)

---

## 11. Orchestrator Configuration

```json
{
  "poll_interval_seconds": 3600,
  "branches": ["stable", "pre-release"],
  "paths": {
    "credentials": "/etc/hydex/credentials.json",
    "state": "/var/lib/hydex/state.json",
    "repo": "/home/hydex/hydex",
    "downloader": "/usr/local/bin/hytale-downloader",
    "logs": "/var/log/hydex/"
  },
  "pipeline": {
    "full_run_threshold": 0.8,
    "large_change_warning_threshold": 500,
    "max_sub_agents": 4,
    "sub_agent_max_turns": 50
  },
  "token_refresh": {
    "days_before_expiry": 7,
    "max_consecutive_failures": 3
  },
  "notifications": {
    "email": {
      "enabled": true,
      "provider": "smtp",
      "to": "kaz@kobo.dev",
      "from": "noreply@hydex.dev"
    },
    "push": {
      "enabled": true,
      "provider": "ntfy",
      "topic": "hydex-alerts",
      "priority_filter": "warning,critical"
    }
  }
}
```

---

## 12. Implementation Phases

This addendum should be implemented incrementally. Each phase delivers
standalone value.

### Phase A — Multi-Version Repository Structure

Restructure the repository to support `stable/` and `pre-release/` output
directories and artifact directories. Migrate existing outputs to
`output/stable/docs/`. Deploy Cloudflare infrastructure for both branches
(Pages projects, R2 buckets, AI Search instances, MCP Workers). Stable
serves from `hydex.dev`, pre-release from `pre.hydex.dev`.

**Deliverable:** Two live domains serving (initially identical) documentation.

### Phase B — First Full Generation (Interactive)

The first full-coverage generation (~6,862 types) is an interactive session
between the operator and Claude Code in REPL mode. This is the most complex
run — establishing templates, catching edge cases, and building the initial
dependency graph. The operator drives the session, reviews output in real
time, and corrects course as needed.

Once the first generation completes successfully, its artifacts (dependency
graph, validated templates, generation prompts) become the foundation for
automated incremental runs.

**Deliverable:** Complete documentation set for the current stable build,
plus validated generation infrastructure.

### Phase C — Release Automation

Implement the orchestrator daemon: version poller, token manager, notification
system, and pipeline runner. The daemon invokes existing tooling (Phase 1-2
CLI tools) and Claude Code headless mode (Phase 3-4) for **incremental**
runs only — the heavy lifting was done in Phase B.

**Deliverable:** Fully automated incremental pipeline for stable releases.

### Phase D — Incremental Pipeline

Implement Phase 1.5 (Diff & Plan). Modify Phases 2-4 to accept and respect
the regeneration plan. Add the signature verification quality gate.

**Deliverable:** Incremental regeneration on version changes.

### Phase E — Pre-Release Branch

Extend Phase C automation to poll and process the pre-release branch.
Verify that two independent pipeline runs can execute (sequentially — not
concurrently, to avoid resource contention on the VPS).

**Deliverable:** Both branches fully automated.

---

## 13. Open Questions

Items requiring further investigation or decision before implementation:

1. **Claude Code headless reliability.** The pipeline depends on Claude Code
   executing multi-step agent tasks without interactive guidance. What is the
   failure rate in practice? What recovery strategy should the orchestrator use
   when a sub-agent fails mid-generation? (Retry the partition? Skip and notify?)

2. **Concurrent branch runs.** If a stable and pre-release version both land
   within the same hour, should they queue sequentially or can they run in
   parallel? Resource contention (CPU for decompilation, Claude Code rate limits)
   may make sequential mandatory.

3. **Breaking changes across versions.** When the API surface changes
   significantly between versions (renamed packages, removed types), the
   incremental diff may produce a very large regeneration set. Should the
   orchestrator detect this and switch to a full run automatically, or always
   attempt incremental?

4. **Documentation staleness for unchanged types.** If a type hasn't changed
   in 10 versions, its documentation was generated against an older context. As
   the generator improves (new templates, better prose), should there be a
   mechanism to mark all docs as stale and force a full regeneration
   periodically?

5. **Site search scalability.** Pagefind (Starlight's built-in search) indexes
   at build time. With ~6,862 pages, does the search index remain performant?
   Testing required.

6. **R2 + AI Search indexing at scale.** The current corpus is 65 documents.
   Scaling to ~6,862 may require changes to the AI Search configuration
   (chunking strategy, embedding model, index size). Testing required.
