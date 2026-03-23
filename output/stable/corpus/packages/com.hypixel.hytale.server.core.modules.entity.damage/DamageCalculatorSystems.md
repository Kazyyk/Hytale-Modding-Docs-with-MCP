# DamageCalculatorSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class DamageCalculatorSystems

Contains systems and utilities for calculating damage from interaction-based combat. Provides the `queueDamageCalculator` method that converts a map of relative damage values per cause into an array of Damage events, applying broken weapon penalties when applicable. Also defines the `DAMAGE_SEQUENCE` meta key used to track sequential hit information on damage events.

## Static Fields

- DAMAGE_SEQUENCE | MetaKey<DamageCalculatorSystems.DamageSequence> | Meta key on the Damage meta registry for attaching sequential hit data.

## Static Methods


@Nonnull
public static Damage[] queueDamageCalculator(
    @Nonnull World world,
    @Nonnull Object2FloatMap<DamageCause> relativeDamage,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull CommandBuffer<EntityStore> commandBuffer,
    @Nonnull Damage.Source source,
    @Nullable ItemStack itemInHand
)

Converts a map of `DamageCause` to relative damage values into an array of `Damage` events. For each entry, if the cause is `PHYSICAL` and the item in hand is broken, the damage is reduced by the weapon broken penalty from the world's gameplay config. All produced damage events have `CAN_BE_PREDICTED` set to `true`.

## Inner Types

- DamageCalculatorSystems.DamageSequence -- tracks sequential hit state
- DamageCalculatorSystems.Sequence -- codec-serializable hit counter
- DamageCalculatorSystems.SequenceModifier -- system that applies sequential hit scaling

## Related Types

- Damage -- the damage events produced by this calculator
- DamageCause -- damage type keys in the relative damage map
- DamageModule -- registers the SequenceModifier system

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public static Damage[] queueDamageCalculator(World world, Object2FloatMap<DamageCause> relativeDamage, Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, Damage.Source source, ItemStack itemInHand)

Fields:
public static MetaKey<DamageCalculatorSystems.DamageSequence> DAMAGE_SEQUENCE
