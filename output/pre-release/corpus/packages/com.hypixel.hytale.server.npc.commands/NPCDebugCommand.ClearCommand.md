# NPCDebugCommand.ClearCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCMultiSelectCommandBase

public static class NPCDebugCommand.ClearCommand extends NPCMultiSelectCommandBase

Inner class of NPCDebugCommand. Removes all debug flags from the target NPC(s) by setting an empty `EnumSet<RoleDebugFlags>`.

## Constructor


public ClearCommand()

Registers as sub-command `"clear"` with translation key `"server.commands.npc.debug.clear.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCMultiSelectCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)
