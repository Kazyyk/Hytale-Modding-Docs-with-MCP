---
title: "DamageEntityInteraction.AngledDamage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DamageEntityInteraction.AngledDamage"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DamageEntityInteraction.TargetedDamage"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "combat"
  - "damage"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public static class DamageEntityInteraction.AngledDamage extends DamageEntityInteraction.TargetedDamage
```

Extends [TargetedDamage](DamageEntityInteraction.TargetedDamage.md) with angle-based matching. During damage calculation, the angle between attacker and target is compared against the configured `Angle` and `AngleDistance` (both specified in degrees, converted to radians internally). If the hit falls within the angular range, this entry's damage calculator and effects override the defaults.

## Codec Properties

Inherits all codec properties from [TargetedDamage](DamageEntityInteraction.TargetedDamage.md), plus:

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Angle` | `float` | No (inherited) | -- | The center angle in degrees (converted to radians on decode). |
| `AngleDistance` | `float` | No (inherited) | -- | The angular tolerance in degrees. A hit matches if its angle is within this distance of `Angle`. |

## Fields

| Type | Name | Description |
|---|---|---|
| `float` | `angleRad` | Center angle in radians. |
| `float` | `angleDistanceRad` | Angular tolerance in radians. |

## Methods

```java
@Nonnull
public com.hypixel.hytale.protocol.AngledDamage toAngledDamagePacket()
```

Converts to protocol packet form, including damage effects and follow-up interaction reference.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [DamageEntityInteraction](DamageEntityInteraction.md) -- parent interaction
- [DamageEntityInteraction.TargetedDamage](DamageEntityInteraction.TargetedDamage.md) -- base class
