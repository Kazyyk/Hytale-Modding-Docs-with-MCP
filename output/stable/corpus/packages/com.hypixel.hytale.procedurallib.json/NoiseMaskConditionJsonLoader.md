# NoiseMaskConditionJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class NoiseMaskConditionJsonLoader<K extends SeedResource> extends JsonLoader<K, ICoordinateCondition>

Loads noise mask condition configurations. Creates a `NoiseMaskCondition` that evaluates a noise property against a double threshold. Returns default true/false condition when JSON is null.

## Key Methods

- `load()`

## Related Types

- NoiseMaskConditionJsonLoader.Constants -- KEY_THRESHOLD

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public ICoordinateCondition load()

Fields:
protected final boolean defaultValue
