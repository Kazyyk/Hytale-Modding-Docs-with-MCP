# DeathSystems.KillFeed

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.KillFeed extends DeathSystems.OnDeathSystem

Broadcasts kill feed messages to all players in the world when an entity dies. Dispatches three cancellable KillFeedEvent events in sequence:
1. `KillerMessage` on the source entity (if entity source) -- can set/cancel the killer's name display.
2. `DecedentMessage` on the dying entity -- can set/cancel the victim's name display.
3. `Display` on the dying entity -- controls the final broadcast targets and icon.

If not cancelled, sends a `KillFeedMessage` packet to all broadcast target players.

## Related Types

- DeathSystems -- parent class
- KillFeedEvent -- the events dispatched
- KillFeedEvent.KillerMessage -- killer name event
- KillFeedEvent.DecedentMessage -- victim name event
- KillFeedEvent.Display -- final display event
- Damage -- reads `DEATH_ICON` meta key
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
