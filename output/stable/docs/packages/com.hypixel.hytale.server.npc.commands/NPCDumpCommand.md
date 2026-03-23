---
title: "NPCDumpCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDumpCommand"
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
public class NPCDumpCommand extends NPCWorldCommandBase
```

Implements `/npc dump`. Dumps the complete NPC role state to the plugin logger for debugging. Traverses the role's component tree recursively using `IAnnotatedComponent` and `IAnnotatedComponentCollection` interfaces.

Supports two output formats: a plain-text hierarchical dump (default) and a JSON dump (with `--json` flag). The JSON format produces a nested structure with `name`, `index`, `children`, and `parameters` fields.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `--json` | flag | no | Output in JSON format instead of plain text |

## Constructor

```java
public NPCDumpCommand()
```

Registers as sub-command `"dump"` with translation key `"server.commands.npc.dump.desc"`.

## Related Types

- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class providing NPC target resolution
- [NPCCommand](NPCCommand.md) -- parent command collection
