# AssetFileSystem

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: java.lang.Object | Implements: FileIOSystem

Implements `FileIOSystem` for world generation asset loading. Manages a virtual file system spanning multiple `AssetPack` roots with path-based caching. Resolves asset paths across pack layers (highest priority first), caches loaded resources by `AssetPath`, and filters packs by version compatibility. Inner record `Resource<T>` holds cached values with type checking.

## Hierarchy

- **Extends:** `java.lang.Object`
- **Implements:** `FileIOSystem`

## Methods

- baseRoot() | Path | Returns the base asset pack root path.
- roots() | FileIOSystem.PathArray | Returns all pack root paths as a `PathArray`.
- resolve(Path) | AssetPath | Resolves a path to an `AssetPath`, caching the result.
- load(AssetPath, AssetLoader<T>) | T | Loads a resource from the first pack containing the path, with caching and type checking.
- close() | void | Clears file and resource caches and closes the file IO system.
- packs() | List<AssetPack> | Returns the list of asset packs in priority order.
- getAssetPacks(WorldGenConfig, Predicate<Path>) | List<AssetPack> | Static method. Filters and orders asset packs: non-versioned packs first, then version-filtered packs, then the base pack.
- getAssetRoots(List<AssetPack>) | Path[] | Static method. Extracts root paths from a list of asset packs.

## Inner Types

### Resource

*record*

Generic record holding a cached value and its `Class` type for type-safe retrieval.
