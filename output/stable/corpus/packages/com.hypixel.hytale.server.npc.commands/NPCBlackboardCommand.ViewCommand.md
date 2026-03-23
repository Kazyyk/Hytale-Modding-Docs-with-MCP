# NPCBlackboardCommand.ViewCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ViewCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Shows detailed data for a specific `BlockTypeView` at a given chunk position, including world coordinate span, searched block sets with counts, and all subscribed NPC entities with their tracked block sets.

## Arguments

- chunk | RelativeChunkPosition | yes | Chunk position to look up the view

## Constructor


public ViewCommand()

Registers as sub-command `"view"` with translation key `"server.commands.npc.blackboard.view.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ViewsCommand -- lists all views

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<RelativeChunkPosition> chunkArg
