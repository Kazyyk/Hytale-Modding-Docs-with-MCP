# AbstractPlayerCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractPlayerCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for PlayerCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG

## Methods

- public AbstractPlayerCommand(@Nonnull String name, @Nonnull String description)
- public AbstractPlayerCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractPlayerCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- protected abstract void execute(@Nonnull CommandContext var1, @Nonnull Store<EntityStore> var2, @Nonnull Ref<EntityStore> var3, @Nonnull PlayerRef var4, @Nonnull World var5)
