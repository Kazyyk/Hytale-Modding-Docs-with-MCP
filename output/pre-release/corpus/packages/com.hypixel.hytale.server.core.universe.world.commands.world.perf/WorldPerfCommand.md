# WorldPerfCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world.perf | Extends: AbstractWorldCommand

public class WorldPerfCommand extends AbstractWorldCommand

Abstract base for related commands.

## Fields

- PRECISION | double | Static final double field.

## Constructors

- WorldPerfCommand() | Creates a new WorldPerfCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.
- tpsFromDelta(long delta, long min) | double | static public method.
- tpsFromDelta(double delta, long min) | double | static public method.

Also in this package: WorldPerfGraphCommand, WorldPerfResetCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  public static double tpsFromDelta(long delta, long min)
  public static double tpsFromDelta(double delta, long min)

Fields:
public static final double PRECISION
private final FlagArg allFlag
private final FlagArg deltaFlag
