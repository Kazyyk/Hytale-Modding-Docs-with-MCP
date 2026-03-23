# DoubleConditionJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class DoubleConditionJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleCondition>

Loads double condition configurations. Produces `DefaultDoubleCondition`, `SingleDoubleCondition`, or `DoubleThresholdCondition` depending on JSON structure (null/primitive/array).

## Key Methods

- `load()`

## Related Types

- DoubleConditionJsonLoader.Constants -- error messages

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public IDoubleCondition load()

Fields:
protected final Boolean defaultValue
