# AbstractCellJitterJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public abstract class AbstractCellJitterJsonLoader<K extends SeedResource> extends JsonLoader<K, T>

Abstract base for loaders that need cell jitter configuration. Provides methods to load default, per-axis, and combined jitter values from JSON.

## Key Methods

- `loadJitter()`
- `loadDefaultJitter()`
- `loadJitterX/Y/Z(double)`

Known subclasses: BranchNoiseJsonLoader, MeshNoiseJsonLoader, PointEvaluatorJsonLoader

Also in this package: BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  protected CellJitter loadJitter()
  protected double loadDefaultJitter()
  protected double loadJitterX(double defaultJitter)
  protected double loadJitterY(double defaultJitter)
  protected double loadJitterZ(double defaultJitter)
  protected static double loadJitter(JsonLoader<?,?> loader, String key, double defaultJitter)
