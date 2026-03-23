# DamageSystems.WieldingKnockbackReduction

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

@Deprecated
public static class DamageSystems.WieldingKnockbackReduction extends DamageEventSystem

Reduces knockback when the target entity is actively wielding an item. Part of the filter damage group. Similar to DamageSystems.WieldingDamageReduction but applies knockback modifiers instead of damage modifiers. Checks both standard and angled wielding knockback modifier maps, and applies the modifiers to the `KNOCKBACK_COMPONENT` meta.

## Related Types

- DamageSystems -- parent class
- DamageSystems.WieldingDamageReduction -- companion system for damage
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage event)
  public void handleInternal(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
