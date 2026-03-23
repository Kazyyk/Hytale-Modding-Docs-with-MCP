---
title: "com.hypixel.hytale.builtin.mounts"
package: "com.hypixel.hytale.builtin.mounts"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
  - "package-index"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

Built-in mount system providing entity mounting (NPC mounts), block-based seating (chairs, beds), and minecart rail vehicles. The plugin registers ECS components and systems for tracking mount relationships, handling player input while mounted, synchronizing mount state across the network, and managing mount lifecycle (dismounting on death, teleport, entity removal). None of the types in this package are part of the public API surface.

## Plugin Entry Point

| Type | Kind | Description |
|---|---|---|
| [MountPlugin](MountPlugin.md) | class | Main plugin class; singleton entry point registering all mount components, systems, commands, and interactions. |

## API

| Type | Kind | Description |
|---|---|---|
| [BlockMountAPI](BlockMountAPI.md) | class | Static utility for mounting entities onto block-based seats and beds. |
| [BlockMountAPI.BlockMountResult](BlockMountAPI.BlockMountResult.md) | sealed interface | Result type for block mount attempts. |
| [BlockMountAPI.DidNotMount](BlockMountAPI.DidNotMount.md) | enum | Failure reasons when a block mount attempt does not succeed. |
| [BlockMountAPI.Mounted](BlockMountAPI.Mounted.md) | record | Success result carrying the block type and mounted component. |

## ECS Components

| Type | Kind | Store | Description |
|---|---|---|---|
| [MountedComponent](MountedComponent.md) | class | `EntityStore` | Marks an entity as mounted to another entity or a block. |
| [MountedByComponent](MountedByComponent.md) | class | `EntityStore` | Tracks which entities are riding a given mount entity. |
| [NPCMountComponent](NPCMountComponent.md) | class | `EntityStore` | NPC-specific mount state including owner player and anchor offset. |
| [BlockMountComponent](BlockMountComponent.md) | class | `ChunkStore` | Tracks seated entities on a block-based mount point (seat or bed). |
| [MinecartComponent](MinecartComponent.md) | class | `EntityStore` | Minecart entity state including hit tracking and source item. |

## ECS Systems -- MountSystems

| Type | Kind | Description |
|---|---|---|
| [MountSystems](MountSystems.md) | class | Container for entity-mount ECS systems. |
| [MountSystems.TrackerUpdate](MountSystems.TrackerUpdate.md) | class | Ticking system that queues network updates for mounted entity visibility. |
| [MountSystems.TrackerRemove](MountSystems.TrackerRemove.md) | class | Reacts to `MountedComponent` removal by sending remove updates to viewers. |
| [MountSystems.TrackedMounted](MountSystems.TrackedMounted.md) | class | Reacts to `MountedComponent` changes to maintain `MountedByComponent` passenger lists. |
| [MountSystems.PlayerMount](MountSystems.PlayerMount.md) | class | Reacts to `MountedComponent` on player entities to set/clear mount IDs on `PlayerInput`. |
| [MountSystems.HandleMountInput](MountSystems.HandleMountInput.md) | class | Ticking system that processes player movement input while mounted. |
| [MountSystems.MountedEntityDeath](MountSystems.MountedEntityDeath.md) | class | Removes `MountedComponent` when a mounted entity receives `DeathComponent`. |
| [MountSystems.TeleportMountedEntity](MountSystems.TeleportMountedEntity.md) | class | Removes `MountedComponent` when a mounted entity is teleported. |
| [MountSystems.RemoveMounted](MountSystems.RemoveMounted.md) | class | Cleans up mount relationships when a mounted entity is removed from the store. |
| [MountSystems.RemoveMountedBy](MountSystems.RemoveMountedBy.md) | class | Dismounts all passengers when a mount entity is removed from the store. |
| [MountSystems.RemoveMountedHolder](MountSystems.RemoveMountedHolder.md) | class | Strips `MountedComponent` from the holder during entity removal. |
| [MountSystems.RemoveBlockSeat](MountSystems.RemoveBlockSeat.md) | class | Dismounts seated entities when a block seat chunk entity is removed. |
| [MountSystems.EnsureMinecartComponents](MountSystems.EnsureMinecartComponents.md) | class | Ensures minecart entities have `Interactable`, `NetworkId`, and `PrefabCopyableComponent`. |
| [MountSystems.OnMinecartHit](MountSystems.OnMinecartHit.md) | class | Handles damage to minecart entities, destroying them after 3 hits. |

## ECS Systems -- NPCMountSystems

| Type | Kind | Description |
|---|---|---|
| [NPCMountSystems](NPCMountSystems.md) | class | Container for NPC-specific mount ECS systems. |
| [NPCMountSystems.OnAdd](NPCMountSystems.OnAdd.md) | class | Handles `NPCMountComponent` addition: sends mount packet to player or resets role. |
| [NPCMountSystems.DismountOnPlayerDeath](NPCMountSystems.DismountOnPlayerDeath.md) | class | Dismounts the player from their NPC mount when the player dies. |
| [NPCMountSystems.DismountOnMountDeath](NPCMountSystems.DismountOnMountDeath.md) | class | Resets player movement settings when the mounted NPC dies. |
| [NPCMountSystems.OnPlayerRemove](NPCMountSystems.OnPlayerRemove.md) | class | Dismounts the player from their NPC mount when the player entity is removed. |

## Commands

| Type | Kind | Description |
|---|---|---|
| [MountCommand](MountCommand.md) | class | Top-level `/mount` command collection. |
| [DismountCommand](DismountCommand.md) | class | `/mount dismount` subcommand to dismount self or another player. |
| [DismountCommand.DismountOtherCommand](DismountCommand.DismountOtherCommand.md) | class | Variant of dismount targeting a specific player by name. |
| [MountCheckCommand](MountCheckCommand.md) | class | `/mount check` subcommand reporting mount status. |

## Interactions

| Type | Kind | Description |
|---|---|---|
| [MountInteraction](MountInteraction.md) | class | Entity interaction that mounts the player onto a target entity. |
| [SeatingInteraction](SeatingInteraction.md) | class | Block interaction that seats the player on a block with seat/bed mount points. |
| [SpawnMinecartInteraction](SpawnMinecartInteraction.md) | class | Block interaction that spawns a minecart entity at a rail block. |

## NPC Actions

| Type | Kind | Description |
|---|---|---|
| [ActionMount](ActionMount.md) | class | NPC action that enables a player to mount an NPC entity. |
| [BuilderActionMount](BuilderActionMount.md) | class | Builder/config reader for `ActionMount` NPC action definitions. |

## Networking

| Type | Kind | Description |
|---|---|---|
| [MountGamePacketHandler](MountGamePacketHandler.md) | class | Handles `DismountNPC` packets from clients. |
