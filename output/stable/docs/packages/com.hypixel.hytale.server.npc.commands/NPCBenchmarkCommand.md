---
title: "NPCBenchmarkCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBenchmarkCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCBenchmarkCommand extends CommandBase
```

Implements `/npc benchmark`. Starts a timed performance benchmark for NPC role ticking or sensor support (position cache) operations. Results are logged to the NPC plugin logger after the benchmark duration completes.

## Arguments

| Argument | Type | Required | Default | Description |
|---|---|---|---|---|
| `--roles` | flag | no | -- | Benchmark role tick performance |
| `--sensorsupport` | flag | no | -- | Benchmark position cache / line-of-sight performance |
| `seconds` | `Double` | no | `30.0` | Duration of the benchmark in seconds (must be > 0) |

Exactly one of `--roles` or `--sensorsupport` must be provided.

## Behavior

**Role benchmark:** Calls `NPCPlugin.startRoleBenchmark()`. On completion, formats a `TimeDistributionRecorder` table sorted by average tick time per role, plus an aggregate "ALL" row.

**Sensor support benchmark:** Calls `NPCPlugin.startSensorSupportBenchmark()`. On completion, formats update times (player and entity) and line-of-sight statistics per role, via `SensorSupportBenchmark`.

If neither flag is set, the command fails with a start-failed message.

## Constructor

```java
public NPCBenchmarkCommand()
```

Registers as sub-command `"benchmark"` with translation key `"server.commands.npc.benchmark.desc"`.

## Related Types

- [NPCCommand](NPCCommand.md) -- parent command collection
- [NPCSensorStatsCommand](NPCSensorStatsCommand.md) -- displays sensor detection range statistics
