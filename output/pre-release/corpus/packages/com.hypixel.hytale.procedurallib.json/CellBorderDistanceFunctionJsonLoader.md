# CellBorderDistanceFunctionJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class CellBorderDistanceFunctionJsonLoader<K extends SeedResource> extends JsonLoader<K, BorderDistanceFunction>

Loads border distance function configurations. Wraps a `CellDistanceFunction` with border-specific point evaluation and density conditions.

## Key Methods

- `load()`
- `loadPointEvaluator()`
- `loadDensity()`

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public BorderDistanceFunction load()
  protected PointEvaluator loadPointEvaluator()
  protected IDoubleCondition loadDensity()

Fields:
protected final CellDistanceFunction distanceFunction
