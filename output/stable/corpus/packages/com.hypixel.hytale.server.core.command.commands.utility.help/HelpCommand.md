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

Also in this package: HelpCommandVariant

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)
  static CompletableFuture<Void> openHelpUI(CommandContext context, String initialCommand)
  private static String resolveCommandName(String commandNameOrAlias)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
