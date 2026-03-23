# WorldPerfGraphCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world.perf | Extends: AbstractWorldCommand

public class WorldPerfGraphCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- WorldPerfGraphCommand() | Creates a new WorldPerfGraphCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.

Also in this package: WorldPerfCommand, WorldPerfResetCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final DefaultArg<Integer> widthArg
private final DefaultArg<Integer> heightArg
