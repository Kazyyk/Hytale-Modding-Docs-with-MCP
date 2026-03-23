# WorldGenReloadCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.worldgen | Extends: AbstractAsyncWorldCommand

public class WorldGenReloadCommand extends AbstractAsyncWorldCommand

Console command handling WorldGenReload operations.

## Constants

- private static final AtomicBoolean IS_RUNNING
- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_STARTED
- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_COMPLETE
- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_DELETING_CHUNKS
- @Nonnull public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ABORT

## Fields

- @Nonnull private final FlagArg clearArg

## Methods

- public WorldGenReloadCommand()
- @Nonnull @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context, @Nonnull World world)
- @Nonnull private static CompletableFuture<Void> clearChunks(@Nonnull CommandContext context, @Nonnull World world)

Also in this package: WorldGenBenchmarkCommand, WorldGenCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, World world)
  private static CompletableFuture<Void> clearChunks(CommandContext context, World world)

Fields:
private static final AtomicBoolean IS_RUNNING
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_STARTED
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_COMPLETE
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_CHUNK_SAVING_DISABLED
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_DELETING_CHUNKS
private static final Message MKESSAGE_COMMANDS_WORLD_GEN_RELOAD_CHUNK_SAVING_ENABLED
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_REGENERATING_LOADED_CHUNKS
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_CHUNK_SAVING_ENABLED
private static final Message MESSAGE_COMMANDS_WORLD_GEN_RELOAD_ALREADY_IN_PROGRESS
public static final Message MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ABORT
private final FlagArg clearArg
