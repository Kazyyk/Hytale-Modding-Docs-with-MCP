# MeshNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: AbstractCellJitterJsonLoader

public class MeshNoiseJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<K, NoiseFunction>

Loads mesh noise configurations. Supports both square grid (`MeshNoise`) and hexagonal (`HexMeshNoise`) cell types with configurable thickness, density, and jitter.

## Key Methods

- `load()`
- `loadGridMeshNoise()`
- `loadHexMeshNoise()`
- `loadCellType()`
- `loadThickness()`
- `loadDensity()`
- `loadLinesX/Y/Z()`

## Related Types

- MeshNoiseJsonLoader.Constants -- thickness, lines defaults
