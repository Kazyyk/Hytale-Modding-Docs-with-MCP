---
title: "NPCAllCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCAllCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCAllCommand extends AbstractPlayerCommand
```

Implements `/npc all`. Spawns one instance of every spawnable NPC role in a grid pattern centered on the player's position. Each spawned NPC receives a `Nameplate` showing its role name and is immediately frozen via the `Frozen` component.

Requires confirmation (`requiresConfirmation = true`).

## Arguments

| Argument | Type | Required | Default | Description |
|---|---|---|---|---|
| `distance` | `Double` | no | `4.0` | Spacing between NPCs in the grid (must be > 0) |

## Behavior

1. Retrieves all spawnable role template names from `NPCPlugin.getRoleTemplateNames(true)`, sorted case-insensitively.
2. Arranges NPCs in a square grid with `ceil(sqrt(count))` columns, centered on the player.
3. For each role, computes the spawn Y coordinate using `NPCPhysicsMath.heightOverGround()` to place NPCs on the ground surface.
4. Spawns each NPC via `NPCPlugin.spawnEntity()`, adds a `Nameplate` with the role name, and applies the `Frozen` component.
5. Logs warnings for roles that fail to spawn.

## Constructor

```java
public NPCAllCommand()
```

Registers as sub-command `"all"` with translation key `"server.commands.npc.all.desc"`.

## Related Types

- [NPCCommand](NPCCommand.md) -- parent command collection
- [NPCSpawnCommand](NPCSpawnCommand.md) -- spawns individual NPC roles with more options
- [NPCCleanCommand](NPCCleanCommand.md) -- removes all NPCs from a world
