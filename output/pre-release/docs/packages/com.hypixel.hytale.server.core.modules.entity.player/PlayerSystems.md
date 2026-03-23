---
title: "PlayerSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerSystems
```

Top-level container class for the core ECS systems that manage player entity lifecycle, input processing, nameplate display, kill feed messages, and reference updates.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `LOGGER` | `HytaleLogger` | Logger for player system events. |

## Inner Types

- [PlayerSystems.BlockPausedMovementSystem](PlayerSystems.BlockPausedMovementSystem.md) -- blocks player movement when paused
- [PlayerSystems.EnsureEffectControllerSystem](PlayerSystems.EnsureEffectControllerSystem.md) -- ensures effect controller on player add
- [PlayerSystems.EnsurePlayerInput](PlayerSystems.EnsurePlayerInput.md) -- ensures player input component on add/remove
- [PlayerSystems.EnsureUniqueItemUsagesSystem](PlayerSystems.EnsureUniqueItemUsagesSystem.md) -- ensures unique item usages component
- [PlayerSystems.KillFeedDecedentEventSystem](PlayerSystems.KillFeedDecedentEventSystem.md) -- provides victim name for kill feed
- [PlayerSystems.KillFeedKillerEventSystem](PlayerSystems.KillFeedKillerEventSystem.md) -- provides killer name for kill feed
- [PlayerSystems.NameplateRefChangeSystem](PlayerSystems.NameplateRefChangeSystem.md) -- updates nameplate on display name change
- [PlayerSystems.NameplateRefSystem](PlayerSystems.NameplateRefSystem.md) -- initializes nameplate on entity add
- [PlayerSystems.PlayerAddedSystem](PlayerSystems.PlayerAddedSystem.md) -- full player initialization on world join
- [PlayerSystems.PlayerRemovedSystem](PlayerSystems.PlayerRemovedSystem.md) -- cleanup on player removal
- [PlayerSystems.PlayerSpawnedSystem](PlayerSystems.PlayerSpawnedSystem.md) -- sends initial entity state to client
- [PlayerSystems.ProcessPlayerInput](PlayerSystems.ProcessPlayerInput.md) -- drains and applies input queue
- [PlayerSystems.UpdatePlayerRef](PlayerSystems.UpdatePlayerRef.md) -- updates player ref position each tick
