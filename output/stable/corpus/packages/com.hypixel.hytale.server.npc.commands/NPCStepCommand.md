# NPCStepCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public class NPCStepCommand extends AbstractWorldCommand

Implements `/npc step`. Advances NPC behavior by a single tick for debugging purposes. The NPC is frozen (via the `Frozen` component) and a `StepComponent` is added with the specified delta time. The `StepCleanupSystem` removes the `StepComponent` after processing.

## Arguments

- --all | flag | no | -- | Step all NPCs in the world
- entity | entity ID | no | -- | Target NPC (defaults to player's look-target)
- dt | Float | no | 1.0 / world.getTps() | Delta time for the step (must be > 0)

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` in parallel, adding `Frozen` and `StepComponent` to each.
- **Single target mode:** Resolves the target NPC (via entity argument or player look-target), adds `Frozen` and `StepComponent`.

## Constructor


public NPCStepCommand()

Registers as sub-command `"step"` with translation key `"server.commands.npc.step.desc"`.

## Related Types

- NPCFreezeCommand -- freezes NPCs without stepping
- NPCThawCommand -- unfreezes NPCs
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  private NPCEntity getNPC(CommandContext context, Store<EntityStore> store)

Fields:
private final FlagArg allArg
private final EntityWrappedArg entityArg
private final OptionalArg<Float> dtArg
