---
title: "NPCBlackboardCommand.BlockEventsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.BlockEventsCommand"
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
public static class NPCBlackboardCommand.BlockEventsCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Displays the `BlockEventView` from the blackboard, listing all subscribed block sets with their event types and the NPCs subscribed to each (identified by UUID and role name).

## Constructor

```java
public BlockEventsCommand()
```

Registers as sub-command `"blockevents"` with translation key `"server.commands.npc.blackboard.blockevents.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.EntityEventsCommand](NPCBlackboardCommand.EntityEventsCommand.md) -- similar view for entity events
