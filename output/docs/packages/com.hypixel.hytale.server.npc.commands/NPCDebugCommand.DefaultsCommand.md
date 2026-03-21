---
title: "NPCDebugCommand.DefaultsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand.DefaultsCommand"
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
public static class NPCDebugCommand.DefaultsCommand extends NPCMultiSelectCommandBase
```

Inner class of [NPCDebugCommand](NPCDebugCommand.md). Applies the `"default"` debug flag preset to the target NPC(s) by calling `RoleDebugFlags.getPreset("default")`.

## Constructor

```java
public DefaultsCommand()
```

Registers as sub-command `"defaults"` with translation key `"server.commands.npc.debug.defaults.desc"`.

## Related Types

- [NPCDebugCommand](NPCDebugCommand.md) -- parent command collection
- [NPCDebugCommand.PresetsCommand](NPCDebugCommand.PresetsCommand.md) -- lists available presets
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- base class
