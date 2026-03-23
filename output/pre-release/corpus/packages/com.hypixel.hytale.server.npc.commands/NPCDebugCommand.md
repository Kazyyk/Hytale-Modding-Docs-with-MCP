# NPCDebugCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCDebugCommand extends AbstractCommandCollection

Implements `/npc debug`. A command collection for managing `RoleDebugFlags` on NPC entities. Debug flags control which debug overlays and trace outputs are active for an NPC (state display, sensor traces, pathfinder visualization, collision display, etc.).

When debug flags are modified, the NPC's `Nameplate` component is removed to avoid conflicts with debug display rendering.

## Constructor


public NPCDebugCommand()

Registers as sub-command `"debug"` with translation key `"server.commands.npc.debug.desc"`.

## Sub-commands

- show | ShowCommand | Displays current debug flags on the target NPC
- set | SetCommand | Replaces debug flags with the specified set
- toggle | ToggleCommand | Toggles individual debug flags on/off
- defaults | DefaultsCommand | Applies the "default" preset flags
- clear | ClearCommand | Removes all debug flags
- presets | PresetsCommand | Lists available flag presets

## Related Types

- NPCDebugCommand.ShowCommand
- NPCDebugCommand.SetCommand
- NPCDebugCommand.ToggleCommand
- NPCDebugCommand.DefaultsCommand
- NPCDebugCommand.ClearCommand
- NPCDebugCommand.PresetsCommand
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  private static void modifyFlags(CommandContext context, NPCEntity npc, Ref<EntityStore> ref, EnumSet<RoleDebugFlags> flags, BiFunction<EnumSet<RoleDebugFlags>,EnumSet<RoleDebugFlags>,EnumSet<RoleDebugFlags>> flagsModifier, Store<EntityStore> store)
  private static void safeSetRoleDebugFlags(NPCEntity npc, Ref<EntityStore> ref, EnumSet<RoleDebugFlags> flags, Store<EntityStore> store)
  private static void printNewFlags(NPCEntity npc, CommandContext context, EnumSet<RoleDebugFlags> newFlags)
  private static StringBuilder getListOfFlags(EnumSet<RoleDebugFlags> flags)
