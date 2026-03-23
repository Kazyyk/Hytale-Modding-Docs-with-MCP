# NPCDebugCommand.DefaultsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCMultiSelectCommandBase

public static class NPCDebugCommand.DefaultsCommand extends NPCMultiSelectCommandBase

Inner class of NPCDebugCommand. Applies the `"default"` debug flag preset to the target NPC(s) by calling `RoleDebugFlags.getPreset("default")`.

## Constructor


public DefaultsCommand()

Registers as sub-command `"defaults"` with translation key `"server.commands.npc.debug.defaults.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCDebugCommand.PresetsCommand -- lists available presets
- NPCMultiSelectCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)
