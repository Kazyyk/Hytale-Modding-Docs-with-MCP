# ValidateCPBCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility | Extends: AbstractAsyncCommand

public class ValidateCPBCommand extends AbstractAsyncCommand

## Fields

- private static final String UNABLE_TO_LOAD_MODEL
- private static final String FAILED_TO_FIND_BLOCK

## Methods

- public ValidateCPBCommand()
- protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- private static void convertPrefabs(@Nonnull CommandContext context, @Nonnull Path assetPath)

Also in this package: BackupCommand, ConvertPrefabsCommand, EventTitleCommand, NotifyCommand, StashCommand, UIGalleryCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)
  private static void convertPrefabs(CommandContext context, Path assetPath)

Fields:
private static final String UNABLE_TO_LOAD_MODEL
private static final String FAILED_TO_FIND_BLOCK
private final OptionalArg<String> pathArg
