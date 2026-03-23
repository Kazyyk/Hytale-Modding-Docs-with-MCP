# FluidSection

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section | Implements: Component<ChunkStore>

public class FluidSection implements Component<ChunkStore>

ECS component storing fluid data (type and level) for a 32x32x32 chunk section. Fluid types are stored in an `ISectionPalette` (same dynamic promotion/demotion as block data), and fluid levels are stored in a packed nibble array (4 bits per block, 16384 bytes for 32768 blocks). Thread safety is achieved via `StampedLock`.

## Constants

- LEVEL_DATA_SIZE | int | 16384 | Size of the level data array in bytes.
- VERSION | int | 0 | Current serialization version.

## Static Methods


public static ComponentType<ChunkStore, FluidSection> getComponentType()

## Instance Methods


public boolean setFluid(int x, int y, int z, int fluidId, byte level)

Sets the fluid type and level at the given coordinates. A level of 0 clears the fluid; a fluid ID of 0 clears the level. Returns `true` if any value changed.


public boolean setFluid(int x, int y, int z, @Nonnull Fluid fluid, byte level)

Sets using a `Fluid` asset reference.


public int getFluidId(int x, int y, int z)

Returns the fluid type index at the given coordinates.


@Nullable
public Fluid getFluid(int x, int y, int z)

Returns the `Fluid` asset at the given coordinates, or `null` if none.


public byte getFluidLevel(int x, int y, int z)

Returns the fluid level (0-15) at the given coordinates.


public int getX()


public int getY()


public int getZ()


public boolean isEmpty()

Returns `true` if the section contains no fluids.


@Nonnull
public IntOpenHashSet getAndClearChangedPositions()

Returns and clears the set of block indexes that have changed since the last call.


@Nonnull
public CompletableFuture<CachedPacket<SetFluids>> getCachedPacket()

Returns a lazily-computed cached `SetFluids` network packet for this section.

Also in this package: BlockSection, ChunkLightData, ChunkLightDataBuilder, ChunkSection, ChunkSectionReference, Res, TickRequest

Complete API:
  public static ComponentType<ChunkStore,FluidSection> getComponentType()
  public void preload(int x, int y, int z)
  public void load(int x, int y, int z)
  private boolean setFluidRaw(int x, int y, int z, int fluidId)
  private boolean setFluidRaw(int index, int fluidId)
  public boolean setFluid(int x, int y, int z, Fluid fluid, byte level)
  public boolean setFluid(int x, int y, int z, int fluidId, byte level)
  public boolean setFluid(int index, Fluid fluid, byte level)
  public boolean setFluid(int index, int fluidId, byte level)
  private boolean setFluidRaw(int x, int y, int z, Fluid fluid)
  private boolean setFluidRaw(int index, Fluid fluid)
  public int getFluidId(int x, int y, int z)
  public int getFluidId(int index)
  public Fluid getFluid(int x, int y, int z)
  public Fluid getFluid(int index)
  private boolean setFluidLevel(int x, int y, int z, byte level)
  private boolean setFluidLevel(int index, byte level)
  public byte getFluidLevel(int x, int y, int z)
  public byte getFluidLevel(int index)
  public int getX()
  public int getY()
  public int getZ()
  public IntOpenHashSet getAndClearChangedPositions()
  public Component<ChunkStore> clone()
  private void serializeForPacket(ByteBuf buf)
  private byte[] serialize(ExtraInfo extraInfo)
  private void deserialize(byte[] bytes, ExtraInfo extraInfo)
  public CompletableFuture<CachedPacket<SetFluids>> getCachedPacket()
  public boolean isEmpty()

Fields:
public static final int LEVEL_DATA_SIZE
public static final int VERSION
public static final BuilderCodec<FluidSection> CODEC
private final StampedLock lock
private int x
private int y
private int z
private boolean loaded
private ISectionPalette typePalette
private byte[] levelData
private int nonZeroLevels
private IntOpenHashSet changedPositions
private IntOpenHashSet swapChangedPositions
private transient SoftReference<CompletableFuture<CachedPacket<SetFluids>>> cachedPacket
