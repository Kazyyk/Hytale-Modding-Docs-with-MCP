# CavePrefabContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.prefab

public class CavePrefabContainer

Container for cave prefab entries. Each entry holds a weighted map of `WorldGenPrefabSupplier` instances and a configuration (`CavePrefabConfig`) controlling placement, rotation, biome/block masks, iterations, displacement, and height conditions.

Also in this package: CavePrefabConfig, CavePrefabEntry

Complete API:
  public CavePrefabContainer.CavePrefabEntry[] getEntries()

Fields:
public static final ListPool<CavePrefabContainer.CavePrefabEntry> ENTRY_POOL
protected final CavePrefabContainer.CavePrefabEntry[] entries
