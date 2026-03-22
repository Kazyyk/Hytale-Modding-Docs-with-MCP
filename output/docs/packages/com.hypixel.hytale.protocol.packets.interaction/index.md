---
title: "com.hypixel.hytale.protocol.packets.interaction"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.interaction"
fqcn: "com.hypixel.hytale.protocol.packets.interaction"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol.packets.interaction`

Interaction chain network packets for the Hytale protocol. Handles synchronization and cancellation of interaction chains (sequences of player interactions with the world), plus NPC mount and dismount operations.

## Types

| Type | Kind | Description |
|---|---|---|
| [CancelInteractionChain](CancelInteractionChain.md) | class | Server-to-client packet (ID 291) canceling an active interaction chain. |
| [DismountNPC](DismountNPC.md) | class | Client-to-server packet (ID 295) requesting dismount from a mounted NPC. |
| [MountNPC](MountNPC.md) | class | Server-to-client packet (ID 294) instructing the client to mount an NPC entity, specified by entity reference. |
| [PlayInteractionFor](PlayInteractionFor.md) | class | Server-to-client packet (ID 293) instructing the client to play an interaction for a specific entity. |
| [SyncInteractionChain](SyncInteractionChain.md) | class | Server-to-client packet (ID 290) synchronizing a single interaction chain state. |
| [SyncInteractionChains](SyncInteractionChains.md) | class | Server-to-client packet (ID 292) synchronizing multiple interaction chains as an array of `SyncInteractionChain` packets. |
