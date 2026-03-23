# PlayerRespawnCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractPlayerCommand

public class PlayerRespawnCommand extends AbstractPlayerCommand

Server command that forces a player to respawn via `DeathComponent.respawn()`. Supports self and other-player targeting.

Also in this package: DamageCommand, DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_PLAYER_RESPAWN_SUCCESS_SELF
