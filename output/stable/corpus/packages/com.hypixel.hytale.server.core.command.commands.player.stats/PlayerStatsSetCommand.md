# PlayerStatsSetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.stats | Extends: AbstractTargetPlayerCommand

public class PlayerStatsSetCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- PlayerStatsSetCommand() | Creates a new PlayerStatsSetCommand instance.

Also in this package: PlayerStatsAddCommand, PlayerStatsDumpCommand, PlayerStatsGetCommand, PlayerStatsResetCommand, PlayerStatsSetToMaxCommand, PlayerStatsSubCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
private final RequiredArg<Integer> statValueArg
