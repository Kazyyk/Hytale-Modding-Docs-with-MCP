# ConvertPrefabsCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility | Extends: AbstractAsyncCommand

public class ConvertPrefabsCommand extends AbstractAsyncCommand

## Fields

- private static final String UNABLE_TO_LOAD_MODEL
- private static final String FAILED_TO_FIND_BLOCK
- private static final int BATCH_SIZE
- private static final long DELAY_BETWEEN_BATCHES_MS

## Methods

- public ConvertPrefabsCommand()
- protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- private void sendCompletionMessages(@Nonnull CommandContext context, @Nonnull Path assetPath, @Nonnull List<String> failed, @Nonnull List<String> skipped)
- private CompletableFuture<Void> convertPath( @Nonnull Path assetPath, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, @Nonnull List<String> failed, @Nonnull List<String> skipped )
- private CompletableFuture<Void> processPrefabsInBatches( @Nonnull List<Path> prefabPaths, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, @Nullable CompletableFuture<World> conversionWorldFuture, @Nonnull List<String> failed, @Nonnull List<String> skipped )
- private CompletableFuture<Void> processPrefab( @Nonnull Path path, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, @Nullable CompletableFuture<World> conversionWorldFuture, @Nonnull List<String> failed, @Nonnull List<String> skipped )
