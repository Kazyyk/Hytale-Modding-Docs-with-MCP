---
title: "NPCBlackboardCommand.ReservationCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ReservationCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public static class NPCBlackboardCommand.ReservationCommand extends AbstractPlayerCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Checks the `ReservationStatus` between the executing player and a target NPC by querying the blackboard's `InteractionView`.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `entity` | entity ID | no | Target NPC (defaults to player's look-target) |

## Constructor

```java
public ReservationCommand()
```

Registers as sub-command `"reservation"` with translation key `"server.commands.npc.blackboard.reservation.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ReserveCommand](NPCBlackboardCommand.ReserveCommand.md) -- adds/removes reservations
