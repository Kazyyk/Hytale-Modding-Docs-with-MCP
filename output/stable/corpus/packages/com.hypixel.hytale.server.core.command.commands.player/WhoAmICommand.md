# WhoAmICommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractPlayerCommand

public class WhoAmICommand extends AbstractPlayerCommand

Server command that displays player identity information (UUID, username, language). Supports self and other-player targeting. Aliases: `uuid`.

Also in this package: DamageCommand, DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static void sendPlayerInfo(CommandContext context, PlayerRef playerRef)

Fields:
public static final String UUID_ALIAS
