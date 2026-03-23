# NPCDebugCommand.PresetsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommand

public static class NPCDebugCommand.PresetsCommand extends AbstractCommand

Inner class of NPCDebugCommand. Lists available debug flag presets and their constituent flags. When called without arguments, lists all available flags and all preset names. When called with a preset name, shows the flags included in that preset.

## Arguments

- preset | String | no | Name of a specific preset to inspect

## Constructor


public PresetsCommand()

Registers as sub-command `"presets"` with translation key `"server.commands.npc.debug.presets.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCDebugCommand.DefaultsCommand -- applies the default preset

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected CompletableFuture<Void> execute(CommandContext context)

Fields:
private final OptionalArg<String> presetArg
