---
title: "ParticleUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.ParticleUtil"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "particles"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class ParticleUtil
```

Static utility for spawning particle effects in the world. Provides numerous overloads accepting different combinations of position, rotation, scale, color, source entity, and player recipient lists. Sends `SpawnParticleSystem` packets to nearby players. The default particle visibility distance is 75 blocks.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `DEFAULT_PARTICLE_DISTANCE` | `double` | `75.0` | Default distance for spatial player collection. |

## Key Methods

| Method | Description |
|---|---|
| `spawnParticleEffect(String, Vector3d, ComponentAccessor)` | Spawns a named particle at a position, auto-collecting nearby players within 75 blocks. |
| `spawnParticleEffect(String, Vector3d, List, ComponentAccessor)` | Spawns a named particle for an explicit list of player refs. |
| `spawnParticleEffect(WorldParticle, Vector3d, List, ComponentAccessor)` | Spawns a `WorldParticle` with position/rotation offsets applied. |
| `spawnParticleEffects(WorldParticle[], Vector3d, Ref, List, ComponentAccessor)` | Spawns an array of particle effects at a single position. |
| `spawnParticleEffect(String, double, double, double, float, float, float, float, Color, Ref, List, ComponentAccessor)` | Full overload with rotation, scale, color, and source exclusion. |
