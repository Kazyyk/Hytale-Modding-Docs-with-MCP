# NPCRoleCommand.GetRoleCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public static class NPCRoleCommand.GetRoleCommand extends NPCWorldCommandBase

Inner class of NPCRoleCommand. Displays the current role name of the target NPC.

## Constructor


public GetRoleCommand()

Registers with translation key `"server.commands.npc.role.get.desc"`.

## Related Types

- NPCRoleCommand -- parent command
- NPCWorldCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand, NPCFreezeCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)
