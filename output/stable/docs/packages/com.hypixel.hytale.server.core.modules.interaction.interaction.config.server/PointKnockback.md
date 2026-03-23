---
title: "PointKnockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.PointKnockback"
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
public class PointKnockback extends Knockback
```

Knockback computed from a point offset relative to the source. The direction is from the (optionally offset and yaw-rotated) source to the target, normalized and optionally rotated by `RotateY` degrees. X/Z components are scaled by force; Y is set directly from `VelocityY`.

## Codec Properties

Inherits all codec properties from [Knockback](Knockback.md), plus:

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `VelocityY` | `double` (stored as `float`) | No | `0.0` | Fixed vertical velocity component. |
| `RotateY` | `int` | No | `0` | Additional Y-axis rotation in degrees applied to the knockback direction. |
| `OffsetX` | `int` | No | `0` | X offset from source, rotated by yaw. |
| `OffsetZ` | `int` | No | `0` | Z offset from source, rotated by yaw. |

## Methods

```java
@Nonnull
@Override
public Vector3d calculateVector(@Nonnull Vector3d source, float yaw, @Nonnull Vector3d target)
```

Computes knockback direction from (offset) source to target, applies optional Y rotation, scales X/Z by force, and sets Y to `velocityY`.

## See Also

- [Knockback](Knockback.md) -- base class
- [DirectionalKnockback](DirectionalKnockback.md)
- [ForceKnockback](ForceKnockback.md)
