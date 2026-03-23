# RespawnSystems.ClearInteractionsRespawnSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.ClearInteractionsRespawnSystem extends RespawnSystems.OnRespawnSystem

Clears the entity's `InteractionManager` on respawn, cancelling any active interaction chains. Requires the entity to have an `InteractionManager` component.

## Related Types

- RespawnSystems -- parent class
- DeathSystems.ClearInteractions -- similar system on death
- RespawnSystems.OnRespawnSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentRemoved(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
