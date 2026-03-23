# GridNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class GridNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>

Loads grid noise configurations. Creates `GridNoise` with per-axis thickness values. ThicknessZ defaults to `0.0` if no shared default is given.

## Key Methods

- `load()`
- `loadDefaultThickness()`
- `loadThicknessX/Y/Z(double)`

## Related Types

- GridNoiseJsonLoader.Constants -- axis thickness keys and defaults
