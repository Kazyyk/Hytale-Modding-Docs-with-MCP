# WhereAmICommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractPlayerCommand

public class WhereAmICommand extends AbstractPlayerCommand

Server command that displays detailed location information including world name, chunk coordinates, position, rotation, and axis direction. Supports self and other-player targeting.

Also in this package: DamageCommand, DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static void sendLocationInfo(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, World world, String targetUsername)

Fields:
private static final Message MESSAGE_COMMANDS_WHERE_AM_I_CHUNK_NOT_LOADED
