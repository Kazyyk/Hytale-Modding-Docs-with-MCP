---
title: "NPCDebugCommand.SetCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand.SetCommand"
api_surface: false
extends: "NPCMultiSelectCommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public static class NPCDebugCommand.SetCommand extends NPCMultiSelectCommandBase
```

Inner class of [NPCDebugCommand](NPCDebugCommand.md). Replaces all debug flags on the target NPC(s) with the specified set. The `flags` argument is a comma-separated list of `RoleDebugFlags` names.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `flags` | `String` | yes | Comma-separated list of debug flag names |

## Constructor

```java
public SetCommand()
```

Registers as sub-command `"set"` with translation key `"server.commands.npc.debug.set.desc"`.

## Related Types

- [NPCDebugCommand](NPCDebugCommand.md) -- parent command collection
- [NPCDebugCommand.ToggleCommand](NPCDebugCommand.ToggleCommand.md) -- toggles flags instead of replacing
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- base class
