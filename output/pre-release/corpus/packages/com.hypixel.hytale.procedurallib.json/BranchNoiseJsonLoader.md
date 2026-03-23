# BranchNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: AbstractCellJitterJsonLoader

public class BranchNoiseJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<T, BranchNoise>

Loads branching noise configurations. Creates `BranchNoise` with separate parent and line cell systems, each with independent jitter, distance, and evaluation settings.

## Key Methods

- `load()`
- `loadParentCellType()`
- `loadLineCellType()`
- `loadParentEvaluator()`
- `loadLineEvaluator()`
- `loadParentDensity()`
- `loadParentDistance2Function()`
- `loadParentFormula()`

## Related Types

- BranchNoiseJsonLoader.LoadedBranchNoise -- inner class with SeedResource
- BranchNoiseJsonLoader.Constant -- JSON keys and defaults
