# DeathSystems.DeathAnimation

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.DeathAnimation extends DeathSystems.OnDeathSystem

Plays the death animation on a living entity when it dies. Runs before `EntityStatsSystems.EntityTrackerUpdate` and after DeathSystems.ClearEntityEffects. Selects the animation based on the entity's movement states and the death cause, then plays it on `AnimationSlot.Status`.

## Related Types

- DeathSystems -- parent class
- DeathSystems.SpawnedDeathAnimation -- plays animation when a dead entity is spawned into the world
- DamageCause -- provides the death animation ID
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
