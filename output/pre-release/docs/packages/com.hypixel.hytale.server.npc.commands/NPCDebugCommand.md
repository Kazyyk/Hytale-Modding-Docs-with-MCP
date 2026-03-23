---
title: "NPCDebugCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand"
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
public class NPCDebugCommand extends AbstractCommandCollection
```

Implements `/npc debug`. A command collection for managing `RoleDebugFlags` on NPC entities. Debug flags control which debug overlays and trace outputs are active for an NPC (state display, sensor traces, pathfinder visualization, collision display, etc.).

When debug flags are modified, the NPC's `Nameplate` component is removed to avoid conflicts with debug display rendering.

## Constructor

```java
public NPCDebugCommand()
```

Registers as sub-command `"debug"` with translation key `"server.commands.npc.debug.desc"`.

## Sub-commands

| Sub-command | Class | Description |
|---|---|---|
| `show` | [ShowCommand](NPCDebugCommand.ShowCommand.md) | Displays current debug flags on the target NPC |
| `set` | [SetCommand](NPCDebugCommand.SetCommand.md) | Replaces debug flags with the specified set |
| `toggle` | [ToggleCommand](NPCDebugCommand.ToggleCommand.md) | Toggles individual debug flags on/off |
| `defaults` | [DefaultsCommand](NPCDebugCommand.DefaultsCommand.md) | Applies the "default" preset flags |
| `clear` | [ClearCommand](NPCDebugCommand.ClearCommand.md) | Removes all debug flags |
| `presets` | [PresetsCommand](NPCDebugCommand.PresetsCommand.md) | Lists available flag presets |

## Related Types

- [NPCDebugCommand.ShowCommand](NPCDebugCommand.ShowCommand.md)
- [NPCDebugCommand.SetCommand](NPCDebugCommand.SetCommand.md)
- [NPCDebugCommand.ToggleCommand](NPCDebugCommand.ToggleCommand.md)
- [NPCDebugCommand.DefaultsCommand](NPCDebugCommand.DefaultsCommand.md)
- [NPCDebugCommand.ClearCommand](NPCDebugCommand.ClearCommand.md)
- [NPCDebugCommand.PresetsCommand](NPCDebugCommand.PresetsCommand.md)
- [NPCCommand](NPCCommand.md) -- parent command collection
