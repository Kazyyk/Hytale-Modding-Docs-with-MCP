# FluidTicker

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid

public abstract class FluidTicker

Base class for fluid tick simulation. Defines the JSON-configurable properties `FlowRate` (tick frequency in seconds, default 0.5), `CanDemote` (whether fluid levels decrease), and `SupportedBy` (another fluid that sustains this one). The `tick` method rate-limits processing based on `flowRate` and delegates to `process`, which checks `isAlive` status and then calls the abstract `spread` method. Provides utility methods for solid block checks, fluid blocking detection through hitboxes, and surrounding block tick activation.

## Constants

- public static final int FLUID_BLOCK_DISTANCE
- protected static final int SPREAD_NO_PATH
- protected static final int SPREAD_NO_CHUNK

## JSON-Configurable Fields

- float flowRate
- boolean canDemote
- String supportedBy

## Abstract Methods

- protected abstract BlockTickStrategy spread(World world, long tick, Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)

## Key Methods

- public BlockTickStrategy tick(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull CachedAccessor cachedAccessor, ...)
- public BlockTickStrategy process(World world, long tick, @Nonnull Accessor accessor, ...)
- public boolean canOccupySolidBlocks()
- public boolean canDemote()
- public int getSupportedById()
- public boolean isSelfFluid(int selfFluidId, int otherFluidId)
- public boolean blocksFluidFrom(@Nonnull BlockType blockType, int rotationIndex, int offsetX, int offsetZ)
- public boolean blocksFluidFrom(@Nonnull BlockType blockType, int rotationIndex, int offsetX, int offsetZ, int filler)
- public static boolean isFullySolid(@Nonnull BlockType blockType)
- public static boolean isSolid(@Nonnull BlockType blockType)
- public static void setTickingSurrounding(@Nonnull Accessor accessor, BlockSection blockSection, int worldX, int worldY, int worldZ)

## Inner Types

### Accessor (interface)


public interface Accessor {
    @Nullable FluidSection getFluidSection(int cx, int cy, int cz);
    @Nullable default FluidSection getFluidSectionByBlock(int bx, int by, int bz);
    @Nullable BlockSection getBlockSection(int cx, int cy, int cz);
    @Nullable default BlockSection getBlockSectionByBlock(int bx, int by, int bz);
    @Deprecated(forRemoval = true) void setBlock(int x, int y, int z, int blockId);
}

### AliveStatus (enum)


public static enum AliveStatus { ALIVE, DEMOTE, WAIT_FOR_ADJACENT_CHUNK; }

### CachedAccessor (static class)


public static class CachedAccessor extends AbstractCachedAccessor implements Accessor

Thread-local cached accessor that stores fluid and block section lookups to avoid repeated chunk queries during tick processing.

## Related Types

- Fluid -- owns a ticker instance
- DefaultFluidTicker -- standard liquid spreading
- FiniteFluidTicker -- volume-conserving simulation
- FireFluidTicker -- fire propagation

Known subclasses: DefaultFluidTicker, FiniteFluidTicker, FireFluidTicker

Also in this package: Accessor, AliveStatus, CachedAccessor, ConversionResult, DefaultFluidTicker, FiniteFluidTicker, FireFluidTicker, FlammabilityConfig, Fluid, FluidCollisionConfig, FluidTypePacketGenerator, SpreadOutcome

Complete API:
  public int getSupportedById()
  public BlockTickStrategy tick(CommandBuffer<ChunkStore> commandBuffer, FluidTicker.CachedAccessor cachedAccessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, int worldX, int worldY, int worldZ)
  public boolean canOccupySolidBlocks()
  public BlockTickStrategy process(World world, long tick, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, int worldX, int worldY, int worldZ)
  protected FluidTicker.AliveStatus isAlive(FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)
  protected abstract BlockTickStrategy spread(World var1, long var2, FluidTicker.Accessor var4, FluidSection var5, BlockSection var6, Fluid var7, int var8, byte var9, int var10, int var11, int var12)
  public static void setTickingSurrounding(FluidTicker.Accessor accessor, BlockSection blockSection, int worldX, int worldY, int worldZ)
  protected int getSpreadOffsets(BlockTypeAssetMap<String,BlockType> blockMap, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, int worldX, int worldY, int worldZ, Vector2i[] offsetArray, int fluidId, int maxDropDistance)
  protected int distanceToDrop(BlockTypeAssetMap<String,BlockType> blockMap, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, int worldX, int worldY, int worldZ, Vector2i offset, int fluidId, int maxDropDistance)
  public static boolean isFullySolid(BlockType blockType)
  public static boolean isSolid(BlockType blockType)
  public boolean blocksFluidFrom(BlockType blockType, int rotationIndex, int offsetX, int offsetZ)
  public boolean blocksFluidFrom(BlockType blockType, int rotationIndex, int offsetX, int offsetZ, int filler)
  private static boolean boxesBlockFace(Box[] boxes, int offsetX, int offsetZ)
  public boolean isSelfFluid(int selfFluidId, int otherFluidId)
  public boolean canDemote()

Fields:
public static final BuilderCodec<FluidTicker> BASE_CODEC
public static final CodecMapCodec<FluidTicker> CODEC
protected static final Vector2i[] ORTO_OFFSETS
protected static final int SPREAD_NO_PATH
protected static final int SPREAD_NO_CHUNK
protected static final int OFFSET_DROP_NONE
public static final int FLUID_BLOCK_DISTANCE
private static final double FULL_DIMENSION_THRESHOLD
private static final double PARTIAL_DIMENSION_THRESHOLD
private static final double FACE_BLOCK_THRESHOLD
private float flowRate
private boolean canDemote
private String supportedBy
private transient int supportedById
