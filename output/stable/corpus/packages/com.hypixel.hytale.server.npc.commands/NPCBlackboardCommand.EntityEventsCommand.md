# NPCBlackboardCommand.EntityEventsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.EntityEventsCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Displays the `EntityEventView` from the blackboard, listing all subscribed NPC groups with their event types and the NPCs subscribed to each (identified by UUID and role name).

## Constructor


public EntityEventsCommand()

Registers as sub-command `"entityevents"` with translation key `"server.commands.npc.blackboard.entityevents.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.BlockEventsCommand -- similar view for block events
