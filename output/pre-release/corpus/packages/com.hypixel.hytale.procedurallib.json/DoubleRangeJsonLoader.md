# DoubleRangeJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class DoubleRangeJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleRange>

Loads double range configurations. Supports constant (single value), normal (min/max), array (1 or 2 elements), and threshold-based (Thresholds/Values arrays) range types. Applies an optional transform function.

## Key Methods

- `load()`
- `loadThreshold()`

## Related Types

- DoubleRangeJsonLoader.Constants -- KEY_MIN, KEY_MAX, KEY_THRESHOLDS, KEY_VALUES
- DoubleRangeJsonLoader.DoubleToDoubleFunction -- functional interface for value transformation

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public IDoubleRange load()
  protected IDoubleRange loadThreshold()

Fields:
protected final double default1
protected final double default2
protected final DoubleRangeJsonLoader.DoubleToDoubleFunction function
