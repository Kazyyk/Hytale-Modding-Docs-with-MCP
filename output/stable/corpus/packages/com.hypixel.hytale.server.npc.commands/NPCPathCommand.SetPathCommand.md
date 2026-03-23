# NPCPathCommand.SetPathCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public static class NPCPathCommand.SetPathCommand extends NPCWorldCommandBase

Inner class of NPCPathCommand. Sets a transient path on the target NPC from a comma-separated string of rotation/distance pairs (e.g., `"90,5,45,3"` means turn 90 degrees and walk 5 blocks, then turn 45 degrees and walk 3 blocks). Rotation values are in degrees (converted to radians internally).

## Arguments

- instructions | String | yes | Comma-separated rotation,distance pairs

## Constructor


public SetPathCommand()

Registers as the default sub-command (empty name) with translation key `"server.commands.npc.path.desc"`.

## Related Types

- NPCPathCommand -- parent command collection
- NPCPathCommand.PolygonPathCommand -- polygon variant
- NPCWorldCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)
  private ArrayDeque<RelativeWaypointDefinition> parseInstructions(CommandContext context, String str)

Fields:
private final RequiredArg<String> instructionsArg
