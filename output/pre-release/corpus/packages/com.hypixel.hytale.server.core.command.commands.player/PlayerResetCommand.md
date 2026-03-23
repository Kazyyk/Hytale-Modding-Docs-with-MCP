# PlayerResetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractTargetPlayerCommand

public class PlayerResetCommand extends AbstractTargetPlayerCommand

Server command that resets a player's persistent data via `Universe.resetPlayer()`. Supports targeting self or another player.

Also in this package: DamageCommand, DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)
