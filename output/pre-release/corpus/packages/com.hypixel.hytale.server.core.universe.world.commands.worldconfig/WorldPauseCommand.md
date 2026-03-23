# WorldPauseCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.worldconfig | Extends: AbstractWorldCommand

public class WorldPauseCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- WorldPauseCommand() | Creates a new WorldPauseCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.

Also in this package: WorldConfigCommand, WorldConfigPauseTimeCommand, WorldConfigSeedCommand, WorldConfigSetPvpCommand, WorldConfigSetSpawnCommand, WorldConfigSetSpawnDefaultCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_PAUSE_TOO_MANY_PLAYERS
