# BlendNoisePropertyJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class BlendNoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, BlendNoiseProperty>

Loads blend noise property configurations. Creates `BlendNoiseProperty` with an alpha noise, an array of noise sources, and ascending threshold values.

## Key Methods

- `load()`
- `loadAlpha()`
- `loadNoise()`
- `loadThresholds()`
- `validate(NoiseProperty[], double[])`

## Related Types

- BlendNoisePropertyJsonLoader.Constants -- KEY_ALPHA, KEY_NOISE, KEY_THRESHOLDS
