# TeleportPlayerToCoordinatesCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport.variant

public class TeleportPlayerToCoordinatesCommand

Teleports a specified player to coordinates.

Also in this package: TeleportOtherToPlayerCommand, TeleportToCoordinatesCommand, TeleportToPlayerCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private final RequiredArg<PlayerRef> playerArg
private final RequiredArg<Coord> xArg
private final RequiredArg<Coord> yArg
private final RequiredArg<Coord> zArg
private final OptionalArg<RelativeFloat> yawArg
private final OptionalArg<RelativeFloat> pitchArg
private final OptionalArg<RelativeFloat> rollArg
