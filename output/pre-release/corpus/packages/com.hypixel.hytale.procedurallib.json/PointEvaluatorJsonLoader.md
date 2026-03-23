# PointEvaluatorJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: AbstractCellJitterJsonLoader

public class PointEvaluatorJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<T, PointEvaluator>

Loads point evaluator configurations. Supports centre-distance and border-distance measurement modes with configurable distance calculation, jitter, density conditions, distance ranges, and skip settings.

## Key Methods

- `load()`
- `loadCentrePointEvaluator()`
- `loadBorderPointEvaluator()`
- `loadPointDistanceFunction()`
- `loadDistanceRange()`
- `loadDensity()`
- `loadSkipCount()`
- `loadSkipMode()`

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public PointEvaluator load()
  public PointEvaluator loadCentrePointEvaluator()
  public PointEvaluator loadBorderPointEvaluator()
  public PointDistanceFunction loadPointDistanceFunction()
  public IDoubleRange loadDistanceRange()
  public IDoubleCondition loadDensity()
  public int loadSkipCount()
  public SkipCellPointEvaluator.Mode loadSkipMode()

Fields:
protected final MeasurementMode measurementMode
protected final PointDistanceFunction pointDistanceFunction
