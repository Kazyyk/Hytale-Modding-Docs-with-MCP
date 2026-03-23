# ArgumentType

Type: class | Package: com.hypixel.hytale.server.core.command.system.arguments.types | Extends: java.lang.Object | Implements: SuggestionProvider

public abstract class ArgumentType<DataType> implements SuggestionProvider

Abstract base class for command argument types. Defines the contract for parsing string input into a typed value, providing tab-completion suggestions, and reporting usage information.

## Methods


@Nullable
public abstract DataType parse(@Nonnull String[] var1, @Nonnull ParseResult var2)

Parses the input string array into the target data type. Returns `null` on parse failure.


@Nonnull
public Message getArgumentUsage()

Returns a localized message describing argument usage.


public int getNumberOfParameters()

Returns the number of string parameters this argument type consumes.


@Nonnull
public Message getName()

Returns the localized name of this argument type.


@Nonnull
public String[] getExamples()

Returns example values for this argument type.


public boolean isListArgument()

Returns whether this argument accepts a list of values.


public boolean isGreedyString()

Returns whether this argument consumes all remaining input.


@Override
public void suggest(@Nonnull CommandSender sender, @Nonnull String textAlreadyEntered, int numParametersTyped, @Nonnull SuggestionResult result)

Populates tab-completion suggestions. Default implementation provides no suggestions.

## Related Types

- ArgTypes -- registry of built-in argument types
- `AbstractCommand` -- commands use argument types for parameter definitions

Known subclasses: BooleanFlagArgumentType, ListArgumentType, MultiArgumentType, ProcessedArgumentType, SingleArgumentType

Also in this package: AbstractAssetArgumentType, ArgTypes, AssetArgumentType, BooleanFlagArgumentType, Coord, EntityWrappedArg, EnumArgumentType, GameModeArgumentType, IntCoord, IntegerComparisonOperator, IntegerOperation, ListArgumentType, MultiArgumentContext, MultiArgumentType, ProcessedArgumentType, RelativeChunkPosition, RelativeDirection, RelativeDoublePosition, RelativeFloat, RelativeIntPosition (and 5 more)

Complete API:
  public DataType processedGet(CommandSender sender, CommandContext context, Argument<?,DataType> argument)
  public void suggest(CommandSender sender, String textAlreadyEntered, int numParametersTyped, SuggestionResult result)
  public abstract DataType parse(String[] var1, ParseResult var2)
  public Message getArgumentUsage()
  public int getNumberOfParameters()
  public Message getName()
  public String[] getExamples()
  public boolean isListArgument()
  public boolean isGreedyString()
  public String toString()

Fields:
public static final String[] EMPTY_EXAMPLES
private final Message name
private final Message argumentUsage
protected final String[] examples
protected int numberOfParameters
