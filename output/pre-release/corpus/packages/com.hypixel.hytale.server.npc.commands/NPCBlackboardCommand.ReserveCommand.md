# NPCBlackboardCommand.ReserveCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public static class NPCBlackboardCommand.ReserveCommand extends AbstractPlayerCommand

Inner class of NPCBlackboardCommand. Adds or removes a player reservation on a target NPC. Reservations are tracked on the `NPCEntity` component using the player's UUID. When `reserve` is `true`, calls `npcEntity.addReservation()`; when `false`, calls `npcEntity.removeReservation()`.

## Arguments

- reserve | Boolean | yes | true` to add a reservation, `false` to remove
- entity | entity ID | no | Target NPC (defaults to player's look-target)

## Constructor


public ReserveCommand()

Registers as sub-command `"reserve"` with translation key `"server.commands.npc.blackboard.reserve.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ReservationCommand -- checks reservation status

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private Ref<EntityStore> getNPCRef(CommandContext context, Store<EntityStore> store)

Fields:
private final RequiredArg<Boolean> reserveArg
private final EntityWrappedArg entityArg
