# SpawnSuppressionController

Type: class | Package: com.hypixel.hytale.server.spawning.suppression.component | Implements: Resource<EntityStore>

public class SpawnSuppressionController implements Resource<EntityStore>

Implementation of `Resource<EntityStore>`.

## Methods

- getResourceType() | ResourceType<EntityStore, SpawnSuppressionController> | static public method.
- getSpawnSuppressorMap() | Map<UUID, SpawnSuppressorEntry> | public method.
- getChunkSuppressionMap() | Long2ObjectConcurrentHashMap<ChunkSuppressionEntry> | public method.
- clone() | Resource<EntityStore> | public method.

Also in this package: ChunkSuppressionEntry, ChunkSuppressionQueue, SpawnSuppressionComponent, SuppressionSpan

Complete API:
  public static ResourceType<EntityStore,SpawnSuppressionController> getResourceType()
  public Map<UUID,SpawnSuppressorEntry> getSpawnSuppressorMap()
  public Long2ObjectConcurrentHashMap<ChunkSuppressionEntry> getChunkSuppressionMap()
  public Resource<EntityStore> clone()

Fields:
public static final BuilderCodec<SpawnSuppressionController> CODEC
private final Long2ObjectConcurrentHashMap<ChunkSuppressionEntry> chunkSuppressionMap
private Map<UUID,SpawnSuppressorEntry> spawnSuppressorMap
