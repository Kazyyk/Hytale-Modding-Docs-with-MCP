# AbstractAsyncWorldCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractAsyncWorldCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for AsyncWorldCommand subclasses.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_ERRORS_NO_WORLD

## Fields

- @Nonnull private final OptionalArg<World> worldArg

## Methods

- public AbstractAsyncWorldCommand(@Nonnull String name, @Nonnull String description)
- public AbstractAsyncWorldCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractAsyncWorldCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- @Nonnull protected abstract CompletableFuture<Void> executeAsync(@Nonnull CommandContext var1, @Nonnull World var2)

Known subclasses: CompactCommand, StressTestStartCommand, WorldGenReloadCommand

Also in this package: AbstractAsyncCommand, AbstractAsyncPlayerCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetEntityCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, CommandBase

Complete API:
  protected final CompletableFuture<Void> executeAsync(CommandContext context)
  protected abstract CompletableFuture<Void> executeAsync(CommandContext var1, World var2)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_NO_WORLD
private final OptionalArg<World> worldArg
