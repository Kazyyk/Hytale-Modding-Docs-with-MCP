# BlockSection

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section | Implements: Component<ChunkStore>

public class BlockSection implements Component<ChunkStore>

Chunk section component managing a 32x32x32 block region. Stores block, filler, and rotation palettes via `ISectionPalette` implementations, plus lighting data, ticking block bitsets, and tick request queues. Handles block migration, serialization/deserialization, and network packet caching with stamped locks for thread safety.

## Constants

- VERSION | int | 6

## Static Methods

- static ComponentType<ChunkStore, BlockSection> getComponentType()

Also in this package: ChunkLightData, ChunkLightDataBuilder, ChunkSection, ChunkSectionReference, FluidSection, Res, TickRequest

Complete API:
  public static ComponentType<ChunkStore,BlockSection> getComponentType()
  public ISectionPalette getChunkSection()
  public void setChunkSection(ISectionPalette chunkSection)
  public void setLocalLight(ChunkLightDataBuilder localLight)
  public void setGlobalLight(ChunkLightDataBuilder globalLight)
  public ChunkLightData getLocalLight()
  public ChunkLightData getGlobalLight()
  public boolean hasLocalLight()
  public boolean hasGlobalLight()
  public void invalidateLocalLight()
  public void invalidateGlobalLight()
  public short getLocalChangeCounter()
  public short getGlobalChangeCounter()
  public void invalidate()
  public int get(int index)
  public int getFiller(int index)
  public int getFiller(int x, int y, int z)
  public int getRotationIndex(int index)
  public int getRotationIndex(int x, int y, int z)
  public RotationTuple getRotation(int index)
  public RotationTuple getRotation(int x, int y, int z)
  public boolean set(int blockIdx, int blockId, int rotation, int filler)
  public IntOpenHashSet getAndClearChangedPositions()
  public boolean contains(int id)
  public boolean containsAny(IntList ids)
  public int count()
  public int count(int id)
  public IntSet values()
  public void forEachValue(IntConsumer consumer)
  public Int2ShortMap valueCounts()
  public boolean isSolidAir()
  public void find(IntList ids, IntSet ignoredInternalIdHolder, IntConsumer indexConsumer)
  public void find(IntList ids, IntConsumer indexConsumer)
  public void find(IntList ids, BiIntConsumer indexBlockConsumer)
  public boolean setTicking(int blockIdx, boolean ticking)
  public int setTicking(IntList indices, boolean ticking)
  public int getTickingBlocksCount()
  public int getTickingBlocksCountCopy()
  public boolean hasTicking()
  public boolean isTicking(int blockIdx)
  public void scheduleTick(int index, Instant gameTime)
  public void preTick(Instant gameTime)
  public int forEachTicking(T t, V v, int sectionIndex, ObjectPositionBlockFunction<T,V,BlockTickStrategy> acceptor)
  public void mergeTickingBlocks()
  public double getMaximumHitboxExtent()
  public void invalidateBlock(int x, int y, int z)
  public FluidSection takeMigratedFluid()
  public BlockPhysics takeMigratedDecoBlocks()
  public void serializeForPacket(ByteBuf buf)
  public void serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)
  public byte[] serialize(ExtraInfo extraInfo)
  public void deserialize(ToIntFunction<ByteBuf> keyDeserializer, ByteBuf buf, int version)
  public void deserialize(byte[] bytes, ExtraInfo extraInfo)
  public Component<ChunkStore> clone()
  public Component<ChunkStore> cloneSerializable()
  public CompletableFuture<CachedPacket<SetChunk>> getCachedChunkPacket(int x, int y, int z)
  public int get(int x, int y, int z)
  public boolean set(int x, int y, int z, int blockId, int rotation, int filler)
  public boolean setTicking(int x, int y, int z, boolean ticking)
  public boolean isTicking(int x, int y, int z)

Fields:
public static final int VERSION
public static final BuilderCodec<BlockSection> CODEC
private final StampedLock chunkSectionLock
public boolean loaded
private IntOpenHashSet changedPositions
private IntOpenHashSet swapChangedPositions
private ISectionPalette chunkSection
private ISectionPalette fillerSection
private ISectionPalette rotationSection
private ChunkLightData localLight
private short localChangeCounter
private ChunkLightData globalLight
private short globalChangeCounter
private BitSet tickingBlocks
private final BitSet tickingBlocksCopy
private final BitSet tickingWaitAdjacentBlocks
private int tickingBlocksCount
private int tickingBlocksCountCopy
private int tickingWaitAdjacentBlockCount
private final ObjectHeapPriorityQueue<BlockSection.TickRequest> tickRequests
private double maximumHitboxExtent
private transient SoftReference<CompletableFuture<CachedPacket<SetChunk>>> cachedChunkPacket
private FluidSection migratedFluidSection
private BlockPhysics migratedBlockPhysics
private static final Comparator<BlockSection.TickRequest> TICK_REQUEST_COMPARATOR
