# ChunkSavingSystems

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.component

public class ChunkSavingSystems

Container for chunk saving ECS systems that persist chunk data to storage.

Also in this package: ChunkUnloadingSystem, Data, Data, Ticking, WorldRemoved

Complete API:
  public static CompletableFuture<Void> saveChunksInWorld(Store<ChunkStore> store)
  public static void tryQueue(int index, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store)
  public static void tryQueueSync(ArchetypeChunk<ChunkStore> archetypeChunk, CommandBuffer<ChunkStore> commandBuffer)
  public static void saveChunk(Ref<ChunkStore> reference, ChunkSavingSystems.Data data, boolean report, Store<ChunkStore> store)

Fields:
public static final HytaleLogger LOGGER
private static final ComponentType<ChunkStore,WorldChunk> WORLD_CHUNK_COMPONENT_TYPE
public static final Query<ChunkStore> QUERY
