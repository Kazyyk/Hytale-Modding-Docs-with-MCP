# ChunkSpawnData

Type: class | Package: com.hypixel.hytale.server.spawning.world.component

public class ChunkSpawnData implements Component<ChunkStore>

Chunk-level component tracking spawn-related data for a chunk including spawned NPC counts and spawn state.

Also in this package: ChunkSpawnedNPCData, SpawnJobData, UnspawnableEntry, WorldSpawnData

Complete API:
  public static ComponentType<ChunkStore,ChunkSpawnData> getComponentType()
  public Int2ObjectMap<ChunkEnvironmentSpawnData> getChunkEnvironmentSpawnDataMap()
  public boolean isStarted()
  public void setStarted(boolean started)
  public void setLastSpawn(long lastSpawn)
  public long getLastSpawn()
  public Component<ChunkStore> clone()
  public ChunkEnvironmentSpawnData getEnvironmentSpawnData(int environment)
  public boolean isOnSpawnCooldown()

Fields:
private final Int2ObjectMap<ChunkEnvironmentSpawnData> chunkEnvironmentSpawnDataMap
private boolean started
private long lastSpawn
