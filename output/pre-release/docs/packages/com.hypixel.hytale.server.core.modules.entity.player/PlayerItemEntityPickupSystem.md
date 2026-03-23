---
title: "PlayerItemEntityPickupSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerItemEntityPickupSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "item"
  - "pickup"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerItemEntityPickupSystem extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that handles players picking up item entities from the world. Queries item entities that have an `ItemComponent` and `TransformComponent` but lack `Interactable`, `PickupItemComponent`, and `PreventPickup` components.

Each tick, for items past their pickup delay and throttle, it searches for the nearest player within pickup radius using the player spatial resource. If the item has a Pickup interaction defined, it executes the interaction chain. Otherwise, it attempts to add the item to the nearest player's inventory via `Player.giveItem()`. Handles partial pickups (stack splits), death checking, despawn timer updates, and spawns visual pickup effects.

Runs single-threaded and depends on `PlayerSpatialSystem`.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- other player systems
