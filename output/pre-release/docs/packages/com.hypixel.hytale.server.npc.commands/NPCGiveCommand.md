---
title: "NPCGiveCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCGiveCommand"
api_surface: false
extends: "NPCWorldCommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCGiveCommand extends NPCWorldCommandBase
```

Implements `/npc give`. Gives an item to a target NPC. If the item has an `Armor` configuration, it is applied as armor via `RoleUtils.setArmor()`. Otherwise, it is placed in the NPC's hand via `RoleUtils.setItemInHand()`.

Also provides a `nothing` sub-command to clear the NPC's held item.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `item` | `Item` | yes | The item asset to give to the NPC |

## Constructor

```java
public NPCGiveCommand()
```

Registers as sub-command `"give"` with translation key `"server.commands.npc.give.desc"`. Adds [GiveNothingCommand](NPCGiveCommand.GiveNothingCommand.md) as a sub-command.

## Sub-commands

| Sub-command | Class |
|---|---|
| `nothing` | [NPCGiveCommand.GiveNothingCommand](NPCGiveCommand.GiveNothingCommand.md) |

## Related Types

- [NPCGiveCommand.GiveNothingCommand](NPCGiveCommand.GiveNothingCommand.md) -- clears the NPC's held item
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
- [NPCCommand](NPCCommand.md) -- parent command collection
