# WorldGenBenchmarkCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.worldgen | Extends: CommandBase

public class WorldGenBenchmarkCommand extends CommandBase

Console command handling WorldGenBenchmark operations.

## Constants

- private static final AtomicBoolean IS_RUNNING
- public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_SAVING
- public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_SAVE_FAILED
- public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ABORT

## Fields

- @Nonnull private final OptionalArg<World> worldArg
- @Nonnull private final OptionalArg<Integer> seedArg
- @Nonnull private final RequiredArg<Vector2i> pos1Arg
- @Nonnull private final RequiredArg<Vector2i> pos2Arg

## Methods

- public WorldGenBenchmarkCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: WorldGenCommand, WorldGenReloadCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final AtomicBoolean IS_RUNNING
public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_SAVING
public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_SAVE_FAILED
public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ABORT
public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_BENCHMARK_NOT_SUPPORTED
public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ALREADY_IN_PROGRESS
private final OptionalArg<World> worldArg
private final OptionalArg<Integer> seedArg
private final RequiredArg<Vector2i> pos1Arg
private final RequiredArg<Vector2i> pos2Arg
