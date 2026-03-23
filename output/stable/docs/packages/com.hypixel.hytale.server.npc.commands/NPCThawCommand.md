---
title: "NPCThawCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCThawCommand"
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
public class NPCThawCommand extends AbstractWorldCommand
```

Implements `/npc thaw` (alias: `/npc unfreeze`). Unfreezes NPC entities by removing the `Frozen` ECS component.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `--all` | flag | no | Thaw all NPCs in the world |
| `entity` | entity ID | no | Target NPC (defaults to player's look-target) |

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` in parallel, removing the `Frozen` component from each.
- **Single target mode:** Uses [NPCCommandUtils](NPCCommandUtils.md) to resolve the target NPC and removes its `Frozen` component.

## Constructor

```java
public NPCThawCommand()
```

Registers as sub-command `"thaw"` with translation key `"server.commands.npc.thaw.desc"`. Adds `"unfreeze"` as an alias.

## Related Types

- [NPCFreezeCommand](NPCFreezeCommand.md) -- freezes NPCs (inverse operation)
- [NPCStepCommand](NPCStepCommand.md) -- steps frozen NPCs one tick
- [NPCCommandUtils](NPCCommandUtils.md) -- used for target resolution
- [NPCCommand](NPCCommand.md) -- parent command collection
