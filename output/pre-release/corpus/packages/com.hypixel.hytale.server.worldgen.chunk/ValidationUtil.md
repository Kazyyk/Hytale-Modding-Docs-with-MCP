# ValidationUtil

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Extends: null

public class ValidationUtil

## Fields

- Deque<String> trace
- boolean invalid
- Set<String> encounteredNodes
- PrefabContainer.PrefabContainerEntry[] prefabContainerEntries
- CavePrefabContainer.CavePrefabEntry[] cavePrefabEntries
- CaveNodeType.CaveNodeChildEntry[] children
- CaveNodeType[] nodes
- WorldGenPrefabSupplier[] suppliers
- IPrefabBuffer prefab

## Methods

- public static boolean isInvalid(@Nonnull ZonePatternProvider zonePatternProvider, @Nonnull Executor executor)
- private static boolean isZoneInvalid(@Nonnull Zone zone, @Nonnull Deque<String> trace)
- private static boolean isBiomeInvalid(@Nonnull Biome biome, @Nonnull Deque<String> trace)
- private static boolean isCaveNodeInvalid(@Nonnull CaveNodeType caveNodeType, @Nonnull Set<String> encounteredNodes, @Nonnull Deque<String> trace)
- private static boolean arePrefabsInvalid(@Nonnull IWeightedMap<WorldGenPrefabSupplier> prefabs, @Nonnull Deque<String> trace)
- private static boolean isChildPrefabInvalid(@Nonnull PrefabBuffer.ChildPrefab childMarker, @Nonnull WorldGenPrefabLoader loader, @Nonnull Deque<String> trace)

Also in this package: BlockPriorityChunk, BlockPriorityModifier, ChunkGenerator, ChunkGeneratorExecution, HeightThresholdInterpolator, MaskProvider, ZoneBiomeResult

Complete API:
  public static boolean isInvalid(ZonePatternProvider zonePatternProvider, Executor executor)
  private static boolean isZoneInvalid(Zone zone, Deque<String> trace)
  private static boolean isBiomeInvalid(Biome biome, Deque<String> trace)
  private static boolean isCaveNodeInvalid(CaveNodeType caveNodeType, Set<String> encounteredNodes, Deque<String> trace)
  private static boolean arePrefabsInvalid(IWeightedMap<WorldGenPrefabSupplier> prefabs, Deque<String> trace)
  private static boolean isChildPrefabInvalid(PrefabBuffer.ChildPrefab childMarker, WorldGenPrefabLoader loader, Deque<String> trace)
