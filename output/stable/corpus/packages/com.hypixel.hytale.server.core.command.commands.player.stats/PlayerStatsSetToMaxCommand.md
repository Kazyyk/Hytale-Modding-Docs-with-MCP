# PlayerStatsSetToMaxCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.stats | Extends: AbstractTargetPlayerCommand

public class PlayerStatsSetToMaxCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- PlayerStatsSetToMaxCommand() | Creates a new PlayerStatsSetToMaxCommand instance.

Also in this package: PlayerStatsAddCommand, PlayerStatsDumpCommand, PlayerStatsGetCommand, PlayerStatsResetCommand, PlayerStatsSetCommand, PlayerStatsSubCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
