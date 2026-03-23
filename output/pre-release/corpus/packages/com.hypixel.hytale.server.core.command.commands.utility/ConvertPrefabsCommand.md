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

Also in this package: BackupCommand, EventTitleCommand, NotifyCommand, StashCommand, UIGalleryCommand, ValidateCPBCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)
  private void sendCompletionMessages(CommandContext context, Path assetPath, List<String> failed, List<String> skipped)
  private CompletableFuture<Void> convertPath(Path assetPath, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, boolean onlySerializeIfUnknown, List<String> failed, List<String> skipped)
  private CompletableFuture<Void> processPrefabsInBatches(List<Path> prefabPaths, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, boolean onlySerializeIfUnknown, CompletableFuture<World> conversionWorldFuture, List<String> failed, List<String> skipped)
  private CompletableFuture<Void> processPrefab(Path path, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, boolean onlySerializeIfUnknown, CompletableFuture<World> conversionWorldFuture, List<String> failed, List<String> skipped)

Fields:
private static final String UNABLE_TO_LOAD_MODEL
private static final String FAILED_TO_FIND_BLOCK
private static final int BATCH_SIZE
private static final long DELAY_BETWEEN_BATCHES_MS
private static final Message MESSAGE_COMMANDS_CONVERT_PREFABS_FAILED
private static final Message MESSAGE_COMMANDS_CONVERT_PREFABS_DEFAULT_WORLD_NULL
private final FlagArg blocksFlag
private final FlagArg fillerFlag
private final FlagArg relativeFlag
private final FlagArg entitiesFlag
private final FlagArg destructiveFlag
private final FlagArg onlyUnknownFlag
private final OptionalArg<String> pathArg
private final DefaultArg<String> storeArg
