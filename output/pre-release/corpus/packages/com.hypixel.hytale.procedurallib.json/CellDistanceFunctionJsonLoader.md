# CellDistanceFunctionJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class CellDistanceFunctionJsonLoader<K extends SeedResource> extends JsonLoader<K, CellDistanceFunction>

Loads cell distance function configurations. Supports SQUARE (`GridCellDistanceFunction`) and HEX (`HexCellDistanceFunction`) cell types. Delegates to `CellBorderDistanceFunctionJsonLoader` when measurement mode is BORDER_DISTANCE.

## Key Methods

- `load()`
- `loadCellType()`
- `loadDistanceFunction()`

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public CellDistanceFunction load()
  protected CellType loadCellType()
  protected CellDistanceFunction loadDistanceFunction()

Fields:
protected final MeasurementMode measurementMode
protected final PointDistanceFunction pointDistanceFunction
