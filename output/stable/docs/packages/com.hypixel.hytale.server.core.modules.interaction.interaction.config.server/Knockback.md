---
title: "Knockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.Knockback"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "combat"
  - "knockback"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public abstract class Knockback
```

Abstract base class for knockback force calculations. Configured via a polymorphic codec (`CodecMapCodec` with `"Type"` discriminator). Provides shared fields for force magnitude, duration, velocity type, and velocity configuration. Concrete implementations define how the force vector is computed from source, target, and attacker yaw.

## Codec Properties (BASE_CODEC)

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Force` | `double` (stored as `float`) | No | -- | The knockback force magnitude. |
| `Duration` | `float` | No | -- | Duration for which knockback is continuously applied. If 0, force is applied once. Must be >= 0. |
| `VelocityType` | `ChangeVelocityType` | No | `Add` | How the velocity change is applied (Add, Set, etc.). |
| `VelocityConfig` | `VelocityConfig` | No (inherited) | -- | Additional velocity configuration. |

## Methods

```java
public float getForce()
```

```java
public float getDuration()
```

```java
public ChangeVelocityType getVelocityType()
```

```java
public VelocityConfig getVelocityConfig()
```

```java
public abstract Vector3d calculateVector(Vector3d var1, float var2, Vector3d var3)
```

Calculates the knockback velocity vector given the source position, attacker yaw, and target position.

```java
@Nonnull
@Override
public String toString()
```

## Subclasses

- [DirectionalKnockback](DirectionalKnockback.md) -- knockback with directional offsets relative to attacker facing
- [ForceKnockback](ForceKnockback.md) -- knockback along a fixed normalized direction
- [PointKnockback](PointKnockback.md) -- knockback away from a point (source-to-target direction)

## See Also

- [DamageEffects](DamageEffects.md) -- configures knockback as part of damage effects
- `KnockbackComponent` -- entity component that receives knockback instructions
