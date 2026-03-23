---
title: "DoorInteraction.DoorInfo"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DoorInteraction.DoorInfo"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "door"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public static class DoorInteraction.DoorInfo
```

Data class that holds information about a door block at a specific world position. Used internally by [DoorInteraction](DoorInteraction.md) for double-door detection and state management.

## Fields

| Type | Name | Description |
|---|---|---|
| `BlockType` | `blockType` | The block type of the door. |
| `int` | `filler` | Filler block index (0 if this is the base block). |
| `Vector3i` | `blockPosition` | World position of the door block. |
| `DoorInteraction.DoorState` | `doorState` | Current open/closed state of the door. |

## Constructor

```java
public DoorInfo(BlockType blockType, int filler, Vector3i blockPosition, DoorInteraction.DoorState doorState)
```

## Methods

```java
public BlockType getBlockType()
```

```java
public Vector3i getBlockPosition()
```

```java
public DoorInteraction.DoorState getDoorState()
```

## See Also

- [DoorInteraction](DoorInteraction.md) -- uses this class for double-door logic
- [DoorInteraction.DoorState](DoorInteraction.DoorState.md)
