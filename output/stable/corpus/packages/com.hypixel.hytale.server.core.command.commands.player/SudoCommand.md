# SudoCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: CommandBase

public class SudoCommand extends CommandBase

Server command that executes a command as another player. Supports targeting a specific player by name or all players with `*`. Aliases: `su`.

Also in this package: DamageCommand, DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_COMMANDS_SU_INVALID_USAGE
private final RequiredArg<String> playerArg
