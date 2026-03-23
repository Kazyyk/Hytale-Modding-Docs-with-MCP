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
