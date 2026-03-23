# InstanceMigrateCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractAsyncCommand

public class InstanceMigrateCommand extends AbstractAsyncCommand

Server command implementation.

## Methods

- super("migrate", "server.commands.instances.migrate.desc")
- @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- @Nonnull private static CompletableFuture<Void> migrateInstance(@Nonnull CommandContext context, @Nonnull String asset, @Nonnull WorldConfig config, @Nonnull AtomicLong chunkCount, @Nonnull AtomicLong chunksMigrated)
