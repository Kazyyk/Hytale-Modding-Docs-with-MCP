---
title: "DirectionalKnockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DirectionalKnockback"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.Knockback"
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
public class DirectionalKnockback extends Knockback
```

Knockback that combines a source-to-target direction with configurable relative offsets rotated by the attacker's yaw. The X/Z velocity is derived from the normalized direction between attacker and target (with relative X/Z offsets added), scaled by force. The Y velocity is set directly from `VelocityY`.

## Codec Properties

Inherits all codec properties from [Knockback](Knockback.md), plus:

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `RelativeX` | `double` (stored as `float`) | No | `0.0` | Relative X offset, rotated by attacker yaw before adding to direction. |
| `VelocityY` | `double` (stored as `float`) | No | `0.0` | Fixed vertical velocity component. |
| `RelativeZ` | `double` (stored as `float`) | No | `0.0` | Relative Z offset, rotated by attacker yaw before adding to direction. |

## Methods

```java
@Nonnull
@Override
public Vector3d calculateVector(@Nonnull Vector3d source, float yaw, @Nonnull Vector3d target)
```

Computes the knockback vector. If source and target are nearly coincident, uses a fallback look vector. Adds rotated relative offsets, then scales X/Z by force and sets Y to `velocityY`.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [Knockback](Knockback.md) -- base class
- [PointKnockback](PointKnockback.md) -- simpler point-based variant
- [ForceKnockback](ForceKnockback.md) -- fixed-direction variant
