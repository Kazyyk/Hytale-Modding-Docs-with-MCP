---
title: "DeathSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:51Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DeathSystems
```

Container for ECS systems that handle entity death. Each inner system extends `OnDeathSystem` (a `RefChangeSystem` watching `DeathComponent` addition) and performs a specific death action: clearing health, clearing effects, playing death animations, running death interactions, dropping player items, displaying death screen, posting kill feed, tracking death markers, configuring item loss, and notifying killers.

## Inner Classes

| Class | Description |
|---|---|
| DeathSystems.ClearEntityEffects | Clears all active entity effects on death |
| DeathSystems.ClearHealth | Sets health stat to 0 on death |
| DeathSystems.ClearInteractions | Clears the interaction manager on death |
| [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md) | Removes dead non-player entities after corpse timer or immediately |
| DeathSystems.DeathAnimation | Plays death animation based on death cause and movement state |
| DeathSystems.DropPlayerDeathItems | Drops or damages player inventory items based on death config |
| DeathSystems.KillFeed | Sends kill feed messages to all players in the world |
| DeathSystems.OnDeathSystem | Abstract base extending RefChangeSystem for DeathComponent |
| DeathSystems.PlayerDeathMarker | Records death marker in player's world data |
| DeathSystems.PlayerDeathScreen | Opens the respawn page on death |
| DeathSystems.PlayerDropItemsConfig | Configures item loss mode from world's DeathConfig |
| DeathSystems.PlayerKilledPlayer | Sends kill notification to the attacking player |
| DeathSystems.RunDeathInteractions | Executes death interaction chain |
| DeathSystems.SpawnedDeathAnimation | Plays death animation for entities that spawn already dead |
| [DeathSystems.StopVoiceOnDeath](DeathSystems.StopVoiceOnDeath.md) | Silences voice chat on death |
| [DeathSystems.TickCorpseRemoval](DeathSystems.TickCorpseRemoval.md) | Ticks the deferred corpse removal timer |
