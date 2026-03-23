# SeedStringResource

Type: class | Package: com.hypixel.hytale.server.worldgen | Implements: SeedResource

public class SeedStringResource implements SeedResource

Implements `SeedResource` to provide SeedStringResource functionality.

## Fields

- @Nonnull protected final FileMaskCache<IIntCondition> biomeMaskRegistry
- @Nonnull protected final BlockPlacementMaskRegistry blockMaskRegistry
- @Nonnull protected WorldGenConfig config
- @Nonnull protected WorldGenPrefabLoader loader
- @Nonnull protected final Map<String, AtomicInteger> uniqueIds

## Methods

- public SeedStringResource(@Nonnull PrefabStoreRoot prefabStore, @Nonnull WorldGenConfig config)
- @Nonnull public String getUniqueName(@Nonnull String prefix)
- @Nonnull public WorldGenPrefabLoader getLoader()
- public void setPrefabConfig(@Nonnull WorldGenConfig config, @Nonnull PrefabStoreRoot prefabStore)
- @Nonnull @Override public ResultBuffer.Bounds2d localBounds2d()
- @Nonnull @Override public ResultBuffer.ResultBuffer2d localBuffer2d()
- @Nonnull @Override public ResultBuffer.ResultBuffer3d localBuffer3d()
- @Override public void writeSeedReport(String seedReport)
- @Nonnull public FileMaskCache<IIntCondition> getBiomeMaskRegistry()
- @Nonnull public BlockPlacementMaskRegistry getBlockMaskRegistry()

Also in this package: BiomeDataSystem, ChunkGeneratorResource, HytaleWorldGenProvider, WorldGenBuilderCodec, WorldGenConfig, WorldGenConstants

Complete API:
  public String getUniqueName(String prefix)
  public WorldGenPrefabLoader getLoader()
  public void setPrefabConfig(WorldGenConfig config, PrefabStoreRoot prefabStore)
  public ResultBuffer.Bounds2d localBounds2d()
  public ResultBuffer.ResultBuffer2d localBuffer2d()
  public ResultBuffer.ResultBuffer3d localBuffer3d()
  public void writeSeedReport(String seedReport)
  public FileMaskCache<IIntCondition> getBiomeMaskRegistry()
  public BlockPlacementMaskRegistry getBlockMaskRegistry()

Fields:
protected final FileMaskCache<IIntCondition> biomeMaskRegistry
protected final BlockPlacementMaskRegistry blockMaskRegistry
protected WorldGenConfig config
protected WorldGenPrefabLoader loader
protected final Map<String,AtomicInteger> uniqueIds
