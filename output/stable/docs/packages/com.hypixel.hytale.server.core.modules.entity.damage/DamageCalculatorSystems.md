---
title: "DamageCalculatorSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageCalculatorSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "calculator"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DamageCalculatorSystems
```

Contains systems and utilities for calculating damage from interaction-based combat. Provides the `queueDamageCalculator` method that converts a map of relative damage values per cause into an array of [Damage](Damage.md) events, applying broken weapon penalties when applicable. Also defines the `DAMAGE_SEQUENCE` meta key used to track sequential hit information on damage events.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `DAMAGE_SEQUENCE` | `MetaKey<DamageCalculatorSystems.DamageSequence>` | Meta key on the [Damage](Damage.md) meta registry for attaching sequential hit data. |

## Static Methods

```java
@Nonnull
public static Damage[] queueDamageCalculator(
    @Nonnull World world,
    @Nonnull Object2FloatMap<DamageCause> relativeDamage,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull CommandBuffer<EntityStore> commandBuffer,
    @Nonnull Damage.Source source,
    @Nullable ItemStack itemInHand
)
```

Converts a map of `DamageCause` to relative damage values into an array of `Damage` events. For each entry, if the cause is `PHYSICAL` and the item in hand is broken, the damage is reduced by the weapon broken penalty from the world's gameplay config. All produced damage events have `CAN_BE_PREDICTED` set to `true`.

## Inner Types

- [DamageCalculatorSystems.DamageSequence](DamageCalculatorSystems.DamageSequence.md) -- tracks sequential hit state
- [DamageCalculatorSystems.Sequence](DamageCalculatorSystems.Sequence.md) -- codec-serializable hit counter
- [DamageCalculatorSystems.SequenceModifier](DamageCalculatorSystems.SequenceModifier.md) -- system that applies sequential hit scaling

## Related Types

- [Damage](Damage.md) -- the damage events produced by this calculator
- [DamageCause](DamageCause.md) -- damage type keys in the relative damage map
- [DamageModule](DamageModule.md) -- registers the SequenceModifier system
