---
title: "NPCDebugCommand.ToggleCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand.ToggleCommand"
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
public static class NPCDebugCommand.ToggleCommand extends NPCMultiSelectCommandBase
```

Inner class of [NPCDebugCommand](NPCDebugCommand.md). Toggles individual debug flags on the target NPC(s). For each specified flag, if it is currently set it is removed, and if it is not set it is added.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `flags` | `String` | yes | Comma-separated list of debug flag names to toggle |

## Constructor

```java
public ToggleCommand()
```

Registers as sub-command `"toggle"` with translation key `"server.commands.npc.debug.toggle.desc"`.

## Related Types

- [NPCDebugCommand](NPCDebugCommand.md) -- parent command collection
- [NPCDebugCommand.SetCommand](NPCDebugCommand.SetCommand.md) -- replaces flags instead of toggling
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- base class
