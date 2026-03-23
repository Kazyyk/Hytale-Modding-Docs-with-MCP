# RespawnSystems.ClearRespawnUI

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.ClearRespawnUI extends RespawnSystems.OnRespawnSystem

Closes the respawn page on the player's page manager by setting the page to `Page.None`. Requires the entity to have a `Player` component.

## Related Types

- RespawnSystems -- parent class
- DeathSystems.PlayerDeathScreen -- opens the respawn page on death
- RespawnSystems.OnRespawnSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 52 more)

Complete API:
  public void onComponentRemoved(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
