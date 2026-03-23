# EnvironmentChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.environment | Implements: Component

public class EnvironmentChunk implements Component<ChunkStore>

## Fields

- private final EnvironmentColumn[] columns
- private final EnvironmentChunk.BulkWriter.ColumnWriter[] columnWriters

## Methods

- public static ComponentType<ChunkStore, EnvironmentChunk> getComponentType()
- public EnvironmentChunk()
- public EnvironmentChunk(int defaultId)
- public Component<ChunkStore> clone()
- public int get(int x, int y, int z)
- public EnvironmentColumn get(int x, int z)
- public void setColumn(int x, int z, int environmentId)
- public boolean set(int x, int y, int z, int environmentId)
- public boolean contains(int environmentId)
- private void createIfNotExist(int environmentId)
- private void incrementBlockCount(int internalId)
- private void incrementBlockCount(int internalId, int count)
- private boolean decrementBlockCount(int environmentId, long count)
- private byte[] serialize()
- private void deserialize(@Nonnull byte[] bytes)
- public byte[] serializeProtocol()
- public void trim()
- private static int idx(int x, int z)
- public EnvironmentChunk.BulkWriter.ColumnWriter getColumnWriter(int x, int z)
- public void write(@Nonnull EnvironmentChunk environmentChunk)
- private static void transferCounts(@Nonnull Int2LongMap from, @Nonnull Int2LongMap into)
- public void write(@Nonnull EnvironmentColumn environmentColumn)
- public void count(int environmentId, int count)
- public void intake(@Nonnull Int2IntFunction dataSource)

Also in this package: BulkWriter, ColumnWriter, EnvironmentColumn, EnvironmentRange

Complete API:
  public static ComponentType<ChunkStore,EnvironmentChunk> getComponentType()
  public Component<ChunkStore> clone()
  public int get(int x, int y, int z)
  public EnvironmentColumn get(int x, int z)
  public void setColumn(int x, int z, int environmentId)
  public boolean set(int x, int y, int z, int environmentId)
  public boolean contains(int environmentId)
  private void createIfNotExist(int environmentId)
  private void incrementBlockCount(int internalId)
  private void incrementBlockCount(int internalId, int count)
  private boolean decrementBlockCount(int environmentId, long count)
  private byte[] serialize()
  private void deserialize(byte[] bytes)
  public byte[] serializeProtocol()
  public void trim()
  private static int idx(int x, int z)

Fields:
public static final BuilderCodec<EnvironmentChunk> CODEC
private final EnvironmentColumn[] columns
private final Int2LongMap counts
