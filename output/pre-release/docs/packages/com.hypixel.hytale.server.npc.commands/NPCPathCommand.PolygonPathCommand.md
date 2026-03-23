---
title: "NPCPathCommand.PolygonPathCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCPathCommand.PolygonPathCommand"
api_surface: false
extends: "NPCWorldCommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public static class NPCPathCommand.PolygonPathCommand extends NPCWorldCommandBase
```

Inner class of [NPCPathCommand](NPCPathCommand.md). Creates a regular polygon path for the target NPC. Generates waypoints for each side of the polygon, with equal turn angles (`2*PI / sides`) and uniform side lengths.

## Arguments

| Argument | Type | Required | Default | Description |
|---|---|---|---|---|
| `sides` | `Integer` | yes | -- | Number of sides (must be > 0) |
| `length` | `Double` | no | `5.0` | Length of each side in blocks (must be > 0) |

## Constructor

```java
public PolygonPathCommand()
```

Registers as sub-command `"polygon"` with translation key `"server.commands.npc.path.polygon.desc"`.

## Related Types

- [NPCPathCommand](NPCPathCommand.md) -- parent command collection
- [NPCPathCommand.SetPathCommand](NPCPathCommand.SetPathCommand.md) -- freeform path variant
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
