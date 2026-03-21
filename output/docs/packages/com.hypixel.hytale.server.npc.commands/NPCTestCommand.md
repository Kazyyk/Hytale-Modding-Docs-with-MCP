---
title: "NPCTestCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCTestCommand"
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
public class NPCTestCommand extends AbstractCommandCollection
```

Implements `/npc test`. A command collection for NPC-related diagnostic tests. Currently contains one sub-command for probing position validity.

## Constructor

```java
public NPCTestCommand()
```

Registers as sub-command `"test"` with translation key `"server.commands.npc.test.desc"`. Adds [ProbeTestCommand](NPCTestCommand.ProbeTestCommand.md) as a sub-command.

## Sub-commands

| Sub-command | Class | Description |
|---|---|---|
| `probe` | [NPCTestCommand.ProbeTestCommand](NPCTestCommand.ProbeTestCommand.md) | Tests position validity at the player's location |

## Related Types

- [NPCTestCommand.ProbeTestCommand](NPCTestCommand.ProbeTestCommand.md)
- [NPCCommand](NPCCommand.md) -- parent command collection
