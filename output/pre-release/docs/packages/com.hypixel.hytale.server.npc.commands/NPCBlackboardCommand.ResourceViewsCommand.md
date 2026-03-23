---
title: "NPCBlackboardCommand.ResourceViewsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ResourceViewsCommand"
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
public static class NPCBlackboardCommand.ResourceViewsCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Lists all `ResourceView` instances in the blackboard, showing total count and each view's coordinates with reservation count.

## Constructor

```java
public ResourceViewsCommand()
```

Registers as sub-command `"resourceviews"` with translation key `"server.commands.npc.blackboard.resourceviews.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ResourceViewCommand](NPCBlackboardCommand.ResourceViewCommand.md) -- detailed view for a single ResourceView
