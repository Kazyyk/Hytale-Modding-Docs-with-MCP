# CurveNoisePropertyJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public class CurveNoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, CurveNoiseProperty>

Loads curve noise property configurations. Applies a `PowerCurve(A, B)` transform to a noise source. Default curve parameters: A=2.0, B=-2.0.

## Key Methods

- `load()`
- `loadNoise()`
- `loadDCurve()`

## Related Types

- CurveNoisePropertyJsonLoader.Constants -- DEFAULT_A = 2.0, DEFAULT_B = -2.0
