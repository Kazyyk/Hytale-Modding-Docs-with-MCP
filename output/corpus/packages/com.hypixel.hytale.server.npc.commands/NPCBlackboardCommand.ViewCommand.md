# NPCBlackboardCommand.ViewCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ViewCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Shows detailed data for a specific `BlockTypeView` at a given chunk position, including world coordinate span, searched block sets with counts, and all subscribed NPC entities with their tracked block sets.

## Arguments

- chunk | RelativeChunkPosition | yes | Chunk position to look up the view

## Constructor


public ViewCommand()

Registers as sub-command `"view"` with translation key `"server.commands.npc.blackboard.view.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ViewsCommand -- lists all views
