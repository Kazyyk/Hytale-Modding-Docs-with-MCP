# AbstractAsyncPlayerCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractAsyncPlayerCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for AsyncPlayerCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG

## Methods

- public AbstractAsyncPlayerCommand(@Nonnull String name, @Nonnull String description)
- public AbstractAsyncPlayerCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractAsyncPlayerCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- @Nonnull protected abstract CompletableFuture<Void> executeAsync(@Nonnull CommandContext var1, @Nonnull Store<EntityStore> var2, @Nonnull Ref<EntityStore> var3, @Nonnull PlayerRef var4, @Nonnull World var5)

Known subclasses: NPCDescriptorsCommand, PrefabEditBackCommand, PrefabEditCreateNewCommand, PrefabEditExitCommand, PrefabEditLoadCommand, PrefabEditSaveAsCommand, PrefabEditSaveCommand

Also in this package: AbstractAsyncCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, CommandBase

Complete API:
  protected final CompletableFuture<Void> executeAsync(CommandContext context)
  protected abstract CompletableFuture<Void> executeAsync(CommandContext var1, Store<EntityStore> var2, Ref<EntityStore> var3, PlayerRef var4, World var5)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG
