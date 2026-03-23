# PrefabLoadingCache

Type: class | Package: com.hypixel.hytale.server.worldgen.prefab

public class PrefabLoadingCache

Thread-safe cache for loaded prefab buffers. Maps `WorldGenPrefabSupplier` instances to `PrefabBuffer` objects, loading them on demand from the prefab path.

## Methods

- public IPrefabBuffer getPrefabAccessor(WorldGenPrefabSupplier prefabSupplier)
- public void clear()

Also in this package: PrefabCategory, PrefabPasteBuffer, PrefabPasteUtil, PrefabPatternGenerator, PrefabStoreRoot

Complete API:
  public IPrefabBuffer getPrefabAccessor(WorldGenPrefabSupplier prefabSupplier)
  public void clear()
  public String toString()

Fields:
private final Map<WorldGenPrefabSupplier,PrefabBuffer> cache
private final Function<WorldGenPrefabSupplier,PrefabBuffer> loader
