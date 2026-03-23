# NPCBlackboardCommand.ChunkCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ChunkCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Shows detailed blackboard data for a specific chunk section, including regional blackboard coordinates, searched block sets, and all block position entries grouped by block set.

## Arguments

- position | RelativeIntPosition | yes | Block position used to determine the chunk

## Constructor


public ChunkCommand()

Registers as sub-command `"chunk"` with translation key `"server.commands.npc.blackboard.chunk.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ChunksCommand -- lists all chunks

Also in this package: BlockEventsCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<RelativeIntPosition> positionArg
