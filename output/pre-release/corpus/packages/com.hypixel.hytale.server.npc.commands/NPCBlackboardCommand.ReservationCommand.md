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

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private Ref<EntityStore> getNPCRef(CommandContext context, Store<EntityStore> store)

Fields:
private final EntityWrappedArg entityArg
