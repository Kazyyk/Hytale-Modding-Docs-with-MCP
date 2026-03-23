# NPCBlackboardCommand.ResourceViewCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ResourceViewCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Shows detailed data for a specific `ResourceView` at a given chunk position, including the world coordinate span and all entity reservations with their reserved block type and position.

## Arguments

- chunk | RelativeChunkPosition | yes | Chunk position to look up the resource view

## Constructor


public ResourceViewCommand()

Registers as sub-command `"resourceview"` with translation key `"server.commands.npc.blackboard.resourceview.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ResourceViewsCommand -- lists all resource views
