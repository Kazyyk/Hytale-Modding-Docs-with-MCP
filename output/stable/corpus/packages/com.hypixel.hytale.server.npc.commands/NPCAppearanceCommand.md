# NPCAppearanceCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public class NPCAppearanceCommand extends NPCWorldCommandBase

Implements `/npc appearance`. Changes the model/appearance of a target NPC at runtime by calling `NPCEntity.setAppearance()`.

## Arguments

- model | ModelAsset | yes | The model asset to apply to the NPC

## Constructor


public NPCAppearanceCommand()

Registers as sub-command `"appearance"` with translation key `"server.commands.npc.appearance.desc"`.

## Methods


@Override
protected void execute(@Nonnull CommandContext context, @Nonnull NPCEntity npc, @Nonnull World world, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref)

Retrieves the model argument and calls `npc.setAppearance(ref, model, store)`.

## Related Types

- NPCWorldCommandBase -- base class providing NPC target resolution
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand, NPCFreezeCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
private final RequiredArg<ModelAsset> modelArg
