# PrefabLoadingCache

Type: class | Package: com.hypixel.hytale.server.worldgen.prefab

public class PrefabLoadingCache

Thread-safe cache for loaded prefab buffers. Maps `WorldGenPrefabSupplier` instances to `PrefabBuffer` objects, loading them on demand from the prefab path.

## Methods

- public IPrefabBuffer getPrefabAccessor(WorldGenPrefabSupplier prefabSupplier)
- public void clear()
