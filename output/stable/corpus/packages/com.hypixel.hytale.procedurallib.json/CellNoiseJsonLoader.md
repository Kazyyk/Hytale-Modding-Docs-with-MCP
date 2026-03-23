# CellNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class CellNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Loads cell noise configurations. Creates `CellNoise` instances by loading cell distance functions, point evaluators, cell modes, and optional noise lookup properties.

## Key Methods

- `load()`
- `loadCellDistanceFunction()`
- `loadPointEvaluator()`
- `loadCellFunction()`
- `loadNoiseLookup()`

## Related Types

- CellNoiseJsonLoader.LoadedCellNoise -- inner class extending CellNoise with SeedResource buffer delegation
- CellNoiseJsonLoader.Constants -- JSON keys and defaults (DEFAULT_CELL_MODE = CELL_VALUE, DEFAULT_CELL_TYPE = SQUARE)
