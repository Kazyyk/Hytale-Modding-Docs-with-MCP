---
title: "NPCDebugCommand.PresetsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDebugCommand.PresetsCommand"
api_surface: false
extends: "AbstractCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public static class NPCDebugCommand.PresetsCommand extends AbstractCommand
```

Inner class of [NPCDebugCommand](NPCDebugCommand.md). Lists available debug flag presets and their constituent flags. When called without arguments, lists all available flags and all preset names. When called with a preset name, shows the flags included in that preset.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `preset` | `String` | no | Name of a specific preset to inspect |

## Constructor

```java
public PresetsCommand()
```

Registers as sub-command `"presets"` with translation key `"server.commands.npc.debug.presets.desc"`.

## Related Types

- [NPCDebugCommand](NPCDebugCommand.md) -- parent command collection
- [NPCDebugCommand.DefaultsCommand](NPCDebugCommand.DefaultsCommand.md) -- applies the default preset
