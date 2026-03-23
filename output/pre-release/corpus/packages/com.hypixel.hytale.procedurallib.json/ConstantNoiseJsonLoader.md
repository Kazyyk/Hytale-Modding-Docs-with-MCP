# ConstantNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class ConstantNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Loads constant noise configurations. Produces a `ConstantNoise` with a configurable value (default `0.5`).

## Key Methods

- `load()`
- `loadValue()`

## Related Types

- ConstantNoiseJsonLoader.Constants -- KEY_VALUE, DEFAULT_VALUE = 0.5

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseFunction load()
  protected double loadValue()
