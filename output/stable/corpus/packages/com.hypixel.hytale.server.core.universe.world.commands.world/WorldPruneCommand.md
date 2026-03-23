# WorldPruneCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world | Extends: AbstractAsyncCommand

public class WorldPruneCommand extends AbstractAsyncCommand

Console command handling WorldPrune operations.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_PRUNE_NONE_TO_PRUNE
- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_PRUNE_PRUNE_ERROR

## Methods

- public WorldPruneCommand()
- @Nonnull @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: CompactCommand, WorldAddCommand, WorldCommand, WorldListCommand, WorldLoadCommand, WorldRemoveCommand, WorldRocksDbCommand, WorldSaveCommand, WorldSetDefaultCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private static final Message MESSAGE_COMMANDS_WORLD_PRUNE_NONE_TO_PRUNE
private static final Message MESSAGE_COMMANDS_WORLD_PRUNE_PRUNE_ERROR
