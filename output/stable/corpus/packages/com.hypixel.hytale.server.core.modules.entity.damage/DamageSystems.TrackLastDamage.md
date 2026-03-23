# DamageSystems.TrackLastDamage

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.TrackLastDamage extends DamageEventSystem

Records the timestamp of the last damage received on the target entity's `DamageDataComponent`. Part of the inspect damage group. Only applies to living entities that have a `DamageDataComponent`.

## Related Types

- DamageSystems -- parent class
- DamageSystems.RecordLastCombat -- similar system for bidirectional combat tracking
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final ComponentType<EntityStore,DamageDataComponent> DAMAGE_DATA_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
