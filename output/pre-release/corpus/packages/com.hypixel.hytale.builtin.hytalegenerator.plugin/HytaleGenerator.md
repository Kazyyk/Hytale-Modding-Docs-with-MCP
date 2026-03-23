# HytaleGenerator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.plugin | Extends: JavaPlugin

public class HytaleGenerator extends JavaPlugin

Plugin class that registers components, systems, and commands for the HytaleGenerator subsystem.

## Fields

- private AssetManager assetManager
- private Runnable assetReloadListener
- @Nonnull private final Map<ChunkRequest.GeneratorProfile, ChunkGenerator> generators
- @Nonnull private final Semaphore chunkGenerationSemaphore
- private int concurrency
- private ExecutorService mainExecutor
- private ThreadPoolExecutor concurrentExecutor
- private int worldCounter
- @Nonnull public static Vector3d DEFAULT_SPAWN_POSITION

## Methods

- public HytaleGenerator(@Nonnull JavaPluginInit init)
- @Override protected void start()
- @Nonnull public List<Vector3d> getSpawnPositions(@Nonnull ChunkRequest.GeneratorProfile profile, int maxPositionsCount)
- @Nonnull public CompletableFuture<GeneratedChunk> submitChunkRequest(@Nonnull ChunkRequest request)
- @Override protected void setup()
- @Nonnull public NStagedChunkGenerator createStagedChunkGenerator(@Nonnull ChunkRequest.GeneratorProfile generatorProfile, @Nonnull WorldStructureAsset worldStructureAsset, @Nonnull SettingsAsset settingsAsset)
- @Nonnull private static Set<Integer> getAllPossibleRuntimeIndices(@Nonnull List<Biome> biomes)
- @Nonnull private ChunkGenerator getGenerator(@Nonnull ChunkRequest.GeneratorProfile profile)
- private void loadExecutors(@Nonnull SettingsAsset settingsAsset)
- private static int getConcurrency(@Nonnull SettingsAsset settingsAsset)
- private void reloadGenerators()

Also in this package: Handle, HandleProvider

Complete API:
  protected void start()
  public List<Vector3d> getSpawnPositions(ChunkRequest.GeneratorProfile profile, int maxPositionsCount)
  public CompletableFuture<GeneratedChunk> submitChunkRequest(ChunkRequest request)
  protected void setup()
  public StagedChunkGenerator createStagedChunkGenerator(ChunkRequest.GeneratorProfile generatorProfile, WorldStructureAsset worldStructureAsset, SettingsAsset settingsAsset)
  private static Set<Integer> getAllPossibleRuntimeIndices(List<Biome> biomes)
  private ChunkGenerator getGenerator(ChunkRequest.GeneratorProfile profile)
  private void loadExecutors(SettingsAsset settingsAsset)
  private static int getConcurrency(SettingsAsset settingsAsset)
  private void reloadGenerators()

Fields:
private AssetManager assetManager
private Runnable assetReloadListener
private final Map<ChunkRequest.GeneratorProfile,ChunkGenerator> generators
private final Semaphore chunkGenerationSemaphore
private int concurrency
private ExecutorService mainExecutor
private ThreadPoolExecutor concurrentExecutor
private int worldCounter
public static Vector3d DEFAULT_SPAWN_POSITION
