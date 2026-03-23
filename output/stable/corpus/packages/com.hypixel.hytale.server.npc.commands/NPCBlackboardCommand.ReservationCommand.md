# NPCBlackboardCommand.ReservationCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public static class NPCBlackboardCommand.ReservationCommand extends AbstractPlayerCommand

Inner class of NPCBlackboardCommand. Checks the `ReservationStatus` between the executing player and a target NPC by querying the blackboard's `InteractionView`.

## Arguments

- entity | entity ID | no | Target NPC (defaults to player's look-target)

## Constructor


public ReservationCommand()

Registers as sub-command `"reservation"` with translation key `"server.commands.npc.blackboard.reservation.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ReserveCommand -- adds/removes reservations
