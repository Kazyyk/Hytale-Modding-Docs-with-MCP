# NPCBlackboardCommand.ResourceViewsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ResourceViewsCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Lists all `ResourceView` instances in the blackboard, showing total count and each view's coordinates with reservation count.

## Constructor


public ResourceViewsCommand()

Registers as sub-command `"resourceviews"` with translation key `"server.commands.npc.blackboard.resourceviews.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ResourceViewCommand -- detailed view for a single ResourceView

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
