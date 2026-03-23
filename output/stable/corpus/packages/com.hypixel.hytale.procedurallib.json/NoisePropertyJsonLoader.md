# NoisePropertyJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class NoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseProperty>

Central noise property loader supporting 14 composition types: MAX, MIN, SUM, SCALE, FORMULA, MULTIPLY, DISTORTED, NORMALIZE, INVERT, OFFSET, ROTATE, GRADIENT, CURVE, BLEND. Also supports fractal noise (FBM/RIDGED/TURBULENCE) when no explicit Type is set. Post-processing modifiers (Formula, Curve, Scale, Normalize, Offset, Rotate, Gradient) are applied in sequence.

## Key Methods

- `load()`
- `loadSeed()`
- `loadNoiseProperties(@Nonnull JsonElement)`
- `loadDoubleArray(@Nullable JsonElement, int)`

## Related Types

- NoisePropertyJsonLoader.Constants -- all JSON keys, error strings, DEFAULT_FRACTAL_MODE = FBM

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseProperty load()
  protected int loadSeed()
  protected NoiseProperty[] loadNoiseProperties(JsonElement element)
  protected double[] loadDoubleArray(JsonElement element, int size)
  protected NoiseFunctionJsonLoader newNoiseFunctionJsonLoader(SeedString<K> seed, Path dataFolder, JsonElement json)
