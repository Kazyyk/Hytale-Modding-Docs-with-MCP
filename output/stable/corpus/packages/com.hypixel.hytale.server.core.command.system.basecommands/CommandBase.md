# CommandBase

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractCommand

public abstract class CommandBase extends AbstractCommand

Abstract base class extending `AbstractCommand` that provides shared logic for CommandBase subclasses.

## Methods

- public CommandBase(@Nonnull String name, @Nonnull String description)
- public CommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public CommandBase(@Nonnull String description)
- @Nullable @Override protected final CompletableFuture<Void> execute(@Nonnull CommandContext context)
- protected abstract void executeSync(@Nonnull CommandContext var1)
