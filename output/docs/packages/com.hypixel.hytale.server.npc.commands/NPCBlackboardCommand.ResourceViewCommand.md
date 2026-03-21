---
title: "NPCBlackboardCommand.ResourceViewCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ResourceViewCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public static class NPCBlackboardCommand.ResourceViewCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Shows detailed data for a specific `ResourceView` at a given chunk position, including the world coordinate span and all entity reservations with their reserved block type and position.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `chunk` | `RelativeChunkPosition` | yes | Chunk position to look up the resource view |

## Constructor

```java
public ResourceViewCommand()
```

Registers as sub-command `"resourceview"` with translation key `"server.commands.npc.blackboard.resourceview.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ResourceViewsCommand](NPCBlackboardCommand.ResourceViewsCommand.md) -- lists all resource views
