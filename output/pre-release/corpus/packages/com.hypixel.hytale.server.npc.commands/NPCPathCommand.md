# NPCPathCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCPathCommand extends AbstractCommandCollection

Implements `/npc path`. A command collection for creating and assigning transient paths to NPCs. Paths are built from waypoint definitions and assigned to the NPC's `PathManager` via `setTransientPath()`.

## Constructor


public NPCPathCommand()

Registers as sub-command `"path"` with translation key `"server.commands.npc.path.desc"`. Adds SetPathCommand and PolygonPathCommand as sub-commands.

## Sub-commands

- *(default)* | NPCPathCommand.SetPathCommand | Sets a path from rotation/distance pairs
- polygon | NPCPathCommand.PolygonPathCommand | Sets a regular polygon path

## Related Types

- NPCPathCommand.SetPathCommand
- NPCPathCommand.PolygonPathCommand
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)
