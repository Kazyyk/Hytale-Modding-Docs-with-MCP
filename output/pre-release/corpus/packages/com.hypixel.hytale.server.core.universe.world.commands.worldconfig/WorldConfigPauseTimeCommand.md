# WorldConfigPauseTimeCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.worldconfig | Extends: AbstractWorldCommand

public class WorldConfigPauseTimeCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- WorldConfigPauseTimeCommand() | Creates a new WorldConfigPauseTimeCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.
- pauseTime(@Nonnull CommandSender commandSender, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | static public method.

Also in this package: WorldConfigCommand, WorldConfigSeedCommand, WorldConfigSetPvpCommand, WorldConfigSetSpawnCommand, WorldConfigSetSpawnDefaultCommand, WorldPauseCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  public static void pauseTime(CommandSender commandSender, World world, Store<EntityStore> store)
