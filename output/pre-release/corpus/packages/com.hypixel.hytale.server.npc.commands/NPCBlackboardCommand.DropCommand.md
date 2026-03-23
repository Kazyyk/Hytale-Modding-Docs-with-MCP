# NPCBlackboardCommand.DropCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.DropCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Clears all blackboard data by calling `Blackboard.clear()` on the entity store's blackboard resource. Sends a confirmation message after clearing.

## Constructor


public DropCommand()

Registers as sub-command `"drop"` with translation key `"server.commands.npc.blackboard.drop.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
