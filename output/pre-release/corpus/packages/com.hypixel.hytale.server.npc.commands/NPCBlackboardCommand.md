# NPCBlackboardCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCBlackboardCommand extends AbstractCommandCollection

Implements `/npc blackboard`. A command collection providing inspection and manipulation of the NPC blackboard system -- the shared perception data resource used by NPC sensors. Contains 11 sub-commands for viewing block type views, block events, entity events, resource views, chunk data, and player-NPC reservations.

## Constructor


public NPCBlackboardCommand()

Registers as sub-command `"blackboard"` with translation key `"server.commands.npc.blackboard.desc"`.

## Sub-commands

- chunks | ChunksCommand | Lists all blackboard chunk sections with entry counts
- chunk | ChunkCommand | Shows detailed block data for a specific chunk position
- drop | DropCommand | Clears all blackboard data
- views | ViewsCommand | Lists all `BlockTypeView` partial views
- view | ViewCommand | Shows detailed data for a specific `BlockTypeView
- blockevents | BlockEventsCommand | Shows `BlockEventView` subscriptions
- entityevents | EntityEventsCommand | Shows `EntityEventView` subscriptions
- resourceviews | ResourceViewsCommand | Lists all `ResourceView` instances
- resourceview | ResourceViewCommand | Shows detailed data for a specific `ResourceView
- reserve | ReserveCommand | Adds or removes a player reservation on an NPC
- reservation | ReservationCommand | Checks the reservation status between a player and NPC

## Related Types

- NPCBlackboardCommand.ChunksCommand
- NPCBlackboardCommand.ChunkCommand
- NPCBlackboardCommand.DropCommand
- NPCBlackboardCommand.ViewsCommand
- NPCBlackboardCommand.ViewCommand
- NPCBlackboardCommand.BlockEventsCommand
- NPCBlackboardCommand.EntityEventsCommand
- NPCBlackboardCommand.ResourceViewsCommand
- NPCBlackboardCommand.ResourceViewCommand
- NPCBlackboardCommand.ReserveCommand
- NPCBlackboardCommand.ReservationCommand
- NPCCommand -- parent command collection
