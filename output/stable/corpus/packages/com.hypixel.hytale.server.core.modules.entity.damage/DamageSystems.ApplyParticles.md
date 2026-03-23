# DamageSystems.ApplyParticles

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.ApplyParticles extends DamageEventSystem

Spawns impact particles when a damage event carries `IMPACT_PARTICLES` metadata. Part of the inspect damage group. Spawns world-space particles at the hit location and sends model-space particles as `SpawnModelParticles` packets to nearby players within the configured view distance. If the damage can be predicted, the source player is excluded from receiving world particles to avoid duplication.

## Related Types

- DamageSystems -- parent class
- Damage.Particles -- the particle data read from the meta store
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public SystemGroup<EntityStore> getGroup()

Fields:
private static final ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> PLAYER_SPATIAL_RESOURCE_TYPE
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final ComponentType<EntityStore,NetworkId> NETWORK_ID_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
