---
title: "DamageSystems.ArmorDamageReduction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ArmorDamageReduction"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "armor"
  - "resistance"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
@Deprecated
public static class DamageSystems.ArmorDamageReduction extends DamageEventSystem
```

Reduces incoming damage based on the target entity's equipped armor resistances. Part of the filter damage group. For each armor piece, collects flat and multiplicative resistance modifiers per damage cause. If the cause does not bypass resistances, applies flat reduction first then multiplicative reduction. Walks the damage cause inheritance chain to apply parent resistances. Also includes resistance contributions from active entity effects. Applies broken item penalties when applicable.

## Inner Types

- [DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers](DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers.md) -- holds accumulated flat and multiplier modifiers

## Static Methods

```java
@Nonnull
public static Map<DamageCause, DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers> getResistanceModifiers(
    @Nonnull World world,
    @Nonnull ItemContainer inventory,
    boolean canApplyItemStackPenalties,
    @Nullable EffectControllerComponent effectControllerComponent
)
```

Calculates aggregate resistance modifiers from an armor inventory and active entity effects. Returns a map of `DamageCause` to accumulated flat and multiplicative modifiers.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- damage type used as map key for resistances
- [DamageEventSystem](DamageEventSystem.md) -- base class
