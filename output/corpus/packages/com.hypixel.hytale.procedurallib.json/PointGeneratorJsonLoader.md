# PointGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class PointGeneratorJsonLoader<K extends SeedResource> extends JsonLoader<K, IPointGenerator>

Loads point generator configurations. Creates `SeedResourcePointGenerator` instances with optional scale, distortion (randomizer), offset, and rotation transforms.

## Key Methods

- `load()`
- `loadSeed()`
- `newPointGenerator(int, CellDistanceFunction)`
- `loadCellDistanceFunction()`
- `loadPointEvaluator()`
- `loadPointDistanceFunction()`

## Related Types

- PointGeneratorJsonLoader.Constants -- KEY_SEED, KEY_SCALE, KEY_RANDOMIZER, KEY_OFFSET_X/Y/Z
