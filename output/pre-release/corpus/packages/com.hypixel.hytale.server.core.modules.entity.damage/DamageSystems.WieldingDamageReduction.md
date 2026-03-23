# DamageSystems.WieldingDamageReduction

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

@Deprecated
public static class DamageSystems.WieldingDamageReduction extends DamageEventSystem

Reduces damage when the target entity is actively wielding an item (e.g., blocking with a shield). Part of the filter damage group. Checks the entity's current wielding interaction for damage modifiers keyed by damage cause index. If the source is an entity, also checks angled wielding for directional blocking (requires the attacker to be within the shield's angle arc). Applies blocked effects, sets the `BLOCKED` meta flag, and may initiate a blocked interaction chain.

## Related Types

- DamageSystems -- parent class
- DamageSystems.WieldingKnockbackReduction -- companion system for knockback
- Damage -- sets `BLOCKED` meta key
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
