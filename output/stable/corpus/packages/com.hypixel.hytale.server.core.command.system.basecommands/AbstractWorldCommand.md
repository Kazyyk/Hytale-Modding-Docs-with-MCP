# AbstractWorldCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractWorldCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for WorldCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_NO_WORLD

## Fields

- @Nonnull private final OptionalArg<World> worldArg

## Methods

- public AbstractWorldCommand(@Nonnull String name, @Nonnull String description)
- public AbstractWorldCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractWorldCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- protected abstract void execute(@Nonnull CommandContext var1, @Nonnull World var2, @Nonnull Store<EntityStore> var3)
