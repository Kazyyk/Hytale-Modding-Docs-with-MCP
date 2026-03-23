# AbstractCommandCollection

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractCommandCollection extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for CommandCollection subclasses.

## Methods

- public AbstractCommandCollection(@Nonnull String name, @Nonnull String description)
- @Nonnull public Message getFullUsage(@Nonnull CommandSender sender)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- @Nonnull @Override public Message getUsageString(@Nonnull CommandSender sender)
