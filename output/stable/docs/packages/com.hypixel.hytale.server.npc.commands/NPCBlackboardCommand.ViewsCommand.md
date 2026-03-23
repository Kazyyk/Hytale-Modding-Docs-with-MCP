---
title: "NPCBlackboardCommand.ViewsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ViewsCommand"
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
public static class NPCBlackboardCommand.ViewsCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Lists all `BlockTypeView` partial views in the blackboard, showing the total count and each view's coordinates, entity count, and block set cardinality.

## Constructor

```java
public ViewsCommand()
```

Registers as sub-command `"views"` with translation key `"server.commands.npc.blackboard.views.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ViewCommand](NPCBlackboardCommand.ViewCommand.md) -- detailed view for a single BlockTypeView
