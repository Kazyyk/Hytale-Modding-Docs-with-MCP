---
title: "NPCBlackboardCommand.ViewCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ViewCommand"
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
public static class NPCBlackboardCommand.ViewCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Shows detailed data for a specific `BlockTypeView` at a given chunk position, including world coordinate span, searched block sets with counts, and all subscribed NPC entities with their tracked block sets.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `chunk` | `RelativeChunkPosition` | yes | Chunk position to look up the view |

## Constructor

```java
public ViewCommand()
```

Registers as sub-command `"view"` with translation key `"server.commands.npc.blackboard.view.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ViewsCommand](NPCBlackboardCommand.ViewsCommand.md) -- lists all views
