# NPCDumpCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public class NPCDumpCommand extends NPCWorldCommandBase

Implements `/npc dump`. Dumps the complete NPC role state to the plugin logger for debugging. Traverses the role's component tree recursively using `IAnnotatedComponent` and `IAnnotatedComponentCollection` interfaces.

Supports two output formats: a plain-text hierarchical dump (default) and a JSON dump (with `--json` flag). The JSON format produces a nested structure with `name`, `index`, `children`, and `parameters` fields.

## Arguments

- --json | flag | no | Output in JSON format instead of plain text

## Constructor


public NPCDumpCommand()

Registers as sub-command `"dump"` with translation key `"server.commands.npc.dump.desc"`.

## Related Types

- NPCWorldCommandBase -- base class providing NPC target resolution
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)
  private static void dumpComponent(Role role, IAnnotatedComponent component, int index, int nestingDepth, List<ComponentInfo> infoList)
  private static void dumpComponentsAsJson(Role role, IAnnotatedComponent component, int index, int nestingDepth, JsonElement parent)

Fields:
private final FlagArg jsonArg
