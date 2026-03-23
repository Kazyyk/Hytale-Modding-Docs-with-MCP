# DeathSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class DeathSystems

Container for ECS systems that handle entity death. Each inner system extends `OnDeathSystem` (a `RefChangeSystem` watching `DeathComponent` addition) and performs a specific death action: clearing health, clearing effects, playing death animations, running death interactions, dropping player items, displaying death screen, posting kill feed, tracking death markers, configuring item loss, and notifying killers.

## Inner Classes

- DeathSystems.ClearEntityEffects | Clears all active entity effects on death
- DeathSystems.ClearHealth | Sets health stat to 0 on death
- DeathSystems.ClearInteractions | Clears the interaction manager on death
- DeathSystems.CorpseRemoval | Removes dead non-player entities after corpse timer or immediately
- DeathSystems.DeathAnimation | Plays death animation based on death cause and movement state
- DeathSystems.DropPlayerDeathItems | Drops or damages player inventory items based on death config
- DeathSystems.KillFeed | Sends kill feed messages to all players in the world
- DeathSystems.OnDeathSystem | Abstract base extending RefChangeSystem for DeathComponent
- DeathSystems.PlayerDeathMarker | Records death marker in player's world data
- DeathSystems.PlayerDeathScreen | Opens the respawn page on death
- DeathSystems.PlayerDropItemsConfig | Configures item loss mode from world's DeathConfig
- DeathSystems.PlayerKilledPlayer | Sends kill notification to the attacking player
- DeathSystems.RunDeathInteractions | Executes death interaction chain
- DeathSystems.SpawnedDeathAnimation | Plays death animation for entities that spawn already dead
- DeathSystems.StopVoiceOnDeath | Silences voice chat on death
- DeathSystems.TickCorpseRemoval | Ticks the deferred corpse removal timer

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  private static void playDeathAnimation(Ref<EntityStore> ref, DeathComponent deathComponent, ModelComponent modelComponent, MovementStatesComponent movementStatesComponent, ComponentAccessor<EntityStore> componentAccessor)
