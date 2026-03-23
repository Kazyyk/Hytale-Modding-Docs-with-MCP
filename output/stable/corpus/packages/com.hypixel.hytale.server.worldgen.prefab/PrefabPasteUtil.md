# PrefabPasteUtil

Type: class | Package: com.hypixel.hytale.server.worldgen.prefab

public class PrefabPasteUtil

Utility class for pasting prefabs into generated chunks during world generation. Handles block placement, entity placement, rotation, heightmap fitting, seed inheritance, and recursive child prefab generation (up to depth 10).

## Fields

- public static final | int | MAX_RECURSION_DEPTH | Maximum child prefab nesting depth (10)

## Methods

- public static void generate(PrefabPasteBuffer buffer, PrefabRotation rotation, WorldGenPrefabSupplier supplier, int x, int y, int z, int cx, int cz)

## Inner Types

### PrefabPasteBuffer


public static class PrefabPasteUtil.PrefabPasteBuffer extends PrefabBufferCall

Mutable buffer holding state during prefab pasting including world/chunk positions, seed, rotation, height conditions, and block mask.

Also in this package: PrefabCategory, PrefabLoadingCache, PrefabPasteBuffer, PrefabPatternGenerator, PrefabStoreRoot

Complete API:
  public static void generate(PrefabPasteUtil.PrefabPasteBuffer buffer, PrefabRotation rotation, WorldGenPrefabSupplier supplier, int x, int y, int z, int cx, int cz)
  private static void generate0(PrefabPasteUtil.PrefabPasteBuffer _buffer, WorldGenPrefabSupplier supplier)
  private static void generateChild(int cx, int cy, int cz, String path, boolean fitHeightmap, boolean inheritSeed, boolean inheritHeightCondition, PrefabWeights weights, PrefabRotation rotation, PrefabPasteUtil.PrefabPasteBuffer buffer, Random random)
  private static WorldGenPrefabSupplier nextPrefab(Random random, WorldGenPrefabSupplier[] prefabSuppliers, PrefabWeights weights)
  private static WorldGenPrefabSupplier nextRandomPrefab(Random random, WorldGenPrefabSupplier[] prefabSuppliers)

Fields:
public static final int MAX_RECURSION_DEPTH
