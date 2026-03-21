---
title: "DamageCalculator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DamageCalculator"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "combat"
  - "damage"
  - "api"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public class DamageCalculator
```

Computes damage values for combat interactions. Supports two calculation types: `ABSOLUTE` (flat damage) and `DPS` (damage scaled by duration). Base damage is specified per `DamageCause` and can be modified by a random percentage modifier and sequential hit modifiers.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Type` | `DamageCalculator.Type` enum | No (inherited) | `ABSOLUTE` | Whether damage is absolute or duration-scaled (DPS). |
| `Class` | [DamageClass](DamageClass.md) | Yes (inherited) | `UNKNOWN` | The damage class, used by the damage system to apply armor-based modifiers. |
| `BaseDamage` | `Object2FloatMap<String>` | No (inherited) | -- | Base damage values keyed by `DamageCause` asset ID. |
| `SequentialModifierStep` | `float` | No (inherited) | `0.0` | Step value for sequential hit damage reduction. |
| `SequentialModifierMinimum` | `float` | No (inherited) | `0.0` | Minimum multiplier floor for sequential hits. |
| `RandomPercentageModifier` | `float` | No (inherited) | `0.0` | Random variance applied to damage (must be >= 0). |

## Methods

```java
@Nullable
public Object2FloatMap<DamageCause> calculateDamage(double durationSeconds)
```

Calculates damage for all configured causes. Applies type-based scaling and random variance. Returns `null` if no base damage is configured.

```java
public DamageCalculator.Type getType()
```

```java
@Nonnull
public DamageClass getDamageClass()
```

```java
public float getSequentialModifierStep()
```

```java
public float getSequentialModifierMinimum()
```

```java
@Override
public boolean equals(Object o)
```

```java
@Override
public int hashCode()
```

```java
@Nonnull
@Override
public String toString()
```

## Inner Enums

- [DamageCalculator.Type](DamageCalculator.Type.md) -- `DPS` or `ABSOLUTE`

## See Also

- [DamageClass](DamageClass.md) -- classifies the damage for armor modifier lookups
- [DamageEntityInteraction](DamageEntityInteraction.md) -- primary consumer of this class
- `DamageCause` -- asset type for individual damage causes
