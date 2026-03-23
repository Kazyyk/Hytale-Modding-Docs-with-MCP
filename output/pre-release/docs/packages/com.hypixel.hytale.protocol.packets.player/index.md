---
title: "com.hypixel.hytale.protocol.packets.player"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.player"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "protocol"
  - "packet"
  - "player"
---

**Package:** `com.hypixel.hytale.protocol.packets.player`

Player-related network packets for the Hytale protocol. These packets handle client-server communication for player movement, block placement, hotbar management, game mode changes, debug visualization, map markers, player preferences, and world join/teleport operations.

All types in this package implement `Packet` plus a directional marker (`ToClientPacket` or `ToServerPacket`).

## Client-to-Server Packets

| Type | Packet ID | Description |
|---|---|---|
| [ClientMovement](ClientMovement.md) | 108 | Per-tick movement state, position, and orientation. |
| [ClientPlaceBlock](ClientPlaceBlock.md) | 117 | Block placement request with position and rotation. |
| [ClientReady](ClientReady.md) | 105 | Client readiness signal for chunks and gameplay. |
| [LoadHotbar](LoadHotbar.md) | 106 | Request to load an inventory row into the hotbar. |
| [SaveHotbar](SaveHotbar.md) | 107 | Request to persist the current hotbar. |
| [MouseInteraction](MouseInteraction.md) | 111 | Mouse input with slot, item, and world interaction. |
| [RemoveMapMarker](RemoveMapMarker.md) | 119 | Map marker removal request. |
| [SyncPlayerPreferences](SyncPlayerPreferences.md) | 116 | Player preference synchronization. |

## Server-to-Client Packets

| Type | Packet ID | Description |
|---|---|---|
| [SetClientId](SetClientId.md) | 100 | Assigns the player's client ID. |
| [SetGameMode](SetGameMode.md) | 101 | Changes the player's game mode. |
| [SetMovementStates](SetMovementStates.md) | 102 | Applies movement state flags. |
| [SetBlockPlacementOverride](SetBlockPlacementOverride.md) | 103 | Toggles block placement override. |
| [JoinWorld](JoinWorld.md) | 104 | World join notification with UUID. |
| [ClientTeleport](ClientTeleport.md) | 109 | Teleports the player. |
| [UpdateMovementSettings](UpdateMovementSettings.md) | 110 | Updates movement physics parameters. |
| [DamageInfo](DamageInfo.md) | 112 | Damage feedback with source and cause. |
| [ReticleEvent](ReticleEvent.md) | 113 | Reticle animation trigger. |
| [DisplayDebug](DisplayDebug.md) | 114 | Debug shape visualization. |
| [ClearDebugShapes](ClearDebugShapes.md) | 115 | Clears all debug shapes. |
| [UpdateMemoriesFeatureStatus](UpdateMemoriesFeatureStatus.md) | 118 | Memories feature unlock status. |
