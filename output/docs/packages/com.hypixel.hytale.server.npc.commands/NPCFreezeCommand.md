---
title: "NPCFreezeCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCFreezeCommand"
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
public class NPCFreezeCommand extends AbstractWorldCommand
```

Implements `/npc freeze`. Pauses NPC behavior ticking by adding the `Frozen` ECS component to target entities.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `--all` | flag | no | Freeze all NPCs and items in the world |
| `--toggle` | flag | no | Toggle freeze state on the target NPC |
| `entity` | entity ID | no | Target NPC (defaults to player's look-target) |

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` component in parallel, adding `Frozen`. Also freezes all `ItemComponent` entities and makes them `Interactable`.
- **Single target mode:** Uses [NPCCommandUtils](NPCCommandUtils.md) to resolve the target NPC.
  - With `--toggle`: removes `Frozen` if present, or adds it if absent.
  - Without `--toggle`: always adds `Frozen`.

## Constructor

```java
public NPCFreezeCommand()
```

Registers as sub-command `"freeze"` with translation key `"server.commands.npc.freeze.desc"`.

## Related Types

- [NPCThawCommand](NPCThawCommand.md) -- unfreezes NPCs (inverse operation)
- [NPCStepCommand](NPCStepCommand.md) -- steps frozen NPCs one tick at a time
- [NPCCommandUtils](NPCCommandUtils.md) -- used for single-target resolution
- [NPCCommand](NPCCommand.md) -- parent command collection
