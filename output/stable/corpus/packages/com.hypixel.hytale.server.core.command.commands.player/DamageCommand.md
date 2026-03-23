# DamageCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player | Extends: AbstractPlayerCommand

public class DamageCommand extends AbstractPlayerCommand

Server command that deals damage to a player. Supports self-damage and targeting other players with configurable amount and a silent flag. Aliases: `hurt`.

Also in this package: DamageOtherCommand, GameModeCommand, GameModeOtherCommand, HideAllCommand, HideCommand, HidePlayerCommand, KillCommand, KillOtherCommand, PlayerCommand, PlayerResetCommand, PlayerRespawnCommand, PlayerRespawnOtherCommand, PlayerZoneCommand, ReferCommand, ShowAllCommand, ShowPlayerCommand, SudoCommand, ToggleBlockPlacementOverrideCommand, WhereAmICommand, WhereAmIOtherCommand (and 2 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final OptionalArg<Double> amountArg
private final FlagArg silentArg
