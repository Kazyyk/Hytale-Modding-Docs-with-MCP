# DamageSystems.DamageStamina

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem | Implements: EntityStatsSystems.StatModifyingSystem

public static class DamageSystems.DamageStamina extends DamageEventSystem implements EntityStatsSystems.StatModifyingSystem

Drains stamina from the damaged entity when they block a hit while wielding an item with a stamina cost. Part of the inspect damage group. If the `BLOCKED` meta is true and the entity's current wielding interaction has a `StaminaCost`, computes the stamina to consume from the initial damage amount, applies the optional `STAMINA_DRAIN_MULTIPLIER`, and subtracts from the stamina stat.

## Related Types

- DamageSystems -- parent class
- Damage -- reads `BLOCKED` and `STAMINA_DRAIN_MULTIPLIER` meta keys
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage event)
  public void handleInternal(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final Query<EntityStore> QUERY
