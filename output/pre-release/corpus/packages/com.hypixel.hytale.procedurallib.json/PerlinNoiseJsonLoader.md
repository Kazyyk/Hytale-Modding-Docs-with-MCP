# PerlinNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class PerlinNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Loads Perlin noise configurations. Creates `PerlinNoise` with a configurable interpolation mode (default `QUINTIC`).

## Key Methods

- `load()`
- `loadInterpolationFunction()`

## Related Types

- PerlinNoiseJsonLoader.Constants -- DEFAULT_INTERPOLATION_MODE = QUINTIC

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseFunction load()
  protected GeneralNoise.InterpolationFunction loadInterpolationFunction()
