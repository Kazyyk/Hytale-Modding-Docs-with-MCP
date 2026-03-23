# NPCBlackboardCommand.DropCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.DropCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Clears all blackboard data by calling `Blackboard.clear()` on the entity store's blackboard resource. Sends a confirmation message after clearing.

## Constructor


public DropCommand()

Registers as sub-command `"drop"` with translation key `"server.commands.npc.blackboard.drop.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
