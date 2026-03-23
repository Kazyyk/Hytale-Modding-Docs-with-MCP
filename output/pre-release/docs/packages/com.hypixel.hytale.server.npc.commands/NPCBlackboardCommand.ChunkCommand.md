---
title: "NPCBlackboardCommand.ChunkCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ChunkCommand"
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
public static class NPCBlackboardCommand.ChunkCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Shows detailed blackboard data for a specific chunk section, including regional blackboard coordinates, searched block sets, and all block position entries grouped by block set.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `position` | `RelativeIntPosition` | yes | Block position used to determine the chunk |

## Constructor

```java
public ChunkCommand()
```

Registers as sub-command `"chunk"` with translation key `"server.commands.npc.blackboard.chunk.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ChunksCommand](NPCBlackboardCommand.ChunksCommand.md) -- lists all chunks
