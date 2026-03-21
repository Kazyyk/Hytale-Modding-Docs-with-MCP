---
title: "NPCPathCommand.SetPathCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCPathCommand.SetPathCommand"
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
public static class NPCPathCommand.SetPathCommand extends NPCWorldCommandBase
```

Inner class of [NPCPathCommand](NPCPathCommand.md). Sets a transient path on the target NPC from a comma-separated string of rotation/distance pairs (e.g., `"90,5,45,3"` means turn 90 degrees and walk 5 blocks, then turn 45 degrees and walk 3 blocks). Rotation values are in degrees (converted to radians internally).

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `instructions` | `String` | yes | Comma-separated rotation,distance pairs |

## Constructor

```java
public SetPathCommand()
```

Registers as the default sub-command (empty name) with translation key `"server.commands.npc.path.desc"`.

## Related Types

- [NPCPathCommand](NPCPathCommand.md) -- parent command collection
- [NPCPathCommand.PolygonPathCommand](NPCPathCommand.PolygonPathCommand.md) -- polygon variant
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class
