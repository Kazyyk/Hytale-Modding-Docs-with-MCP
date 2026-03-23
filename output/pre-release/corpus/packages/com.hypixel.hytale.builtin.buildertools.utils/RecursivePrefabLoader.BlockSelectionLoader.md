# RecursivePrefabLoader.BlockSelectionLoader

Type: class | Package: com.hypixel.hytale.builtin.buildertools.utils | Extends: RecursivePrefabLoader

public static class BlockSelectionLoader extends RecursivePrefabLoader<BlockSelection>

## Methods

- public BlockSelectionLoader(Path rootPrefabsDir, @Nonnull Function<String, BlockSelection> prefabsLoader)
- protected BlockSelection loadPrefab(int x, int y, int z, String file, @Nonnull PrefabRotation rotation, @Nonnull Random random)
- private static PrefabRotation getRotation(@Nonnull BlockType blockType)

Also in this package: DistinctCollector, FluidInfo, FluidPatternHelper, Material, PasteToolUtil, RecursivePrefabLoader

Complete API:
  protected BlockSelection loadPrefab(int x, int y, int z, String file, PrefabRotation rotation, Random random)
  private static PrefabRotation getRotation(BlockType blockType)
