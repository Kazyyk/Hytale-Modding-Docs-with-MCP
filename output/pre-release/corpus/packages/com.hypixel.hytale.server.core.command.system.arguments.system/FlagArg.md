# FlagArg

Type: class | Package: com.hypixel.hytale.server.core.command.system.arguments.system | Extends: AbstractOptionalArg<FlagArg, Boolean> | Implements: AbstractOptionalArg.DefaultValueArgument<Boolean>

public class FlagArg extends AbstractOptionalArg<FlagArg, Boolean> implements AbstractOptionalArg.DefaultValueArgument<Boolean>

## Fields

- private static final BooleanFlagArgumentType BOOLEAN_FLAG_ARGUMENT_TYPE

## Methods

- @Nonnull protected FlagArg getThis()
- @Nonnull public Boolean getDefaultValue()
- @Override @Nonnull public Message getUsageMessage()
- @Override @Nonnull public Message getUsageOneLiner()

Also in this package: AbstractOptionalArg, ArgWrapper, Argument, DefaultArg, DefaultValueArgument, OptionalArg, RequiredArg, WrappedArg

Complete API:
  protected FlagArg getThis()
  public Boolean getDefaultValue()
  public Message getUsageMessage()
  public Message getUsageOneLiner()

Fields:
private static final BooleanFlagArgumentType BOOLEAN_FLAG_ARGUMENT_TYPE
