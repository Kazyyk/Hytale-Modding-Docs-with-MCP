# ReferCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractTargetPlayerCommand

public class ReferCommand extends AbstractTargetPlayerCommand

Server command that transfers a player to another server by host and port. Supports self and other-player targeting. Aliases: `transfer`.

Also in this package: DamageCommand, DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> hostArg
private final RequiredArg<Integer> portArg
