# Argument

Type: abstract class | Package: com.hypixel.hytale.server.core.command.system.arguments.system | Extends: Argument<Arg, DataType>, DataType>

public abstract class Argument<Arg extends Argument<Arg, DataType>, DataType>

## Fields

- private final String name
- private final String description
- private final ArgumentType<DataType> argumentType
- private SuggestionProvider suggestionProvider
- private List<Validator<DataType>> validators
- private final AbstractCommand commandRegisteredTo

## Methods

- public Arg addValidator(@Nonnull Validator<DataType> validator)
- public void validate(@Nonnull DataType data, @Nonnull ParseResult parseResult)
- public boolean provided(@Nonnull CommandContext context)
- public DataType get(@Nonnull CommandContext context)
- @Nonnull protected abstract Arg getThis()
- @Nullable public DataType getProcessed(@Nonnull CommandContext context)
- public Arg suggest(@Nonnull SuggestionProvider suggestionProvider)
- @Nonnull public List<String> getSuggestions(@Nonnull CommandSender sender, @Nonnull String[] textAlreadyEntered)
- @Nonnull public abstract Message getUsageMessage()
- @Nonnull public abstract Message getUsageOneLiner()
- @Nonnull public AbstractCommand getCommandRegisteredTo()
- @Nonnull public String getName()
- @Nonnull public ArgumentType<DataType> getArgumentType()
- @Nullable public String getDescription()
- @Override @Nonnull public String toString()

Known subclasses: AbstractOptionalArg, RequiredArg

Also in this package: AbstractOptionalArg, ArgWrapper, DefaultArg, DefaultValueArgument, FlagArg, OptionalArg, RequiredArg, WrappedArg

Complete API:
  public Arg addValidator(Validator<DataType> validator)
  public void validate(DataType data, ParseResult parseResult)
  public boolean provided(CommandContext context)
  public DataType get(CommandContext context)
  protected abstract Arg getThis()
  public DataType getProcessed(CommandContext context)
  public Arg suggest(SuggestionProvider suggestionProvider)
  public List<String> getSuggestions(CommandSender sender, String[] textAlreadyEntered)
  public abstract Message getUsageMessage()
  public abstract Message getUsageOneLiner()
  public AbstractCommand getCommandRegisteredTo()
  public String getName()
  public ArgumentType<DataType> getArgumentType()
  public String getDescription()
  public String toString()

Fields:
private final String name
private final String description
private final ArgumentType<DataType> argumentType
private SuggestionProvider suggestionProvider
private List<Validator<DataType>> validators
private final AbstractCommand commandRegisteredTo
