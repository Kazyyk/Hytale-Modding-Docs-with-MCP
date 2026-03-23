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
