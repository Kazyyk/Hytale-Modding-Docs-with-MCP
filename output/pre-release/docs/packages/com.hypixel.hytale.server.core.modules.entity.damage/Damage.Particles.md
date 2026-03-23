---
title: "Damage.Particles"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.Particles"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "particles"
  - "visual"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class Damage.Particles
```

Holds impact particle data attached to a [Damage](Damage.md) event via the `Damage.IMPACT_PARTICLES` meta key. Contains both model-space and world-space particle arrays along with a view distance for broadcast range.

## Constructor

```java
public Particles(@Nullable ModelParticle[] modelParticles, @Nullable WorldParticle[] worldParticles, double viewDistance)
```

Creates a particle configuration with model particles, world particles, and a view distance.

## Methods

```java
@Nullable
public ModelParticle[] getModelParticles()
```

Returns the model-space particles to spawn on the hit entity's model, or `null`.

```java
public void setModelParticles(@Nullable ModelParticle[] modelParticles)
```

Sets the model-space particles.

```java
@Nullable
public WorldParticle[] getWorldParticles()
```

Returns the world-space particles to spawn at the hit location, or `null`.

```java
public void setWorldParticles(@Nullable WorldParticle[] worldParticles)
```

Sets the world-space particles.

```java
public double getViewDistance()
```

Returns the maximum distance at which players can see these particles.

```java
public void setViewDistance(double viewDistance)
```

Sets the view distance for particle visibility.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `modelParticles` | `ModelParticle[]` | `protected` | Model-space impact particles. |
| `worldParticles` | `WorldParticle[]` | `protected` | World-space impact particles. |
| `viewDistance` | `double` | `protected` | Broadcast range for particles. |

## Related Types

- [Damage](Damage.md) -- the damage event that carries particles via meta store
- [DamageSystems.ApplyParticles](DamageSystems.ApplyParticles.md) -- system that reads and spawns these particles
