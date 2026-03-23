# FloatRangeJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class FloatRangeJsonLoader<K extends SeedResource> extends JsonLoader<K, IFloatRange>

Loads float range configurations. Mirrors `DoubleRangeJsonLoader` but uses `float` precision. Supports constant, normal (min/max), and array range types with an optional transform function.

## Key Methods

- `load()`

## Related Types

- FloatRangeJsonLoader.Constants -- KEY_MIN, KEY_MAX
- FloatRangeJsonLoader.FloatToFloatFunction -- functional interface for value transformation

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public IFloatRange load()

Fields:
protected final float default1
protected final float default2
protected final FloatRangeJsonLoader.FloatToFloatFunction function
