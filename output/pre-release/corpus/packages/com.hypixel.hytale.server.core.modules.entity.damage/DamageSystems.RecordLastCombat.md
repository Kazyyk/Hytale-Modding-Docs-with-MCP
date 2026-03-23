# DamageSystems.RecordLastCombat

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.RecordLastCombat extends DamageEventSystem

Records the timestamp of the last combat action on both the damaged entity and the attacker (if applicable). Part of the inspect damage group. Sets `DamageDataComponent.lastCombatAction` on the target, and also on the source entity if the source is an `EntitySource` with a valid reference that has a `DamageDataComponent`.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- checked for bidirectional combat tracking
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public SystemGroup<EntityStore> getGroup()

Fields:
private static final ComponentType<EntityStore,DamageDataComponent> DAMAGE_DATA_COMPONENT_TYPE
private static final ResourceType<EntityStore,TimeResource> TIME_RESOURCE_TYPE
private static final Query<EntityStore> QUERY
