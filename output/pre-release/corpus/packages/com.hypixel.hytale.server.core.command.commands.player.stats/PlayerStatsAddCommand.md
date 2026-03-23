# PlayerStatsAddCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.stats | Extends: AbstractTargetPlayerCommand

public class PlayerStatsAddCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- PlayerStatsAddCommand() | Creates a new PlayerStatsAddCommand instance.

Also in this package: PlayerStatsDumpCommand, PlayerStatsGetCommand, PlayerStatsResetCommand, PlayerStatsSetCommand, PlayerStatsSetToMaxCommand, PlayerStatsSubCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
private final RequiredArg<Integer> statAmountArg
