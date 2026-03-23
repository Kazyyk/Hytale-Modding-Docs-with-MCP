---
title: "NPCRoleCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCRoleCommand"
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
public class NPCRoleCommand extends NPCWorldCommandBase
```

Implements `/npc role`. Changes the role of a target NPC at runtime by queueing a role change via `RoleChangeSystem.requestRoleChange()`. If a role change is already pending, the command fails with an error message.

Also provides a usage variant (no role argument) that displays the NPC's current role name.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `role` | `BuilderInfo` | yes | The new NPC role (uses `NPCCommand.NPC_ROLE` argument type) |

## Constructor

```java
public NPCRoleCommand()
```

Registers as sub-command `"role"` with translation key `"server.commands.npc.role.desc"`. Adds [GetRoleCommand](NPCRoleCommand.GetRoleCommand.md) as a usage variant.

## Sub-commands

| Variant | Class | Description |
|---|---|---|
| *(no args)* | [NPCRoleCommand.GetRoleCommand](NPCRoleCommand.GetRoleCommand.md) | Displays the NPC's current role |

## Related Types

- [NPCRoleCommand.GetRoleCommand](NPCRoleCommand.GetRoleCommand.md) -- displays current role
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
- [NPCCommand](NPCCommand.md) -- parent command collection
