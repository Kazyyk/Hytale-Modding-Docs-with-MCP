# TeleportToPlayerCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport.variant

public class TeleportToPlayerCommand

Teleports the command sender to a target player.

Also in this package: TeleportOtherToPlayerCommand, TeleportPlayerToCoordinatesCommand, TeleportToCoordinatesCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_TARGET_NOT_IN_WORLD
private final RequiredArg<PlayerRef> targetPlayerArg
