# NPCThawCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public class NPCThawCommand extends AbstractWorldCommand

Implements `/npc thaw` (alias: `/npc unfreeze`). Unfreezes NPC entities by removing the `Frozen` ECS component.

## Arguments

- --all | flag | no | Thaw all NPCs in the world
- entity | entity ID | no | Target NPC (defaults to player's look-target)

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` in parallel, removing the `Frozen` component from each.
- **Single target mode:** Uses NPCCommandUtils to resolve the target NPC and removes its `Frozen` component.

## Constructor


public NPCThawCommand()

Registers as sub-command `"thaw"` with translation key `"server.commands.npc.thaw.desc"`. Adds `"unfreeze"` as an alias.

## Related Types

- NPCFreezeCommand -- freezes NPCs (inverse operation)
- NPCStepCommand -- steps frozen NPCs one tick
- NPCCommandUtils -- used for target resolution
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_NPC_THAW_ALL
private final FlagArg allArg
private final EntityWrappedArg entityArg
