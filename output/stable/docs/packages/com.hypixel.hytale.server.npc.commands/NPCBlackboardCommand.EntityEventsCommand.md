---
title: "NPCBlackboardCommand.EntityEventsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.EntityEventsCommand"
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
public static class NPCBlackboardCommand.EntityEventsCommand extends AbstractWorldCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Displays the `EntityEventView` from the blackboard, listing all subscribed NPC groups with their event types and the NPCs subscribed to each (identified by UUID and role name).

## Constructor

```java
public EntityEventsCommand()
```

Registers as sub-command `"entityevents"` with translation key `"server.commands.npc.blackboard.entityevents.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.BlockEventsCommand](NPCBlackboardCommand.BlockEventsCommand.md) -- similar view for block events
