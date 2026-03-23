# WaitCommand

Type: class | Package: com.hypixel.hytale.builtin.commandmacro | Extends: AbstractAsyncCommand

public class WaitCommand extends AbstractAsyncCommand

## Fields

- private static final long MILLISECONDS_TO_SECONDS_MULTIPLIER
- public static final Runnable EMPTY_RUNNABLE
- private final RequiredArg<Float> timeArg
- private final FlagArg printArg

## Methods

- @Override @Nonnull protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: ArgumentTypeEnum, EchoCommand, MacroCommandBase, MacroCommandBuilder, MacroCommandParameter, MacroCommandPlugin, MacroCommandReplacement, ParameterRequirement

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private static final long MILLISECONDS_TO_SECONDS_MULTIPLIER
public static final Runnable EMPTY_RUNNABLE
private final RequiredArg<Float> timeArg
private final FlagArg printArg
