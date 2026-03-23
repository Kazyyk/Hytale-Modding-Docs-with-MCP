---
title: "NPCCleanCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCCleanCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCCleanCommand extends AbstractWorldCommand
```

Implements `/npc clean`. Removes all NPC entities from the current world by iterating over all entities with the `NPCEntity` component type in parallel and issuing `removeEntity` commands with `RemoveReason.REMOVE`.

Requires confirmation (`requiresConfirmation = true`).

## Constructor

```java
public NPCCleanCommand()
```

Registers as sub-command `"clean"` with translation key `"server.commands.npc.clean.desc"`.

## Related Types

- [NPCCommand](NPCCommand.md) -- parent command collection
- [NPCAllCommand](NPCAllCommand.md) -- spawns all NPC roles (inverse operation)
