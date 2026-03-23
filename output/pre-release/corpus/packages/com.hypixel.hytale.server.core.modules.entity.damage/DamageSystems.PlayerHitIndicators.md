# DamageSystems.PlayerHitIndicators

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.PlayerHitIndicators extends DamageEventSystem

Sends a `DamageInfo` packet to the damaged player when they take damage from an entity source. Part of the inspect damage group. The packet contains the source entity's position, the damage amount, and the damage cause in protocol format. Only applies to entities with a `PlayerRef` component.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- required source type for hit indicators
- DamageCause -- converted to packet format via `toPacket()`
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
