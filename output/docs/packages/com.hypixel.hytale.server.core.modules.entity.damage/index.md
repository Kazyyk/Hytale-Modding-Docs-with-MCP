---
title: "com.hypixel.hytale.server.core.modules.entity.damage"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "death"
  - "respawn"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

The damage package implements the server's damage pipeline, death handling, and respawn systems. It defines the [Damage](Damage.md) event that flows through a three-phase processing chain (gather, filter, inspect), the [DamageCause](DamageCause.md) asset system for damage types, and the [DeathComponent](DeathComponent.md) that triggers death and respawn behavior. All systems are registered by [DamageModule](DamageModule.md).

## API Surface Types

| Type | Kind | Description |
|---|---|---|
| [Damage](Damage.md) | class | Cancellable ECS damage event with metadata store. |
| [Damage.Source](Damage.Source.md) | interface | Identifies the origin of damage and generates death messages. |
| [Damage.EntitySource](Damage.EntitySource.md) | class | Damage from another entity. |
| [Damage.ProjectileSource](Damage.ProjectileSource.md) | class | Damage from a projectile with a shooter. |
| [Damage.CommandSource](Damage.CommandSource.md) | class | Damage from a server command. |
| [Damage.EnvironmentSource](Damage.EnvironmentSource.md) | class | Damage from an environmental hazard. |
| [Damage.Particles](Damage.Particles.md) | class | Impact particle configuration. |
| [Damage.SoundEffect](Damage.SoundEffect.md) | class | Impact sound effect wrapper. |
| [Damage.CameraEffect](Damage.CameraEffect.md) | record | Camera effect on hit. |
| [DamageCause](DamageCause.md) | class | JSON asset defining a damage type. |

## Internal Types -- Module

| Type | Kind | Description |
|---|---|---|
| [DamageModule](DamageModule.md) | class | Core plugin that registers all damage systems. |
| [DamageModule.OrderGatherFilter](DamageModule.OrderGatherFilter.md) | class | Deprecated ordering system. |
| [DamageEventSystem](DamageEventSystem.md) | abstract class | Base class for damage event handler systems. |

## Internal Types -- Damage Systems

| Type | Kind | Description |
|---|---|---|
| [DamageSystems](DamageSystems.md) | class | Container for all damage processing systems. |
| [DamageSystems.ApplyDamage](DamageSystems.ApplyDamage.md) | class | Subtracts health and triggers death. |
| [DamageSystems.CanBreathe](DamageSystems.CanBreathe.md) | class | Drowning and suffocation damage. |
| [DamageSystems.OutOfWorldDamage](DamageSystems.OutOfWorldDamage.md) | class | Damage below the world boundary. |
| [DamageSystems.FallDamagePlayers](DamageSystems.FallDamagePlayers.md) | class | Fall damage for players. |
| [DamageSystems.FallDamageNPCs](DamageSystems.FallDamageNPCs.md) | class | Fall damage for NPCs. |
| [DamageSystems.FilterPlayerWorldConfig](DamageSystems.FilterPlayerWorldConfig.md) | class | Cancels player damage when disabled. |
| [DamageSystems.FilterNPCWorldConfig](DamageSystems.FilterNPCWorldConfig.md) | class | Cancels NPC damage when disabled. |
| [DamageSystems.FilterUnkillable](DamageSystems.FilterUnkillable.md) | class | Cancels damage on unkillable entities. |
| [DamageSystems.PlayerDamageFilterSystem](DamageSystems.PlayerDamageFilterSystem.md) | class | Spawn protection and PvP checks. |
| [DamageSystems.ArmorDamageReduction](DamageSystems.ArmorDamageReduction.md) | class | Armor damage resistance. |
| [DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers](DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers.md) | class | Resistance modifier accumulator. |
| [DamageSystems.ArmorKnockbackReduction](DamageSystems.ArmorKnockbackReduction.md) | class | Armor knockback resistance. |
| [DamageSystems.WieldingDamageReduction](DamageSystems.WieldingDamageReduction.md) | class | Shield/blocking damage reduction. |
| [DamageSystems.WieldingKnockbackReduction](DamageSystems.WieldingKnockbackReduction.md) | class | Shield/blocking knockback reduction. |
| [DamageSystems.HackKnockbackValues](DamageSystems.HackKnockbackValues.md) | class | Deprecated knockback velocity scaler. |
| [DamageSystems.ApplyParticles](DamageSystems.ApplyParticles.md) | class | Spawns impact particles. |
| [DamageSystems.ApplySoundEffects](DamageSystems.ApplySoundEffects.md) | class | Plays impact sounds. |
| [DamageSystems.HitAnimation](DamageSystems.HitAnimation.md) | class | Plays hurt animations. |
| [DamageSystems.DamageArmor](DamageSystems.DamageArmor.md) | class | Reduces armor durability. |
| [DamageSystems.DamageAttackerTool](DamageSystems.DamageAttackerTool.md) | class | Reduces weapon durability. |
| [DamageSystems.DamageStamina](DamageSystems.DamageStamina.md) | class | Drains stamina on block. |
| [DamageSystems.RecordLastCombat](DamageSystems.RecordLastCombat.md) | class | Records combat timestamps. |
| [DamageSystems.TrackLastDamage](DamageSystems.TrackLastDamage.md) | class | Records last damage time. |
| [DamageSystems.PlayerHitIndicators](DamageSystems.PlayerHitIndicators.md) | class | Sends hit indicator packets. |
| [DamageSystems.ReticleEvents](DamageSystems.ReticleEvents.md) | class | Sends reticle hit/kill events. |
| [DamageSystems.EntityUIEvents](DamageSystems.EntityUIEvents.md) | class | Sends combat text updates. |

