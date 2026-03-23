# NPCBlackboardCommand.BlockEventsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.BlockEventsCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Displays the `BlockEventView` from the blackboard, listing all subscribed block sets with their event types and the NPCs subscribed to each (identified by UUID and role name).

## Constructor


public BlockEventsCommand()

Registers as sub-command `"blockevents"` with translation key `"server.commands.npc.blackboard.blockevents.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.EntityEventsCommand -- similar view for entity events

Also in this package: ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
