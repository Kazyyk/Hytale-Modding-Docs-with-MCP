---
title: "SpawnJobSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.controllers"
fqcn: "com.hypixel.hytale.server.spawning.controllers.SpawnJobSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "controllers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.controllers`

```java
public abstract class SpawnJobSystem<J extends SpawnJob, T extends SpawnController<J>> extends EntityTickingSystem<EntityStore>
```

Abstract system that executes active spawn jobs, managing budget allocation, position probing, spawn attempts, and result handling.

## Inner Types

### Result

```java
public static enum SpawnJobSystem.Result
```

Spawn job result: `SUCCESS`, `FAILED`, `TRY_AGAIN`, `PERMANENT_FAILURE`, `PENDING_SPAWN`.
