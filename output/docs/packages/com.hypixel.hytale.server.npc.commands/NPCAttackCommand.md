---
title: "NPCAttackCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCAttackCommand"
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
public class NPCAttackCommand extends AbstractCommandCollection
```

Implements `/npc attack`. A command collection with two sub-commands for overriding and clearing an NPC's attack interaction sequence via its `CombatSupport`.

## Constructor

```java
public NPCAttackCommand()
```

Registers as sub-command `"attack"` with translation key `"server.commands.npc.attack.desc"`. Adds [SetAttackCommand](NPCAttackCommand.SetAttackCommand.md) and [ClearAttackCommand](NPCAttackCommand.ClearAttackCommand.md) as sub-commands.

## Sub-commands

| Sub-command | Class |
|---|---|
| *(default)* | [NPCAttackCommand.SetAttackCommand](NPCAttackCommand.SetAttackCommand.md) |
| `clear` | [NPCAttackCommand.ClearAttackCommand](NPCAttackCommand.ClearAttackCommand.md) |

## Related Types

- [NPCAttackCommand.SetAttackCommand](NPCAttackCommand.SetAttackCommand.md) -- sets attack override interactions
- [NPCAttackCommand.ClearAttackCommand](NPCAttackCommand.ClearAttackCommand.md) -- clears attack overrides
- [NPCCommand](NPCCommand.md) -- parent command collection
