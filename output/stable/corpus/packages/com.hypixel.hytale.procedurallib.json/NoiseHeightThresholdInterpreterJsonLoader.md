# NoiseHeightThresholdInterpreterJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class NoiseHeightThresholdInterpreterJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseHeightThresholdInterpreter>

Loads noise-driven height threshold interpreter configurations. Combines a noise property with an array of sub-interpreters selected by float key values.

## Key Methods

- `load()`
- `loadNoise()`
- `loadInterpreters()`
- `loadKeys()`
- `shouldHandle(@Nonnull JsonObject)` -- static check for "Thresholds" key

## Related Types

- NoiseHeightThresholdInterpreterJsonLoader.Constants -- KEY_NOISE, KEY_THRESHOLDS, KEY_KEYS

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public NoiseHeightThresholdInterpreter load()
  protected NoiseProperty loadNoise()
  protected IHeightThresholdInterpreter[] loadInterpreters()
  protected float[] loadKeys()
  public static boolean shouldHandle(JsonObject jsonObject)

Fields:
protected final int length
