# AbstractAsyncCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractCommand

public abstract class AbstractAsyncCommand extends AbstractCommand

Abstract base class extending `AbstractCommand` that provides shared logic for AsyncCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_MODULES_COMMAND_RUNTIME_ERROR

## Methods

- public AbstractAsyncCommand(@Nonnull String name, @Nonnull String description)
- public AbstractAsyncCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractAsyncCommand(@Nonnull String description)
- @Override protected final CompletableFuture<Void> execute(@Nonnull CommandContext context)
- @Nonnull protected abstract CompletableFuture<Void> executeAsync(@Nonnull CommandContext var1)
- @Nonnull public CompletableFuture<Void> runAsync(@Nonnull CommandContext context, @Nonnull Runnable runnable, @Nonnull Executor executor)

Known subclasses: AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, AssetLongestAssetNameCommand, AssetsDuplicatesCommand, BackupCommand, BanCommand, ConvertPrefabsCommand, GenerateI18nCommand, GiveArmorCommand, HelpCommand, HelpCommandVariant, HidePlayerCommand, InstanceEditCopyCommand, InstanceEditListCommand, InstanceEditLoadCommand, InstanceEditNewCommand, InstanceMigrateCommand, MacroCommandBase, ShowPlayerCommand, StressTestStopCommand, UIGalleryCommand, UnbanCommand, UpdateAssetsGitCommand, UpdateCheckCommand, UpdateDownloadCommand, UpdatePrefabsGitCommand, ValidateCPBCommand, WaitCommand, WhitelistAddCommand, WhitelistRemoveCommand, WhoCommand, WorldPruneCommand, WorldSaveCommand

Also in this package: AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, CommandBase

Complete API:
  protected final CompletableFuture<Void> execute(CommandContext context)
  protected abstract CompletableFuture<Void> executeAsync(CommandContext var1)
  public CompletableFuture<Void> runAsync(CommandContext context, Runnable runnable, Executor executor)

Fields:
private static final Message MESSAGE_MODULES_COMMAND_RUNTIME_ERROR
