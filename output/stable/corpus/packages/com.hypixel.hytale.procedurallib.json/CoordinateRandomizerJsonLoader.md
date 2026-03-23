# CoordinateRandomizerJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class CoordinateRandomizerJsonLoader<K extends SeedResource> extends JsonLoader<K, ICoordinateRandomizer>

Loads coordinate randomizer configurations. Creates `CoordinateRandomizer` with per-axis amplitude noise generators, optionally wrapped in a `RotatedCoordinateRandomizer`.

## Key Methods

- `load()`
- `loadRandomizer()`
- `loadGenerators(@Nonnull String seedSuffix)`

## Related Types

- CoordinateRandomizerJsonLoader.Constants -- SEED_X/Y/Z_NOISE_SUFFIX
