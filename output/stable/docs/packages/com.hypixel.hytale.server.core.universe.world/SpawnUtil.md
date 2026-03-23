---
title: "SpawnUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.SpawnUtil"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "spawn"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public final class SpawnUtil
```

Utilities for applying spawn transforms to player entities. Used during first-join and respawn to position the player at the world's spawn point with appropriate body and head rotation.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `applyFirstSpawnTransform(Holder<EntityStore>, World, WorldConfig, UUID)` | `TransformComponent` | Applies the world's spawn provider transform to a player holder. Returns null if no spawn provider is configured. |
| `applyTransform(Holder<EntityStore>, Transform)` | `void` | Applies an arbitrary transform (position and rotation) to an existing entity holder. |
