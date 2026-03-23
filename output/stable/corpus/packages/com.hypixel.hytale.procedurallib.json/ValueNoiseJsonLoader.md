# ValueNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class ValueNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, ValueNoise>

Loads value noise configurations. Creates `ValueNoise` with a configurable interpolation mode (default `QUINTIC`).

## Key Methods

- `load()`
- `loadInterpolationFunction()`

## Related Types

- ValueNoiseJsonLoader.Constants -- DEFAULT_INTERPOLATION_MODE = QUINTIC

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public ValueNoise load()
  protected GeneralNoise.InterpolationFunction loadInterpolationFunction()
