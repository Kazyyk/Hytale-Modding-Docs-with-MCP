---
title: "SpawnEffect"
kind: "interface"
package: "com.hypixel.hytale.server.npc.role"
fqcn: "com.hypixel.hytale.server.npc.role.SpawnEffect"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "particles"
---

**Package:** `com.hypixel.hytale.server.npc.role`

```java
public interface SpawnEffect
```

Contract for spawning particle effects when an NPC appears in the world. Implementers provide a particle system ID, an offset from the NPC's position, and a view distance for player visibility. The default `spawnEffect` method rotates the offset by the entity's yaw, collects nearby players within the view distance using a spatial query, and dispatches the particle effect.

## Abstract Methods

| Return Type | Signature |
|---|---|
| `String` | `getSpawnParticles()` |
| `Vector3d` | `getSpawnParticleOffset()` |
| `double` | `getSpawnViewDistance()` |

## Default Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `default` | `void` | `spawnEffect(@Nonnull Vector3d position, @Nonnull Vector3f rotation, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

The default implementation: returns early if `getSpawnParticles()` is null or empty. Otherwise, applies the yaw rotation from `rotation` to the particle offset, adds the entity position, queries the player spatial resource for nearby players, and calls `ParticleUtil.spawnParticleEffect`.
