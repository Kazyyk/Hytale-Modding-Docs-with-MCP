# AbstractCellJitterJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: JsonLoader

public abstract class AbstractCellJitterJsonLoader<K extends SeedResource> extends JsonLoader<K, T>

Abstract base for loaders that need cell jitter configuration. Provides methods to load default, per-axis, and combined jitter values from JSON.

## Key Methods

- `loadJitter()`
- `loadDefaultJitter()`
- `loadJitterX/Y/Z(double)`
