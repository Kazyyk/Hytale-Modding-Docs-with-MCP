---
title: "PlayerUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.PlayerUtil"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "player"
  - "utility"
  - "broadcast"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class PlayerUtil
```

Static utilities for iterating over players and broadcasting packets/messages within a world.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `forEachPlayerThatCanSeeEntity(Ref, TriConsumer, ComponentAccessor)` | `void` | Iterates all players whose entity viewer contains the given ref. |
| `forEachPlayerThatCanSeeEntity(Ref, TriConsumer, Ref, ComponentAccessor)` | `void` | Same as above but excludes a specific player ref. |
| `broadcastMessageToPlayers(UUID, Message, Store)` | `void` | Sends a message to all players in the world, respecting hidden-player filtering. |
| `broadcastPacketToPlayers(ComponentAccessor, ToClientPacket)` | `void` | Sends a packet to all players in the world (cached). |
| `broadcastPacketToPlayersNoCache(ComponentAccessor, ToClientPacket)` | `void` | Sends a packet to all players in the world (uncached). |
| `broadcastPacketToPlayers(ComponentAccessor, ToClientPacket...)` | `void` | Sends multiple packets to all players. |
| `resetPlayerModel(Ref, ComponentAccessor)` | `void` | Deprecated. Resets the player model from their skin cosmetics. |
