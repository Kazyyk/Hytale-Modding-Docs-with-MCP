---
title: "NPCBlackboardCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand"
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
public class NPCBlackboardCommand extends AbstractCommandCollection
```

Implements `/npc blackboard`. A command collection providing inspection and manipulation of the NPC blackboard system -- the shared perception data resource used by NPC sensors. Contains 11 sub-commands for viewing block type views, block events, entity events, resource views, chunk data, and player-NPC reservations.

## Constructor

```java
public NPCBlackboardCommand()
```

Registers as sub-command `"blackboard"` with translation key `"server.commands.npc.blackboard.desc"`.

## Sub-commands

| Sub-command | Class | Description |
|---|---|---|
| `chunks` | [ChunksCommand](NPCBlackboardCommand.ChunksCommand.md) | Lists all blackboard chunk sections with entry counts |
| `chunk` | [ChunkCommand](NPCBlackboardCommand.ChunkCommand.md) | Shows detailed block data for a specific chunk position |
| `drop` | [DropCommand](NPCBlackboardCommand.DropCommand.md) | Clears all blackboard data |
| `views` | [ViewsCommand](NPCBlackboardCommand.ViewsCommand.md) | Lists all `BlockTypeView` partial views |
| `view` | [ViewCommand](NPCBlackboardCommand.ViewCommand.md) | Shows detailed data for a specific `BlockTypeView` |
| `blockevents` | [BlockEventsCommand](NPCBlackboardCommand.BlockEventsCommand.md) | Shows `BlockEventView` subscriptions |
| `entityevents` | [EntityEventsCommand](NPCBlackboardCommand.EntityEventsCommand.md) | Shows `EntityEventView` subscriptions |
| `resourceviews` | [ResourceViewsCommand](NPCBlackboardCommand.ResourceViewsCommand.md) | Lists all `ResourceView` instances |
| `resourceview` | [ResourceViewCommand](NPCBlackboardCommand.ResourceViewCommand.md) | Shows detailed data for a specific `ResourceView` |
| `reserve` | [ReserveCommand](NPCBlackboardCommand.ReserveCommand.md) | Adds or removes a player reservation on an NPC |
| `reservation` | [ReservationCommand](NPCBlackboardCommand.ReservationCommand.md) | Checks the reservation status between a player and NPC |

## Related Types

- [NPCBlackboardCommand.ChunksCommand](NPCBlackboardCommand.ChunksCommand.md)
- [NPCBlackboardCommand.ChunkCommand](NPCBlackboardCommand.ChunkCommand.md)
- [NPCBlackboardCommand.DropCommand](NPCBlackboardCommand.DropCommand.md)
- [NPCBlackboardCommand.ViewsCommand](NPCBlackboardCommand.ViewsCommand.md)
- [NPCBlackboardCommand.ViewCommand](NPCBlackboardCommand.ViewCommand.md)
- [NPCBlackboardCommand.BlockEventsCommand](NPCBlackboardCommand.BlockEventsCommand.md)
- [NPCBlackboardCommand.EntityEventsCommand](NPCBlackboardCommand.EntityEventsCommand.md)
- [NPCBlackboardCommand.ResourceViewsCommand](NPCBlackboardCommand.ResourceViewsCommand.md)
- [NPCBlackboardCommand.ResourceViewCommand](NPCBlackboardCommand.ResourceViewCommand.md)
- [NPCBlackboardCommand.ReserveCommand](NPCBlackboardCommand.ReserveCommand.md)
- [NPCBlackboardCommand.ReservationCommand](NPCBlackboardCommand.ReservationCommand.md)
- [NPCCommand](NPCCommand.md) -- parent command collection
