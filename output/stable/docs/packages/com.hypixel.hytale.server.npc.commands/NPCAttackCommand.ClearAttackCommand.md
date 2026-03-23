---
title: "NPCAttackCommand.ClearAttackCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCAttackCommand.ClearAttackCommand"
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
public static class NPCAttackCommand.ClearAttackCommand extends NPCWorldCommandBase
```

Inner class of [NPCAttackCommand](NPCAttackCommand.md). Clears all attack interaction overrides on the target NPC by calling `npc.getRole().getCombatSupport().clearAttackOverrides()`.

## Constructor

```java
public ClearAttackCommand()
```

Registers as sub-command `"clear"` with translation key `"server.commands.npc.attack.clear.desc"`.

## Related Types

- [NPCAttackCommand](NPCAttackCommand.md) -- parent command collection
- [NPCAttackCommand.SetAttackCommand](NPCAttackCommand.SetAttackCommand.md) -- sets attack overrides
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
