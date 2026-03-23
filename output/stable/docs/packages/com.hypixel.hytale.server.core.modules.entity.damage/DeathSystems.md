---
title: "DeathSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DeathSystems
```

Container class for all ECS systems triggered when an entity dies (when a [DeathComponent](DeathComponent.md) is added to the entity). Systems handle health clearing, interaction cleanup, death animations, item drops, kill feed messages, death screen display, and corpse removal.

## Inner Types

- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- abstract base for component-change systems triggered by `DeathComponent` addition
- [DeathSystems.ClearHealth](DeathSystems.ClearHealth.md) -- sets health to 0
- [DeathSystems.ClearInteractions](DeathSystems.ClearInteractions.md) -- clears interaction manager
- [DeathSystems.ClearEntityEffects](DeathSystems.ClearEntityEffects.md) -- removes all active effects
- [DeathSystems.PlayerKilledPlayer](DeathSystems.PlayerKilledPlayer.md) -- notifies the killer
- [DeathSystems.DropPlayerDeathItems](DeathSystems.DropPlayerDeathItems.md) -- drops items on death
- [DeathSystems.PlayerDropItemsConfig](DeathSystems.PlayerDropItemsConfig.md) -- configures item loss from world config
- [DeathSystems.RunDeathInteractions](DeathSystems.RunDeathInteractions.md) -- executes death interaction chains
- [DeathSystems.KillFeed](DeathSystems.KillFeed.md) -- broadcasts kill feed messages
- [DeathSystems.PlayerDeathScreen](DeathSystems.PlayerDeathScreen.md) -- shows the respawn screen
- [DeathSystems.PlayerDeathMarker](DeathSystems.PlayerDeathMarker.md) -- adds a death marker to the world map
- [DeathSystems.CorpseRemoval](DeathSystems.CorpseRemoval.md) -- removes NPC corpses after a delay
- [DeathSystems.DeathAnimation](DeathSystems.DeathAnimation.md) -- plays death animation on component add
- [DeathSystems.SpawnedDeathAnimation](DeathSystems.SpawnedDeathAnimation.md) -- plays death animation on entity spawn

## Related Types

- [DeathComponent](DeathComponent.md) -- the component whose addition triggers these systems
- [DamageModule](DamageModule.md) -- registers all death systems
- [RespawnSystems](RespawnSystems.md) -- systems triggered on respawn (component removal)
