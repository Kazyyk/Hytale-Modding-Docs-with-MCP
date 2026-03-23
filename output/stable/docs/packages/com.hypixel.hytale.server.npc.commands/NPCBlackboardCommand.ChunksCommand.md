---
title: "NPCBlackboardCommand.ChunksCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ChunksCommand"
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
public static class NPCBlackboardCommand.ChunksCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Lists all chunk sections that have `BlockPositionProvider` components in the `ChunkStore`, showing position coordinates, entry count, and searched block set count for each section.

## Constructor

```java
public ChunksCommand()
```

Registers as sub-command `"chunks"` with translation key `"server.commands.npc.blackboard.chunks.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ChunkCommand](NPCBlackboardCommand.ChunkCommand.md) -- detailed view for a single chunk
