# JsonResourceLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Implements: AssetLoader<T>

public class JsonResourceLoader<T extends JsonElement> implements AssetLoader<T>

An `AssetLoader` implementation that reads JSON from an `InputStream` using Gson's lenient parser. Validates the parsed element against a predicate and maps it to the target type.

## Type Parameters

- `T` -- the target JSON element type (e.g. `JsonElement`, `JsonArray`, `JsonObject`)

## Constructor


public JsonResourceLoader(@Nonnull Class<T> type, @Nonnull Predicate<JsonElement> predicate, @Nonnull Function<JsonElement, T> mapper)

## Methods

- type() | Class<T> | The target element class.
- load(@Nonnull InputStream in) | T | Parses JSON from the stream in lenient mode, validates, and maps.

## Related Types

- JsonLoader -- uses `JsonResourceLoader` instances as static constants

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public Class<T> type()
  public T load(InputStream in)

Fields:
private final Class<T> type
private final Predicate<JsonElement> predicate
private final Function<JsonElement,T> mapper
