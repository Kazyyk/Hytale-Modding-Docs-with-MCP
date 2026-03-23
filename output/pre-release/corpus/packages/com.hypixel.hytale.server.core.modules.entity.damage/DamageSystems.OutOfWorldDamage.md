# DamageSystems.OutOfWorldDamage

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DelayedEntitySystem<EntityStore>

public static class DamageSystems.OutOfWorldDamage extends DelayedEntitySystem<EntityStore>

A ticking system in the gather damage group that damages entities below Y=0. Ticks every 1.0 seconds. Entities below Y=-32 are instantly killed with maximum damage and a `DeathComponent` is added directly. Entities between Y=0 and Y=-32 take 50 damage per tick with `OUT_OF_WORLD` cause.

## Related Types

- DamageSystems -- parent class
- DamageCause -- uses `OUT_OF_WORLD` cause
- DeathComponent -- added directly for entities far below the world

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public boolean isParallel(int archetypeChunkSize, int taskCount)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
