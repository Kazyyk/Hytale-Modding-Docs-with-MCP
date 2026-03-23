# NPCBlackboardCommand.ViewsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ViewsCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Lists all `BlockTypeView` partial views in the blackboard, showing the total count and each view's coordinates, entity count, and block set cardinality.

## Constructor


public ViewsCommand()

Registers as sub-command `"views"` with translation key `"server.commands.npc.blackboard.views.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ViewCommand -- detailed view for a single BlockTypeView

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
