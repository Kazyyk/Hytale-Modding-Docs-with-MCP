# WorldGenPrefabSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: java.lang.Object | Implements: PrefabSupplier

Supplies individual world generation prefabs on demand. Implements `PrefabSupplier`. Lazily resolves the prefab name and computes chunk bounds (with recursive child prefab expansion up to depth 10). Equality is based on the file path.

## Hierarchy

- **Extends:** `java.lang.Object`
- **Implements:** `PrefabSupplier`

## Methods

- getLoader() | WorldGenPrefabLoader | Returns the parent `WorldGenPrefabLoader`.
- getName() | String | Returns the full file path as the name.
- getPrefabName() | String | Lazily resolves and returns the relative prefab name.
- getPath() | Path | Returns the prefab file path.
- get() | IPrefabBuffer | Loads the prefab buffer from the chunk generator resource cache.
- getBounds(IPrefabBuffer) | IChunkBounds | Lazily computes and caches chunk bounds, recursively including child prefabs.
