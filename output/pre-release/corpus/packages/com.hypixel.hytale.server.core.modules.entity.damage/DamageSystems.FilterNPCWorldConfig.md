# DamageSystems.FilterNPCWorldConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.FilterNPCWorldConfig extends DamageEventSystem

Cancels all incoming damage to NPC entities when NPC incoming damage is disabled in the world's combat config. Part of the filter damage group. Also removes any knockback component from the entity when damage is cancelled.

## Related Types

- DamageSystems -- parent class
- DamageSystems.FilterPlayerWorldConfig -- equivalent system for players
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage event)
