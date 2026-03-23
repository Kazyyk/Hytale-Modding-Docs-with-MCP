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
