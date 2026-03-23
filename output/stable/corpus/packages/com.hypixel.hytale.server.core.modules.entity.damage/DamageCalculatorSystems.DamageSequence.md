# DamageCalculatorSystems.DamageSequence

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public static class DamageCalculatorSystems.DamageSequence

Tracks the state of sequential hits within a damage interaction chain. Attached to Damage events via the `DamageCalculatorSystems.DAMAGE_SEQUENCE` meta key. Wraps a Sequence hit counter, a `DamageCalculator` configuration, and optional entity stat modifications on hit.

## Constructor


public DamageSequence(@Nonnull DamageCalculatorSystems.Sequence sequence, @Nonnull DamageCalculator damageCalculator)

Creates a damage sequence with a hit counter and damage calculator configuration.

## Methods


public int getSequentialHits()

Returns the current number of sequential hits from the underlying `Sequence`.


public void addSequentialHit()

Increments the sequential hit counter.


@Nonnull
public DamageCalculator getDamageCalculator()

Returns the `DamageCalculator` configuration controlling sequential damage scaling.


@Nullable
public DamageEntityInteraction.EntityStatOnHit[] getEntityStatOnHit()

Returns the array of entity stat modifications to apply on each hit, or `null`.


public void setEntityStatOnHit(@Nullable DamageEntityInteraction.EntityStatOnHit[] entityStatOnHit)

Sets the entity stat modifications to apply on hit.

## Related Types

- DamageCalculatorSystems -- parent class
- DamageCalculatorSystems.Sequence -- the hit counter
- DamageCalculatorSystems.SequenceModifier -- system that reads this data

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public int getSequentialHits()
  public void addSequentialHit()
  public DamageCalculator getDamageCalculator()
  public DamageEntityInteraction.EntityStatOnHit[] getEntityStatOnHit()
  public void setEntityStatOnHit(DamageEntityInteraction.EntityStatOnHit[] entityStatOnHit)

Fields:
private final DamageCalculatorSystems.Sequence sequence
private final DamageCalculator damageCalculator
private DamageEntityInteraction.EntityStatOnHit[] entityStatOnHit
