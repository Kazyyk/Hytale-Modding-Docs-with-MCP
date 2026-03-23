# NPCSpawnCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public class NPCSpawnCommand extends AbstractPlayerCommand

Implements `/npc spawn`. Spawns one or more NPCs of a specified role at or near the player's position. The most feature-rich NPC command, supporting count, radius, debug flags, velocity, position overrides, rotation options, flock spawning, model scaling, random skins, spawn validation, and freeze-on-spawn.

## Arguments

- role | BuilderInfo | yes | -- | NPC role to spawn
- count | Integer | no | 1 | Number of NPCs to spawn (> 0)
- radius | Double | no | 8.0 | Scatter radius for multiple spawns (> 0)
- flags | String | no | "none" | Comma-separated debug flags to apply
- speed | Double | no | -- | Initial velocity magnitude in player's look direction (> 0)
- --nonrandom | flag | no | -- | Use deterministic random seed (seed 0)
- position | String | no | -- | Explicit spawn position as `"x,y,z"
- posOffset | String | no | -- | Position offset as `"x,y,z"
- headRotation | String | no | -- | Head rotation as `"x,y,z"` (freezes NPC)
- bodyRotation | String | no | -- | Body rotation as `"x,y,z"
- --randomRotation | flag | no | -- | Random Y-axis rotation for each spawn
- --facingRotation | flag | no | -- | Face toward the player
- flock | String | no | "1" | Flock size (integer) or flock asset name
- --test | flag | no | -- | Validate spawn position suitability
- --spawnOnGround | flag | no | -- | Scatter Y offset near ground level
- --frozen | flag | no | -- | Freeze NPC immediately after spawn
- --randomModel | flag | no | -- | Apply a random cosmetic skin
- scale | Float | no | -- | Model scale override
- --bypassScaleLimits | flag | no | -- | Ignore model min/max scale limits

## Behavior

1. Validates the role via `NPCPlugin.forceValidation()` and `testAndValidateRole()`. Throws `GeneralCommandException` if validation fails.
2. For each spawn iteration:
   - Retrieves or creates the role builder. Verifies it implements `ISpawnableWithModel` and is spawnable.
   - If `--test` flag is set, validates the spawn position using `SpawningContext`.
   - Spawns the NPC via `NPCPlugin.spawnEntity()`.
   - Optionally spawns a flock via `FlockPlugin.trySpawnFlock()`.
   - Applies head rotation, position scatter, velocity, freeze state, and debug flags.
3. Logs each successful spawn with role name, UUID, and position.

Also provides a usage variant SpawnPageCommand that opens the entity spawn UI page.

## Constants


private static final double PLAYER_FOOT_POINT_EPSILON = 0.01

## Constructor


public NPCSpawnCommand()

Registers as sub-command `"spawn"` with translation key `"server.commands.npc.spawn.desc"`. Adds SpawnPageCommand as a usage variant.

## Inner Classes

- NPCSpawnCommand.SpawnPageCommand | Opens the entity spawn UI page

## Related Types

- NPCSpawnCommand.SpawnPageCommand -- UI page variant
- NPCAllCommand -- spawns all roles at once
- NPCCommand -- parent command collection
