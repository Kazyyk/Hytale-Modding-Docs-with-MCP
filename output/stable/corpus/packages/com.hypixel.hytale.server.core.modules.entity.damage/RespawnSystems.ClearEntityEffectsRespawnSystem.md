# RespawnSystems.ClearEntityEffectsRespawnSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.ClearEntityEffectsRespawnSystem extends RespawnSystems.OnRespawnSystem

Clears all active entity effects on respawn via `EffectControllerComponent.clearEffects()`. Requires the entity to have an `EffectControllerComponent`.

## Related Types

- RespawnSystems -- parent class
- DeathSystems.ClearEntityEffects -- similar system on death
- RespawnSystems.OnRespawnSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentRemoved(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
