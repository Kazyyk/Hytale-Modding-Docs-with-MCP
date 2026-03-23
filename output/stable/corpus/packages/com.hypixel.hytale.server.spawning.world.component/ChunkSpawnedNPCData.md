# ChunkSpawnedNPCData

Type: class | Package: com.hypixel.hytale.server.spawning.world.component

public class ChunkSpawnedNPCData

Data structure tracking individual NPC spawn records within a chunk.

Also in this package: ChunkSpawnData, SpawnJobData, UnspawnableEntry, WorldSpawnData

Complete API:
  public static ComponentType<ChunkStore,ChunkSpawnedNPCData> getComponentType()
  public double getEnvironmentSpawnCount(int environment)
  public void setEnvironmentSpawnCount(int environment, double count)
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<ChunkSpawnedNPCData> CODEC
private final Int2DoubleMap environmentSpawnCounts
