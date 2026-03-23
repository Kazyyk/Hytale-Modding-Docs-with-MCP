# GradientNoisePropertyJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class GradientNoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, GradientNoiseProperty>

Loads gradient noise property configurations. Applies gradient computation (MAGNITUDE mode by default) with configurable distance (5.0) and normalization (0.1).

## Key Methods

- `load()`
- `loadMode()`
- `loadDistance()`
- `loadNormalization()`

## Related Types

- GradientNoisePropertyJsonLoader.Constants -- DEFAULT_MODE = MAGNITUDE, DEFAULT_DISTANCE = 5.0

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public GradientNoiseProperty load()
  protected GradientNoiseProperty.GradientMode loadMode()
  protected double loadDistance()
  protected double loadNormalization()

Fields:
protected final NoiseProperty noise
