---
title: "NPCGiveCommand.GiveNothingCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCGiveCommand.GiveNothingCommand"
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
public static class NPCGiveCommand.GiveNothingCommand extends NPCWorldCommandBase
```

Inner class of [NPCGiveCommand](NPCGiveCommand.md). Clears the NPC's held item by calling `RoleUtils.setItemInHand(npc, null)`.

## Constructor

```java
public GiveNothingCommand()
```

Registers as sub-command `"nothing"` with translation key `"server.commands.npc.give.nothing.desc"`.

## Related Types

- [NPCGiveCommand](NPCGiveCommand.md) -- parent command
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
