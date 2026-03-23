---
title: "NPCPathCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCPathCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCPathCommand extends AbstractCommandCollection
```

Implements `/npc path`. A command collection for creating and assigning transient paths to NPCs. Paths are built from waypoint definitions and assigned to the NPC's `PathManager` via `setTransientPath()`.

## Constructor

```java
public NPCPathCommand()
```

Registers as sub-command `"path"` with translation key `"server.commands.npc.path.desc"`. Adds [SetPathCommand](NPCPathCommand.SetPathCommand.md) and [PolygonPathCommand](NPCPathCommand.PolygonPathCommand.md) as sub-commands.

## Sub-commands

| Sub-command | Class | Description |
|---|---|---|
| *(default)* | [NPCPathCommand.SetPathCommand](NPCPathCommand.SetPathCommand.md) | Sets a path from rotation/distance pairs |
| `polygon` | [NPCPathCommand.PolygonPathCommand](NPCPathCommand.PolygonPathCommand.md) | Sets a regular polygon path |

## Related Types

- [NPCPathCommand.SetPathCommand](NPCPathCommand.SetPathCommand.md)
- [NPCPathCommand.PolygonPathCommand](NPCPathCommand.PolygonPathCommand.md)
- [NPCCommand](NPCCommand.md) -- parent command collection
