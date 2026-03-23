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
