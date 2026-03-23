# WorldConfigSetSpawnCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.worldconfig | Extends: AbstractWorldCommand

public class WorldConfigSetSpawnCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- WorldConfigSetSpawnCommand() | Creates a new WorldConfigSetSpawnCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.

Also in this package: WorldConfigCommand, WorldConfigPauseTimeCommand, WorldConfigSeedCommand, WorldConfigSetPvpCommand, WorldConfigSetSpawnDefaultCommand, WorldPauseCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final DecimalFormat DECIMAL
private static final Message MESSAGE_COMMANDS_ERROR_PROVIDE_POSITION
private final OptionalArg<RelativeDoublePosition> positionArg
private final DefaultArg<Vector3f> rotationArg
