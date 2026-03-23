# DamageSystems.ArmorKnockbackReduction

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

@Deprecated
public static class DamageSystems.ArmorKnockbackReduction extends DamageEventSystem

Reduces knockback from incoming damage based on the target entity's armor knockback resistance values. Part of the filter damage group. Iterates over the entity's armor container, sums knockback resistance values for the damage cause, and applies a knockback modifier of `max(1 - totalResistance, 0)` to the `KNOCKBACK_COMPONENT` meta.

## Related Types

- DamageSystems -- parent class
- DamageCause -- used to look up per-cause knockback resistance
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage event)
  public void handleInternal(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
