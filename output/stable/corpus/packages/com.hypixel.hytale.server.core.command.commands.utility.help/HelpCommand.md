# HelpCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.help | Extends: AbstractAsyncCommand

public class HelpCommand extends AbstractAsyncCommand

Abstract base for related commands.

## Constructors

- HelpCommand() | Creates a new HelpCommand instance.

## Methods

- executeAsync(@Nonnull CommandContext context) | CompletableFuture<Void> | protected method.
- openHelpUI(@Nonnull CommandContext context, @Nullable String initialCommand) | CompletableFuture<Void> | static package-private method.
- resolveCommandName(@Nullable String commandNameOrAlias) | String | static private method.
