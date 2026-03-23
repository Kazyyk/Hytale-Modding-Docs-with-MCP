# GameModeCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractPlayerCommand

public class GameModeCommand extends AbstractPlayerCommand

Server command that changes a player's game mode. Supports self and other-player targeting. Aliases: `gm`.

Also in this package: DamageCommand, DamageOtherCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_GAMEMODE_ALREADY_IN_MODE_SELF
private final RequiredArg<GameMode> gameModeArg
