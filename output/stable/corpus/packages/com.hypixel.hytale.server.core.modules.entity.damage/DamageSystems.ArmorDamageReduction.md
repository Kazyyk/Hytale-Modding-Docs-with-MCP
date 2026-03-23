# DamageSystems.ArmorDamageReduction

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

@Deprecated
public static class DamageSystems.ArmorDamageReduction extends DamageEventSystem

Reduces incoming damage based on the target entity's equipped armor resistances. Part of the filter damage group. For each armor piece, collects flat and multiplicative resistance modifiers per damage cause. If the cause does not bypass resistances, applies flat reduction first then multiplicative reduction. Walks the damage cause inheritance chain to apply parent resistances. Also includes resistance contributions from active entity effects. Applies broken item penalties when applicable.

## Inner Types

- DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers -- holds accumulated flat and multiplier modifiers

## Static Methods


@Nonnull
public static Map<DamageCause, DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers> getResistanceModifiers(
    @Nonnull World world,
    @Nonnull ItemContainer inventory,
    boolean canApplyItemStackPenalties,
    @Nullable EffectControllerComponent effectControllerComponent
)

Calculates aggregate resistance modifiers from an armor inventory and active entity effects. Returns a map of `DamageCause` to accumulated flat and multiplicative modifiers.

## Related Types

- DamageSystems -- parent class
- DamageCause -- damage type used as map key for resistances
- DamageEventSystem -- base class
