# DamageSystems.CanBreathe

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DelayedEntitySystem<EntityStore>

public static class DamageSystems.CanBreathe extends DelayedEntitySystem<EntityStore>

A ticking system in the gather damage group that inflicts drowning or suffocation damage on living entities that cannot breathe. Ticks every 1.0 seconds. Checks the entity's oxygen stat: if at minimum and the entity cannot breathe at its breathing height, deals 10 damage (DROWNING) if in fluid, or 20 damage (SUFFOCATION) if in a solid block.

## Static Fields

- DAMAGE_AMOUNT_DROWNING | float | Drowning damage per tick: `10.0`.
- DAMAGE_AMOUNT_SUFFOCATION | float | Suffocation damage per tick: `20.0`.

## Related Types

- DamageSystems -- parent class
- DamageCause -- uses `DROWNING` and `SUFFOCATION` causes
- Damage -- the damage events generated

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public boolean isParallel(int archetypeChunkSize, int taskCount)

Fields:
private static final float DAMAGE_AMOUNT_DROWNING
private static final float DAMAGE_AMOUNT_SUFFOCATION
private static final ComponentType<EntityStore,ModelComponent> MODEL_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
