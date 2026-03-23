# DamageSystems.HitAnimation

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.HitAnimation extends DamageEventSystem

Plays a hurt animation on entities that take positive damage and are not dead. Part of the inspect damage group. Selects the appropriate hurt animation ID based on the entity's movement states and damage cause, then plays it on the `AnimationSlot.Status` slot. Only applies to entities with a `MovementStatesComponent` and without a `DeathComponent`.

## Related Types

- DamageSystems -- parent class
- DamageCause -- used to select the animation variant
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final Query<EntityStore> QUERY
