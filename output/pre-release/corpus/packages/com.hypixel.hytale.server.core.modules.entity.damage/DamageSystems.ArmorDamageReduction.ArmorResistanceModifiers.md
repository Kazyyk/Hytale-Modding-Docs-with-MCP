# DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public static class DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers

Accumulates flat and multiplicative damage resistance modifiers from armor pieces and entity effects. Used as the value type in the resistance modifier map computed by DamageSystems.ArmorDamageReduction.

## Fields

- flatModifier | int | public | Accumulated flat damage reduction.
- multiplierModifier | float | public | Accumulated multiplicative damage reduction (0.0 = no reduction, 1.0 = full reduction).
- inheritedParentId | DamageCause | public | Parent damage cause for inheritance chain traversal, or `null`.

## Related Types

- DamageSystems.ArmorDamageReduction -- parent class that creates and populates these modifiers
- DamageCause -- used for inheritance chain traversal

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 52 more)

Fields:
public int flatModifier
public float multiplierModifier
public DamageCause inheritedParentId
