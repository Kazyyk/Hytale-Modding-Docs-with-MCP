# DeathSystems.PlayerDeathMarker

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.PlayerDeathMarker extends DeathSystems.OnDeathSystem

Adds a death marker to the player's world map data when they die, if the world's `WorldMapConfig` has `displayDeathMarker` enabled. Records the position, game time (days since world start), and a unique marker ID in the player's per-world data.

## Related Types

- DeathSystems -- parent class
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
