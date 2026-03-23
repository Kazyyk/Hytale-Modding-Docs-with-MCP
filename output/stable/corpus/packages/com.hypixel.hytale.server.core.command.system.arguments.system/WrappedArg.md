# WrappedArg

Type: abstract class | Package: com.hypixel.hytale.server.core.command.system.arguments.system

public abstract class WrappedArg<BasicType>

## Fields

- protected final Argument<?, BasicType> arg

## Methods

- public boolean provided(@Nonnull CommandContext context)
- @Nonnull public String getName()
- @Nonnull public String getDescription()
- @Nonnull public Argument<?, BasicType> getArg()
- protected BasicType get(@Nonnull CommandContext context)

Known subclasses: EntityWrappedArg

Also in this package: AbstractOptionalArg, ArgWrapper, Argument, DefaultArg, DefaultValueArgument, FlagArg, OptionalArg, RequiredArg

Complete API:
  public boolean provided(CommandContext context)
  public String getName()
  public String getDescription()
  public D addAliases(String aliases)
  public Argument<?,BasicType> getArg()
  protected BasicType get(CommandContext context)

Fields:
protected final Argument<?,BasicType> arg
