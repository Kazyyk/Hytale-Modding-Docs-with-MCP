# DeathSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class DeathSystems

Container class for all ECS systems triggered when an entity dies (when a DeathComponent is added to the entity). Systems handle health clearing, interaction cleanup, death animations, item drops, kill feed messages, death screen display, and corpse removal.

## Inner Types

- DeathSystems.OnDeathSystem -- abstract base for component-change systems triggered by `DeathComponent` addition
- DeathSystems.ClearHealth -- sets health to 0
- DeathSystems.ClearInteractions -- clears interaction manager
- DeathSystems.ClearEntityEffects -- removes all active effects
- DeathSystems.PlayerKilledPlayer -- notifies the killer
- DeathSystems.DropPlayerDeathItems -- drops items on death
- DeathSystems.PlayerDropItemsConfig -- configures item loss from world config
- DeathSystems.RunDeathInteractions -- executes death interaction chains
- DeathSystems.KillFeed -- broadcasts kill feed messages
- DeathSystems.PlayerDeathScreen -- shows the respawn screen
- DeathSystems.PlayerDeathMarker -- adds a death marker to the world map
- DeathSystems.CorpseRemoval -- removes NPC corpses after a delay
- DeathSystems.DeathAnimation -- plays death animation on component add
- DeathSystems.SpawnedDeathAnimation -- plays death animation on entity spawn

## Related Types

- DeathComponent -- the component whose addition triggers these systems
- DamageModule -- registers all death systems
- RespawnSystems -- systems triggered on respawn (component removal)

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  private static void playDeathAnimation(Ref<EntityStore> ref, DeathComponent deathComponent, ModelComponent modelComponent, MovementStatesComponent movementStatesComponent, ComponentAccessor<EntityStore> componentAccessor)
