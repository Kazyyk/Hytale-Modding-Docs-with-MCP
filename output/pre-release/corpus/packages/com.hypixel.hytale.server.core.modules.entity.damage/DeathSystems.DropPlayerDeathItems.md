# DeathSystems.DropPlayerDeathItems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.DropPlayerDeathItems extends DeathSystems.OnDeathSystem

Handles item loss and item dropping when a player dies. Only applies to non-Creative mode players. Processes durability loss first (reduces durability on all non-broken items by the configured percentage), then processes item drops based on the loss mode:

- **ALL**: drops all items from the player's inventory.
- **CONFIGURED**: drops a percentage of each item's quantity (items flagged with `dropsOnDeath()`).
- **NONE**: drops nothing.

Dropped items are spawned as item entities at the player's position (offset upward by 1 block). Also recalculates stat modifiers if any armor broke during durability loss.

## Related Types

- DeathSystems -- parent class
- DeathSystems.PlayerDropItemsConfig -- runs before this system to configure loss parameters
- DeathComponent -- reads loss configuration
- DeathSystems.OnDeathSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Query<EntityStore> QUERY
