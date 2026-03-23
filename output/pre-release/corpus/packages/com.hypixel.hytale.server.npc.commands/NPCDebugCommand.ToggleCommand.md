# NPCDebugCommand.ToggleCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCMultiSelectCommandBase

public static class NPCDebugCommand.ToggleCommand extends NPCMultiSelectCommandBase

Inner class of NPCDebugCommand. Toggles individual debug flags on the target NPC(s). For each specified flag, if it is currently set it is removed, and if it is not set it is added.

## Arguments

- flags | String | yes | Comma-separated list of debug flag names to toggle

## Constructor


public ToggleCommand()

Registers as sub-command `"toggle"` with translation key `"server.commands.npc.debug.toggle.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCDebugCommand.SetCommand -- replaces flags instead of toggling
- NPCMultiSelectCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
private final RequiredArg<String> flagsArg
