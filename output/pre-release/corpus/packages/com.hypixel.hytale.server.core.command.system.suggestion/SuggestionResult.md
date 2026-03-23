# SuggestionResult

Type: class | Package: com.hypixel.hytale.server.core.command.system.suggestion

public class SuggestionResult

Utility type in the `suggestion` subsystem.

## Accessors

- getSuggestions() | List<String> | Accessor method.

## Methods

- suggest(String suggestion) | SuggestionResult | Instance method.
- suggest(Function<DataType, String> toStringFunction, DataType suggestion) | SuggestionResult | Instance method.
- suggest(Object objectToString) | SuggestionResult | Instance method.

Also in this package: SuggestionProvider

Complete API:
  public SuggestionResult suggest(String suggestion)
  public SuggestionResult suggest(Function<DataType,String> toStringFunction, DataType suggestion)
  public SuggestionResult suggest(Object objectToString)
  public List<String> getSuggestions()
  public SuggestionResult fuzzySuggest(String input, Collection<DataType> items, Function<DataType,String> toStringFunction)

Fields:
private static final int FUZZY_SUGGESTION_MAX_RESULTS
private static final Comparator<IntObjectPair<String>> INTEGER_STRING_PAIR_COMPARATOR
private final List<String> suggestions
