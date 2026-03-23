---
title: "MountGamePacketHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountGamePacketHandler"
api_surface: false
extends: ~
implements:
  - "SubPacketHandler"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class MountGamePacketHandler implements SubPacketHandler
```

Handles incoming `DismountNPC` packets from clients. Registered by [MountPlugin](MountPlugin.md) via `ServerManager.get().registerSubPacketHandlers()`.

## Constructor

```java
public MountGamePacketHandler(IPacketHandler packetHandler)
```

Stores the parent packet handler for player reference resolution.

## Methods

### registerHandlers

```java
@Override
public void registerHandlers()
```

Registers a handler for packet ID `294` (`DismountNPC`).

### handle

```java
public void handle(DismountNPC packet)
```

Processes a dismount request from the client. Resolves the player's entity reference and executes on the world thread:

1. If the player has no [MountedComponent](MountedComponent.md), delegates to `MountPlugin.checkDismountNpc()` to handle NPC dismount.
2. If the player has a `MountedComponent` with controller type `BlockMount`, removes the `MountedComponent` to dismount from the block.

Throws `RuntimeException` if the player reference is invalid.

## Related Types

- [MountPlugin](MountPlugin.md) -- registers this handler
- [MountedComponent](MountedComponent.md) -- checked and removed during dismount
