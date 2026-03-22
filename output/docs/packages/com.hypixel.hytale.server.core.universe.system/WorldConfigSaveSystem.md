---
title: "WorldConfigSaveSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.system"
fqcn: "com.hypixel.hytale.server.core.universe.system.WorldConfigSaveSystem"
api_surface: false
extends: "DelayedSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "universe"
---

**Package:** `com.hypixel.hytale.server.core.universe.system`

```java
public class WorldConfigSaveSystem extends DelayedSystem<EntityStore>
```

ECS system extending `DelayedSystem<EntityStore>`. Processes entities each tick.

## Constructors

| Constructor | Description |
|---|---|
| `WorldConfigSaveSystem()` | Creates a new WorldConfigSaveSystem instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` | `void` | public method. |
| `saveWorldConfigAndResources(@Nonnull World world)` | `CompletableFuture<Void>` | static public method. |
