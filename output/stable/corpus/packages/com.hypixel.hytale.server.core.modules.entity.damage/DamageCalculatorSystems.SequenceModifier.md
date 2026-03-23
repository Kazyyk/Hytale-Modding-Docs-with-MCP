# DamageCalculatorSystems.SequenceModifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageCalculatorSystems.SequenceModifier extends DamageEventSystem

A DamageEventSystem that applies sequential hit damage scaling. Runs after the gather and filter damage groups but before DamageSystems.ApplyDamage. For each damage event with a `DAMAGE_SEQUENCE` meta entry, it reduces damage based on the number of sequential hits using the damage calculator's `sequentialModifierStep` and `sequentialModifierMinimum`. Also processes entity stat modifications on hit (e.g., restoring stamina to the attacker).

## Methods


@Nonnull
@Override
public Set<Dependency<EntityStore>> getDependencies()

Returns dependencies ensuring execution after gather/filter groups and before `ApplyDamage`.


@Nonnull
@Override
public Query<EntityStore> getQuery()

Returns an empty archetype query (matches all entities).


public void handle(int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)

If the damage amount is positive and the event has a `DAMAGE_SEQUENCE` meta, applies sequential scaling: `amount * max(1 - step * hits, minimum)`. Increments the hit counter and processes any `EntityStatOnHit` entries on the source entity.

## Related Types

- DamageCalculatorSystems -- parent class
- DamageCalculatorSystems.DamageSequence -- the meta data read by this system
- DamageEventSystem -- base class
- DamageSystems.ApplyDamage -- runs after this system

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private final Set<Dependency<EntityStore>> dependencies
