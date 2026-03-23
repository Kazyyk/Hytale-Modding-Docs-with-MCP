---
title: "NPCDebugCommand.ClearCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand.ClearCommand"
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
public static class NPCDebugCommand.ClearCommand extends NPCMultiSelectCommandBase
```

Inner class of [NPCDebugCommand](NPCDebugCommand.md). Removes all debug flags from the target NPC(s) by setting an empty `EnumSet<RoleDebugFlags>`.

## Constructor

```java
public ClearCommand()
```

Registers as sub-command `"clear"` with translation key `"server.commands.npc.debug.clear.desc"`.

## Related Types

- [NPCDebugCommand](NPCDebugCommand.md) -- parent command collection
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- base class
