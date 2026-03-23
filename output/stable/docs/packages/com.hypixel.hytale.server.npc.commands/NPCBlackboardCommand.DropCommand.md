---
title: "NPCBlackboardCommand.DropCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.DropCommand"
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
public static class NPCBlackboardCommand.DropCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Clears all blackboard data by calling `Blackboard.clear()` on the entity store's blackboard resource. Sends a confirmation message after clearing.

## Constructor

```java
public DropCommand()
```

Registers as sub-command `"drop"` with translation key `"server.commands.npc.blackboard.drop.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
