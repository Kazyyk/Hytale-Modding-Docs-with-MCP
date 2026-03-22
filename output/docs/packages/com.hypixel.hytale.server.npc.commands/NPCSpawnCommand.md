---
title: "NPCSpawnCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCSpawnCommand"
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
public class NPCSpawnCommand extends AbstractPlayerCommand
```

Implements `/npc spawn`. Spawns one or more NPCs of a specified role at or near the player's position. The most feature-rich NPC command, supporting count, radius, debug flags, velocity, position overrides, rotation options, flock spawning, model scaling, random skins, spawn validation, and freeze-on-spawn.

## Arguments

| Argument | Type | Required | Default | Description |
|---|---|---|---|---|
| `role` | `BuilderInfo` | yes | -- | NPC role to spawn |
| `count` | `Integer` | no | `1` | Number of NPCs to spawn (> 0) |
| `radius` | `Double` | no | `8.0` | Scatter radius for multiple spawns (> 0) |
| `flags` | `String` | no | `"none"` | Comma-separated debug flags to apply |
| `speed` | `Double` | no | -- | Initial velocity magnitude in player's look direction (> 0) |
| `--nonrandom` | flag | no | -- | Use deterministic random seed (seed 0) |
| `position` | `String` | no | -- | Explicit spawn position as `"x,y,z"` |
| `posOffset` | `String` | no | -- | Position offset as `"x,y,z"` |
| `headRotation` | `String` | no | -- | Head rotation as `"x,y,z"` (freezes NPC) |
| `bodyRotation` | `String` | no | -- | Body rotation as `"x,y,z"` |
| `--randomRotation` | flag | no | -- | Random Y-axis rotation for each spawn |
| `--facingRotation` | flag | no | -- | Face toward the player |
| `flock` | `String` | no | `"1"` | Flock size (integer) or flock asset name |
| `--test` | flag | no | -- | Validate spawn position suitability |
| `--spawnOnGround` | flag | no | -- | Scatter Y offset near ground level |
| `--frozen` | flag | no | -- | Freeze NPC immediately after spawn |
| `--randomModel` | flag | no | -- | Apply a random cosmetic skin |
| `scale` | `Float` | no | -- | Model scale override |
| `--bypassScaleLimits` | flag | no | -- | Ignore model min/max scale limits |

## Behavior

1. Validates the role via `NPCPlugin.forceValidation()` and `testAndValidateRole()`. Throws `GeneralCommandException` if validation fails.
2. For each spawn iteration:
   - Retrieves or creates the role builder. Verifies it implements `ISpawnableWithModel` and is spawnable.
   - If `--test` flag is set, validates the spawn position using `SpawningContext`.
   - Spawns the NPC via `NPCPlugin.spawnEntity()`.
   - Optionally spawns a flock via `FlockPlugin.trySpawnFlock()`.
   - Applies head rotation, position scatter, velocity, freeze state, and debug flags.
3. Logs each successful spawn with role name, UUID, and position.

Also provides a usage variant [SpawnPageCommand](NPCSpawnCommand.SpawnPageCommand.md) that opens the entity spawn UI page.

## Constants

```java
private static final double PLAYER_FOOT_POINT_EPSILON = 0.01
```

## Constructor

```java
public NPCSpawnCommand()
```

Registers as sub-command `"spawn"` with translation key `"server.commands.npc.spawn.desc"`. Adds [SpawnPageCommand](NPCSpawnCommand.SpawnPageCommand.md) as a usage variant.

## Inner Classes

| Class | Description |
|---|---|
| [NPCSpawnCommand.SpawnPageCommand](NPCSpawnCommand.SpawnPageCommand.md) | Opens the entity spawn UI page |

## Related Types

- [NPCSpawnCommand.SpawnPageCommand](NPCSpawnCommand.SpawnPageCommand.md) -- UI page variant
- [NPCAllCommand](NPCAllCommand.md) -- spawns all roles at once
- [NPCCommand](NPCCommand.md) -- parent command collection
