# RespawnSystems.CheckBrokenItemsRespawnSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.CheckBrokenItemsRespawnSystem extends RespawnSystems.OnRespawnSystem

Checks if the player's inventory contains any broken items after respawn and sends a warning message if so. The message uses translation key `server.general.repair.itemBrokenOnRespawn` with red color `#ff5555`. Requires the entity to have a `Player` component.

## Related Types

- RespawnSystems -- parent class
- RespawnSystems.OnRespawnSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentRemoved(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
