---
title: "SpawnController"
kind: "class"
package: "com.hypixel.hytale.server.spawning.controllers"
fqcn: "com.hypixel.hytale.server.spawning.controllers.SpawnController"
api_surface: false
extends: ~
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
public abstract class SpawnController<T extends SpawnJob>
```

Abstract base class for spawn controllers that manage spawn job creation, active job tracking, and NPC population limits.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `World` | `getWorld()` |
| `public` | `boolean` | `isUnspawnable()` |
| `public` | `int` | `getActualNPCs()` |
| `public` | `double` | `getExpectedNPCs()` |
| `public` | `int` | `getActiveJobCount()` |
| `public` | `int` | `getMaxActiveJobs()` |
| `public abstract` | `T` | `createRandomSpawnJob(ComponentAccessor<EntityStore> componentAccessor)` |
