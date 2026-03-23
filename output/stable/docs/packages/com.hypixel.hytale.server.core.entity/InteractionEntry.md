---
title: "InteractionEntry"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.InteractionEntry"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class InteractionEntry
```

A single entry (step) within an interaction chain. Maintains server state (`InteractionSyncData`), optional simulation state, optional client state, timestamps, and a `DynamicMetaStore<Interaction>` for per-entry metadata. Tracks sync state including desynced detection and waiting-for-data timeouts.
