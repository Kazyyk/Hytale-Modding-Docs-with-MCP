# WorldChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: BlockAccessor, Component<ChunkStore>

public class WorldChunk implements BlockAccessor, Component<ChunkStore>

Core chunk component stored in the `ChunkStore`. Contains the `BlockChunk`, `BlockComponentChunk`, and `EntityChunk` sub-components. Manages chunk lifecycle flags, keep-alive timers, saving state, and lighting update control. Provides `BlockAccessor` implementation for reading/writing block data within the chunk.

## Constants

- KEEP_ALIVE_DEFAULT | int | 15

## Static Methods

- static ComponentType<ChunkStore, WorldChunk> getComponentType()

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockOperations, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem

Complete API:
  public static ComponentType<ChunkStore,WorldChunk> getComponentType()
  public Holder<ChunkStore> toHolder()
  public void setReference(Ref<ChunkStore> reference)
  public Ref<ChunkStore> getReference()
  public Component<ChunkStore> clone()
  public boolean is(ChunkFlag flag)
  public boolean not(ChunkFlag flag)
  public void setFlag(ChunkFlag flag, boolean value)
  public boolean toggleFlag(ChunkFlag flag)
  public void loadFromHolder(World world, int x, int z, Holder<ChunkStore> holder)
  public void initFlags()
  private void updateFlag(ChunkFlag flag, boolean value)
  private void startsTicking()
  private void stopsTicking()
  public BlockChunk getBlockChunk()
  public BlockComponentChunk getBlockComponentChunk()
  public EntityChunk getEntityChunk()
  public boolean shouldKeepLoaded()
  public void addKeepLoaded()
  public void removeKeepLoaded()
  public int pollKeepAlive(int pollCount)
  public void resetKeepAlive()
  public int pollActiveTimer(int pollCount)
  public void resetActiveTimer()
  public ChunkAccessor getChunkAccessor()
  public int getBlock(int x, int y, int z)
  public boolean setBlock(int x, int y, int z, int id, BlockType blockType, int rotation, int filler, int settings)
  private void setBlockPhysics(int x, int y, int z, BlockType blockType)
  public int getFiller(int x, int y, int z)
  public int getRotationIndex(int x, int y, int z)
  public boolean setTicking(int x, int y, int z, boolean ticking)
  public boolean isTicking(int x, int y, int z)
  public short getHeight(int x, int z)
  public short getHeight(int index)
  public int getTint(int x, int z)
  public Ref<ChunkStore> getBlockComponentEntity(int x, int y, int z)
  public Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
  public int getFluidId(int x, int y, int z)
  public byte getFluidLevel(int x, int y, int z)
  public int getSupportValue(int x, int y, int z)
  public void setState(int x, int y, int z, BlockType blockType, int rotation, Holder<ChunkStore> holder)
  public void markNeedsSaving()
  public boolean getNeedsSaving()
  public boolean consumeNeedsSaving()
  public boolean isSaving()
  public void setSaving(boolean saving)
  public long getIndex()
  public int getX()
  public int getZ()
  public void setLightingUpdatesEnabled(boolean enableLightUpdates)
  public boolean isLightingUpdatesEnabled()
  public World getWorld()
  public String toString()

Fields:
public static final int KEEP_ALIVE_DEFAULT
public static final BuilderCodec<WorldChunk> CODEC
private static final HytaleLogger LOGGER
private World world
private final StampedLock flagsLock
private final Flags<ChunkFlag> flags
private Ref<ChunkStore> reference
private BlockChunk blockChunk
private BlockComponentChunk blockComponentChunk
private EntityChunk entityChunk
private int keepAlive
private int activeTimer
private boolean needsSaving
private boolean isSaving
private final AtomicInteger keepLoaded
private boolean lightingUpdatesEnabled
public final AtomicLong chunkLightTiming