## Internal Types -- Damage Calculator

| Type | Kind | Description |
|---|---|---|
| [DamageCalculatorSystems](DamageCalculatorSystems.md) | class | Sequential hit damage calculation. |
| [DamageCalculatorSystems.DamageSequence](DamageCalculatorSystems.DamageSequence.md) | class | Sequential hit state tracker. |
| [DamageCalculatorSystems.Sequence](DamageCalculatorSystems.Sequence.md) | class | Serializable hit counter. |
| [DamageCalculatorSystems.SequenceModifier](DamageCalculatorSystems.SequenceModifier.md) | class | Sequential damage scaling system. |

## Internal Types -- Death

| Type | Kind | Description |
|---|---|---|
| [DeathComponent](DeathComponent.md) | class | ECS component marking an entity as dead. |
| [DeathItemLoss](DeathItemLoss.md) | class | Item loss configuration snapshot. |
| [DeferredCorpseRemoval](DeferredCorpseRemoval.md) | class | Timer component for delayed corpse removal. |
| [DeathSystems](DeathSystems.md) | class | Container for death processing systems. |
| [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) | abstract class | Base class for death component-change systems. |
| [DeathSystems.ClearHealth](DeathSystems.ClearHealth.md) | class | Sets health to 0. |
| [DeathSystems.ClearInteractions](DeathSystems.ClearInteractions.md) | class | Clears interaction manager. |
| [DeathSystems.ClearEntityEffects](DeathSystems.ClearEntityEffects.md) | class | Removes active effects. |
| [DeathSystems.PlayerKilledPlayer](DeathSystems.PlayerKilledPlayer.md) | class | Notifies killer of PvP kill. |
| [DeathSystems.DropPlayerDeathItems](DeathSystems.DropPlayerDeathItems.md) | class | Drops items on death. |
| [DeathSystems.PlayerDropItemsConfig](DeathSystems.PlayerDropItemsConfig.md) | class | Configures item loss from world. |
| [DeathSystems.RunDeathInteractions](DeathSystems.RunDeathInteractions.md) | class | Executes death interaction chain. |
| [DeathSystems.KillFeed](DeathSystems.KillFeed.md) | class | Broadcasts kill feed messages. |
| [DeathSystems.PlayerDeathScreen](DeathSystems.PlayerDeathScreen.md) | class | Shows respawn screen. |
| [DeathSystems.PlayerDeathMarker](DeathSystems.PlayerDeathMarker.md) | class | Adds death marker to map. |
| [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md) | class | Removes NPC corpses. |
| [DeathSystems.DeathAnimation](DeathSystems.DeathAnimation.md) | class | Plays death animation. |
| [DeathSystems.SpawnedDeathAnimation](DeathSystems.SpawnedDeathAnimation.md) | class | Death animation on spawn. |

## Internal Types -- Respawn

| Type | Kind | Description |
|---|---|---|
| [RespawnSystems](RespawnSystems.md) | class | Container for respawn systems. |
| [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) | abstract class | Base class for respawn systems. |
| [RespawnSystems.ResetStatsRespawnSystem](RespawnSystems.ResetStatsRespawnSystem.md) | class | Resets all stats. |
| [RespawnSystems.ResetPlayerRespawnSystem](RespawnSystems.ResetPlayerRespawnSystem.md) | class | Records spawn time. |
| [RespawnSystems.ClearEntityEffectsRespawnSystem](RespawnSystems.ClearEntityEffectsRespawnSystem.md) | class | Clears effects on respawn. |
| [RespawnSystems.ClearInteractionsRespawnSystem](RespawnSystems.ClearInteractionsRespawnSystem.md) | class | Clears interactions on respawn. |
| [RespawnSystems.CheckBrokenItemsRespawnSystem](RespawnSystems.CheckBrokenItemsRespawnSystem.md) | class | Warns about broken items. |
| [RespawnSystems.ClearRespawnUI](RespawnSystems.ClearRespawnUI.md) | class | Closes respawn page. |

## Internal Types -- Events

| Type | Kind | Description |
|---|---|---|
| [KillFeedEvent](KillFeedEvent.md) | class | Kill feed event container. |
| [KillFeedEvent.KillerMessage](KillFeedEvent.KillerMessage.md) | class | Killer name event. |
| [KillFeedEvent.DecedentMessage](KillFeedEvent.DecedentMessage.md) | class | Victim name event. |
| [KillFeedEvent.Display](KillFeedEvent.Display.md) | class | Final display event. |

## Internal Types -- Commands

| Type | Kind | Description |
|---|---|---|
| [DesyncDamageCommand](DesyncDamageCommand.md) | class | Debug command to toggle damage desync. |
