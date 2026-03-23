---
title: "GamePacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.handlers.game"
fqcn: "com.hypixel.hytale.server.core.io.handlers.game.GamePacketHandler"
api_surface: false
extends: "GenericPacketHandler"
implements:
  - "IPacketHandler"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:19:37Z"
tags:
  - "networking"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers.game`

```java
public class GamePacketHandler extends GenericPacketHandler implements IPacketHandler
```

The main packet handler for authenticated, in-game players. Registers handlers for all gameplay-related packets (movement, chat, interactions, windows, inventory, camera, machinima, world map, etc.). Maintains a reference to the player's `PlayerRef` and queues interaction packets for world-thread processing.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `GamePacketHandler(Channel channel, ProtocolVersion protocolVersion, PlayerAuthentication auth)` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Deque<SyncInteractionChain>` | `getInteractionPacketQueue()` |
| `public` | `PlayerRef` | `getPlayerRef()` |
| `public` | `void` | `setPlayerRef(PlayerRef playerRef, Player playerComponent)` |
| `public` | `String` | `getIdentifier()` |

## Relationships

- Extends `GenericPacketHandler`
- Implements `IPacketHandler`
- Holds a reference to `PlayerRef`
