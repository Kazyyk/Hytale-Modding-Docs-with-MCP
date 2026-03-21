---
title: "ForceKnockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.ForceKnockback"
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
public class ForceKnockback extends Knockback
```

Knockback along a fixed normalized direction, rotated by the attacker's yaw and scaled by force. The direction is normalized on decode.

## Codec Properties

Inherits all codec properties from [Knockback](Knockback.md), plus:

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Direction` | `Vector3d` | Yes (inherited) | `Vector3d.UP` | The knockback direction vector. Normalized on decode. |

## Methods

```java
@Nonnull
@Override
public Vector3d calculateVector(Vector3d source, float yaw, Vector3d target)
```

Clones the direction, rotates it by yaw, and scales by force.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [Knockback](Knockback.md) -- base class
- [DirectionalKnockback](DirectionalKnockback.md)
- [PointKnockback](PointKnockback.md)
