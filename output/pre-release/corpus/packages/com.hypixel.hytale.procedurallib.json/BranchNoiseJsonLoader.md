# BranchNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: AbstractCellJitterJsonLoader

public class BranchNoiseJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<T, BranchNoise>

Loads branching noise configurations. Creates `BranchNoise` with separate parent and line cell systems, each with independent jitter, distance, and evaluation settings.

## Key Methods

- `load()`
- `loadParentCellType()`
- `loadLineCellType()`
- `loadParentEvaluator()`
- `loadLineEvaluator()`
- `loadParentDensity()`
- `loadParentDistance2Function()`
- `loadParentFormula()`

## Related Types

- BranchNoiseJsonLoader.LoadedBranchNoise -- inner class with SeedResource
- BranchNoiseJsonLoader.Constant -- JSON keys and defaults

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public BranchNoise load()
  protected CellType loadParentCellType()
  protected CellType loadLineCellType()
  protected PointEvaluator loadParentEvaluator()
  protected IIntCondition loadParentDensity()
  protected DistanceNoise.Distance2Function loadParentDistance2Function()
  protected NoiseFormulaProperty.NoiseFormula.Formula loadParentFormula()
  protected PointEvaluator loadLineEvaluator(CellDistanceFunction parentFunction, CellPointFunction linePointFunction, double lineScale)
  protected double loadDouble(String key, double def)
  protected IDoubleRange loadRange(String key, double def)
  protected E loadEnum(String key, Function<String,E> valueOf, E def)
  protected static CellDistanceFunction getCellDistanceFunction(CellType cellType)
  protected static CellPointFunction getCellPointFunction(CellType cellType)
