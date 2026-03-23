# AbstractTargetPlayerCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractTargetPlayerCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for TargetPlayerCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD

## Fields

- @Nonnull private final OptionalArg<PlayerRef> playerArg

## Methods

- public AbstractTargetPlayerCommand(@Nonnull String name, @Nonnull String description)
- public AbstractTargetPlayerCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractTargetPlayerCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- protected abstract void execute(@Nonnull CommandContext var1,
        @Nullable Ref<EntityStore> var2,
        @Nonnull Ref<EntityStore> var3,
        @Nonnull PlayerRef var4,
        @Nonnull World var5,
        @Nonnull Store<EntityStore> var6)` |
