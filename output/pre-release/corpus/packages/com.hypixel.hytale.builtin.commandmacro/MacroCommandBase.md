# MacroCommandBase

Type: class | Package: com.hypixel.hytale.builtin.commandmacro | Extends: AbstractAsyncCommand

public class MacroCommandBase extends AbstractAsyncCommand

## Fields

- private static final Pattern regexBracketPattern
- private static final Pattern PATTERN
- private final Map<String, String> defaultValueStrings

## Methods

- @Nullable private <D> Argument<?, ?> withDefaultArg( String name, String description, @Nonnull ArgumentType<D> argumentType, @Nonnull String defaultValue, String defaultValueDescription, @Nonnull ParseResult parseResult )
- @Override @Nonnull protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: ArgumentTypeEnum, EchoCommand, MacroCommandBuilder, MacroCommandParameter, MacroCommandPlugin, MacroCommandReplacement, ParameterRequirement, WaitCommand

Complete API:
  private Argument<?,?> withDefaultArg(String name, String description, ArgumentType<D> argumentType, String defaultValue, String defaultValueDescription, ParseResult parseResult)
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
public static final HytaleLogger LOGGER
private static final Pattern regexBracketPattern
private static final Pattern PATTERN
private final Map<String,Argument<?,?>> arguments
private final List<Pair<String,List<MacroCommandReplacement>>> commandReplacements
private final Map<String,String> defaultValueStrings
