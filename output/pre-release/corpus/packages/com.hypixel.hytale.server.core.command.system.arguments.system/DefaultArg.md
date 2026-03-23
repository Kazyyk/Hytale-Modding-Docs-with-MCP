# DefaultArg

Type: class | Package: com.hypixel.hytale.server.core.command.system.arguments.system | Extends: AbstractOptionalArg<DefaultArg<DataType>, DataType> | Implements: AbstractOptionalArg.DefaultValueArgument<DataType>

public class DefaultArg<DataType> extends AbstractOptionalArg<DefaultArg<DataType>, DataType> implements AbstractOptionalArg.DefaultValueArgument<DataType>

## Fields

- private final DataType defaultValue
- private final String defaultValueDescription

## Methods

- @Nonnull protected DefaultArg<DataType> getThis()
- @Override public final DataType getDefaultValue()
- public void validateDefaultValue(@Nonnull ParseResult parseResult)
- @Override @Nonnull public Message getUsageMessage()
- @Override @Nonnull public Message getUsageOneLiner()
- @Nonnull public String getDefaultValueDescription()

Also in this package: AbstractOptionalArg, ArgWrapper, Argument, DefaultValueArgument, FlagArg, OptionalArg, RequiredArg, WrappedArg

Complete API:
  protected DefaultArg<DataType> getThis()
  public final DataType getDefaultValue()
  public void validateDefaultValue(ParseResult parseResult)
  public Message getUsageMessage()
  public Message getUsageOneLiner()
  public String getDefaultValueDescription()

Fields:
private final DataType defaultValue
private final String defaultValueDescription
