---
title: "NPCAttackCommand.SetAttackCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCAttackCommand.SetAttackCommand"
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
public static class NPCAttackCommand.SetAttackCommand extends NPCWorldCommandBase
```

Inner class of [NPCAttackCommand](NPCAttackCommand.md). Sets attack override interactions on the target NPC's `CombatSupport`. Clears existing overrides before adding the new interaction IDs.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `attack` | `List<Interaction>` | no | List of interaction assets to set as attack overrides |

## Constructor

```java
public SetAttackCommand()
```

Registers with empty name (default sub-command) and translation key `"server.commands.npc.attack.desc"`.

## Related Types

- [NPCAttackCommand](NPCAttackCommand.md) -- parent command collection
- [NPCAttackCommand.ClearAttackCommand](NPCAttackCommand.ClearAttackCommand.md) -- clears attack overrides
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
