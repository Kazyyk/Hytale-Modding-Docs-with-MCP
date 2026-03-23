# ChunkGeneratorResource

Type: class | Package: com.hypixel.hytale.server.worldgen

public class ChunkGeneratorResource

Provides ChunkGeneratorResource functionality within the worldgen subsystem.

## Fields

- @Nonnull public final Random random
- @Nonnull public final Random random2
- @Nonnull public final IntList coverArray
- @Nonnull public final BlockPriorityChunk priorityChunk
- @Nonnull public final CoordinateCache.CoordinateKey cacheCoordinateKey
- @Nonnull public final ExtendedCoordinateCache.ExtendedCoordinateKey<CaveType> cacheCaveCoordinateKey
- @Nonnull public final ResultBuffer.Bounds2d bounds2d
- @Nonnull public final ResultBuffer.ResultBuffer2d resultBuffer2d
- @Nonnull public final ResultBuffer.ResultBuffer3d resultBuffer3d
- @Nonnull public final PrefabPasteUtil.PrefabPasteBuffer prefabBuffer
- @Nonnull public final ZoneBiomeResult zoneBiomeResult
- public final ClimateNoise.Buffer climateBuffer
- public final PrefabPopulator prefabPopulator
- public final WorldGenPrefabLoader.PrefabPathCollector prefabCollector
- @Nonnull public final Vector2d cacheVector2d
- protected ChunkGenerator chunkGenerator

## Methods

- public ChunkGeneratorResource()
- public void init(ChunkGenerator chunkGenerator)
- public void release()
- @Nonnull public Random getRandom()
- @Nonnull protected IPrefabBuffer getPrefab(WorldGenPrefabSupplier prefabSupplier)

Also in this package: BiomeDataSystem, HytaleWorldGenProvider, SeedStringResource, WorldGenBuilderCodec, WorldGenConfig, WorldGenConstants

Complete API:
  public void init(ChunkGenerator chunkGenerator)
  public void release()
  public Random getRandom()
  protected IPrefabBuffer getPrefab(WorldGenPrefabSupplier prefabSupplier)

Fields:
public final Random random
public final Random random2
public final IntList coverArray
public final TimeoutCache<WorldGenPrefabSupplier,IPrefabBuffer> prefabs
public final BlockPriorityChunk priorityChunk
public final CoordinateCache.CoordinateKey cacheCoordinateKey
public final ExtendedCoordinateCache.ExtendedCoordinateKey<CaveType> cacheCaveCoordinateKey
public final ResultBuffer.Bounds2d bounds2d
public final ResultBuffer.ResultBuffer2d resultBuffer2d
public final ResultBuffer.ResultBuffer3d resultBuffer3d
public final PrefabPasteUtil.PrefabPasteBuffer prefabBuffer
public final ZoneBiomeResult zoneBiomeResult
public final ClimateNoise.Buffer climateBuffer
public final PrefabPopulator prefabPopulator
public final WorldGenPrefabLoader.PrefabPathCollector prefabCollector
public final Vector2d cacheVector2d
protected ChunkGenerator chunkGenerator
