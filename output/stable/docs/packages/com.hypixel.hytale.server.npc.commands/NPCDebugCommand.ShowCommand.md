---
title: "NPCDebugCommand.ShowCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand.ShowCommand"
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
public static class NPCDebugCommand.ShowCommand extends NPCMultiSelectCommandBase
```

Inner class of [NPCDebugCommand](NPCDebugCommand.md). Displays the current `RoleDebugFlags` set on the target NPC(s). Shows the role name and a formatted list of active flags, or `<None>` if no flags are set.

## Constructor

```java
public ShowCommand()
```

Registers as sub-command `"show"` with translation key `"server.commands.npc.debug.show.desc"`.

## Related Types

- [NPCDebugCommand](NPCDebugCommand.md) -- parent command collection
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- base class for multi-NPC selection
