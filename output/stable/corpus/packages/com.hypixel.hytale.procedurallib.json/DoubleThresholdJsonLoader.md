# DoubleThresholdJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class DoubleThresholdJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleThreshold>

Loads double threshold configurations. Produces `DefaultDoubleThresholdCondition` (null input), `DoubleThreshold.Single` (primitive or [low, high]), or `DoubleThreshold.Multiple` (array of [low, high] pairs).

## Key Methods

- `load()`

## Related Types

- DoubleThresholdJsonLoader.Constants -- error messages

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public IDoubleThreshold load()

Fields:
protected final boolean defaultValue
