# DistanceNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class DistanceNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Loads distance-based noise configurations. Creates `DistanceNoise` instances with configurable measurement modes and distance-2 functions.

## Key Methods

- `load()`
- `loadCellDistanceFunction()`
- `loadPointEvaluator()`
- `loadMeasurementMode()`
- `loadDistance2Function()`

## Related Types

- DistanceNoiseJsonLoader.LoadedDistanceNoise -- inner class with SeedResource buffer delegation
- DistanceNoiseJsonLoader.Constants -- defaults (DEFAULT_MEASUREMENT = CENTRE_DISTANCE, DEFAULT_DISTANCE_2_MODE = SUB)
