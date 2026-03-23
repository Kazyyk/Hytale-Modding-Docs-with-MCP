# PlayerStatsGetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.stats | Extends: AbstractTargetPlayerCommand

public class PlayerStatsGetCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- PlayerStatsGetCommand() | Creates a new PlayerStatsGetCommand instance.

Also in this package: PlayerStatsAddCommand, PlayerStatsDumpCommand, PlayerStatsResetCommand, PlayerStatsSetCommand, PlayerStatsSetToMaxCommand, PlayerStatsSubCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
