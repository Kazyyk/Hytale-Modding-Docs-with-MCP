---
title: "NPCBlackboardCommand.ReserveCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCBlackboardCommand.ReserveCommand"
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
public static class NPCBlackboardCommand.ReserveCommand extends AbstractPlayerCommand
```

Inner class of [NPCBlackboardCommand](NPCBlackboardCommand.md). Adds or removes a player reservation on a target NPC. Reservations are tracked on the `NPCEntity` component using the player's UUID. When `reserve` is `true`, calls `npcEntity.addReservation()`; when `false`, calls `npcEntity.removeReservation()`.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `reserve` | `Boolean` | yes | `true` to add a reservation, `false` to remove |
| `entity` | entity ID | no | Target NPC (defaults to player's look-target) |

## Constructor

```java
public ReserveCommand()
```

Registers as sub-command `"reserve"` with translation key `"server.commands.npc.blackboard.reserve.desc"`.

## Related Types

- [NPCBlackboardCommand](NPCBlackboardCommand.md) -- parent command collection
- [NPCBlackboardCommand.ReservationCommand](NPCBlackboardCommand.ReservationCommand.md) -- checks reservation status
