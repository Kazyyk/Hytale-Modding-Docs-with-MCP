# BlockSelection

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.standard | Implements: NetworkSerializable<EditorBlocksChange>, MetricProvider

public class BlockSelection implements NetworkSerializable<EditorBlocksChange>, MetricProvider

A mutable, thread-safe container representing a selection of blocks, fluids, and entities in a world region. Used by the prefab and editor systems for copy, paste, rotate, flip, and placement operations. Stores blocks as packed `long` coordinates mapped to `BlockHolder` records, fluids as packed coordinates mapped to `FluidHolder` records, and entities as `Holder<EntityStore>` instances with relative `TransformComponent` positions.

All block and fluid access is guarded by a `ReentrantReadWriteLock` (`blocksLock`), and entity access by a separate `ReentrantReadWriteLock` (`entitiesLock`).

Implements `NetworkSerializable<EditorBlocksChange>` for serialization to editor preview packets and `MetricProvider` for diagnostic metrics.

## Constants


public static final Consumer<Ref<EntityStore>> DEFAULT_ENTITY_CONSUMER = ref -> {}

No-op entity consumer used as default for placement methods.


public static final MetricsRegistry<BlockSelection> METRICS_REGISTRY

Metrics registry exposing lock state, position, anchor, min/max bounds, block count, and entity count.

## Constructors


public BlockSelection()

Creates an empty selection with default-capacity backing maps.


public BlockSelection(int initialBlockCapacity, int initialEntityCapacity)

Creates an empty selection with the given initial capacities for block and entity storage.


public BlockSelection(@Nonnull BlockSelection other)

Copy constructor. Copies all properties, blocks, fluids, and entities from `other`. Throws `IllegalArgumentException` if `other == this`.

## Position and Anchor


public int getX()
public int getY()
public int getZ()

Returns the selection's world position.


public int getAnchorX()
public int getAnchorY()
public int getAnchorZ()

Returns the selection's anchor offset (origin point for rotation and placement).


public void setPosition(int x, int y, int z)

Sets the world position.


public void setAnchor(int anchorX, int anchorY, int anchorZ)

Sets the anchor offset in local coordinates.


public void setAnchorAtWorldPos(int anchorX, int anchorY, int anchorZ)

Sets the anchor by converting world coordinates to local coordinates relative to the selection position.

## Bounds


@Nonnull
public Vector3i getSelectionMin()

Returns a clone of the minimum corner of the selection bounds.


@Nonnull
public Vector3i getSelectionMax()

Returns a clone of the maximum corner of the selection bounds.


public boolean hasSelectionBounds()

Returns `true` if the selection has non-zero bounds.


public void setSelectionArea(@Nonnull Vector3i min, @Nonnull Vector3i max)

Sets the selection bounds, normalizing so `min` is always less than or equal to `max`.


public int getSelectionVolume()

Returns the volume of the selection bounding box.

## Counts


public int getBlockCount()

Returns the number of blocks in the selection (thread-safe).


public int getFluidCount()

Returns the number of fluid entries in the selection (thread-safe).


public int getEntityCount()

Returns the number of entities in the selection (thread-safe).

## Block Access


public boolean hasBlockAtWorldPos(int x, int y, int z)

Returns `true` if a block exists at the given world position.


public boolean hasBlockAtLocalPos(int x, int y, int z)

Returns `true` if a block exists at the given local position.


public int getBlockAtWorldPos(int x, int y, int z)

Returns the block ID at the given world position, or `Integer.MIN_VALUE` if not present.


public BlockSelection.BlockHolder getBlockHolderAtWorldPos(int x, int y, int z)

Returns the `BlockHolder` at the given world position, or `null` if not present.

## Fluid Access


public int getFluidAtWorldPos(int x, int y, int z)

Returns the fluid ID at the given world position, or `Integer.MIN_VALUE` if not present.


public byte getFluidLevelAtWorldPos(int x, int y, int z)

Returns the fluid level at the given world position, or `0` if not present.

## Block State Access


public int getSupportValueAtWorldPos(int x, int y, int z)

Returns the support value at the given world position, or `0` if not present.


@Nullable
public Holder<ChunkStore> getStateAtWorldPos(int x, int y, int z)

Returns a clone of the block state holder at the given world position, or `null` if not present.

## Adding Blocks and Fluids


public void addEmptyAtWorldPos(int x, int y, int z)

Adds an air block and empty fluid at the given world position.


public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)

Adds a block at a world position with the given properties.


public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)

Adds a block at a local position with the given properties.


public void addFluidAtWorldPos(int x, int y, int z, int fluidId, byte fluidLevel)

Adds a fluid at a world position.


public void addFluidAtLocalPos(int x, int y, int z, int fluidId, byte fluidLevel)

Adds a fluid at a local position.

## Adding Entities


public void addEntityFromWorld(@Nonnull Holder<EntityStore> entityHolder)

Adds an entity from the world, converting its position to local coordinates relative to the selection position.


public void addEntityHolderRaw(Holder<EntityStore> entityHolder)

Adds an entity holder directly without position conversion.


public void sortEntitiesByPosition()

Sorts entities by their `TransformComponent` position (X, then Y, then Z).

## Iteration


public void forEachBlock(@Nonnull BlockSelection.BlockIterator iterator)

Iterates over all blocks in the selection under a read lock.


public void forEachFluid(@Nonnull BlockSelection.FluidIterator iterator)

Iterates over all fluids in the selection under a read lock.


public void forEachEntity(Consumer<Holder<EntityStore>> consumer)

Iterates over all entities in the selection under a read lock.


public boolean compare(@Nonnull BlockSelection.BlockComparingIterator iterator)

Tests all blocks against a predicate. Returns `false` as soon as any block fails the test.

## World Comparison


public boolean canPlace(@Nonnull World world, @Nonnull Vector3i position, @Nullable IntList mask)

Returns `true` if every block in the selection can be placed at the given world position. A block can be placed if the target world position contains air or a block ID present in the mask.


public boolean matches(@Nonnull World world, @Nonnull Vector3i position)

Returns `true` if the selection matches the world state at the given position (block IDs match exactly).

## Copying from World


public void copyFromAtWorld(int x, int y, int z, @Nonnull WorldChunk other, @Nullable BlockPhysics blockPhysics)

Copies a block and fluid from a world chunk at the given world position into the selection.

## Placement


public void placeNoReturn(@Nonnull World world, Vector3i position, ComponentAccessor<EntityStore> componentAccessor)
public void placeNoReturn(String feedbackKey, CommandSender feedback, @Nonnull World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
public void placeNoReturn(String feedbackKey, CommandSender feedback, @Nonnull FeedbackConsumer feedbackConsumer, @Nonnull World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
public void placeNoReturn(@Nullable String feedbackKey, @Nullable CommandSender feedback, @Nonnull FeedbackConsumer feedbackConsumer, @Nonnull World outerWorld, @Nullable Vector3i position, @Nullable BlockMask blockMask, ComponentAccessor<EntityStore> componentAccessor)

Places the selection into the world without returning the previous state. Handles block placement, fluid placement, height map updates, lighting invalidation, entity spawning, and chunk notification. Supports optional FeedbackConsumer for progress callbacks and `BlockMask` for exclusion filtering.


@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld)
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld, BlockMask blockMask)
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld, Vector3i position, BlockMask blockMask)
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld, @Nullable Vector3i position, @Nullable BlockMask blockMask, @Nonnull Consumer<Ref<EntityStore>> entityConsumer)

Places the selection into the world, returning a new `BlockSelection` containing the previous state (for undo). Handles all block/fluid/entity placement, physics support values, lighting, and chunk notifications.

## Transformation


@Nonnull
public BlockSelection rotate(@Nonnull Axis axis, int angle)

Returns a new selection rotated around the anchor point by the given angle on the given axis. Rotates block positions, block rotations, filler offsets, and entity positions and rotations.


@Nonnull
public BlockSelection rotate(@Nonnull Axis axis, int angle, @Nonnull Vector3f originOfRotation)

Returns a new selection rotated around a custom origin point instead of the anchor.


@Nonnull
public BlockSelection rotateArbitrary(float yawDegrees, float pitchDegrees, float rollDegrees)

Returns a new selection rotated by arbitrary Euler angles using matrix rotation. Performs inverse-mapping from destination space to source space to avoid gaps. Block rotations are snapped to the nearest 90-degree increment.


@Nonnull
public BlockSelection flip(@Nonnull Axis axis)

Returns a new selection mirrored along the given axis. Adjusts block rotation tuples and filler offsets according to the block type's flip type. Entity positions and rotations are also flipped.


@Nonnull
public BlockSelection relativize()
@Nonnull
public BlockSelection relativize(int originX, int originY, int originZ)

Returns a new selection with all positions offset relative to the given origin (or the anchor). Adjusts position, anchor, bounds, block positions, and entity positions.

## Cloning and Merging


@Nonnull
public BlockSelection cloneSelection()

Returns a deep copy of the selection, including cloned block holders and entity holders.


public void add(@Nonnull BlockSelection other)

Merges another selection into this one, adjusting positions based on the relative offsets of the two selections.

## Serialization


public void reserializeBlockStates(ChunkStore store, boolean destructive)

Re-processes block states through migration systems. Creates block entity holders and state data where missing. If `destructive`, removes unknown components.


public void reserializeEntities(@Nonnull Store<EntityStore> store, boolean destructive) throws IOException

Re-processes entity holders through migration systems. If `destructive`, removes unknown components.


public void clearAllSupportValues()

Resets all block support values to zero.

## Filler Repair


public void tryFixFiller(boolean allowDestructive)

Repairs inconsistent filler block references. Validates that filler blocks point to valid base blocks with matching hitboxes. If `allowDestructive` is `false`, throws `IllegalArgumentException` when a non-air block would need to be replaced.

## Packet Serialization


@Nonnull
public EditorBlocksChange toPacket()

Serializes the selection to an `EditorBlocksChange` packet containing block changes (excluding fillers) and fluid changes.


@Nonnull
public EditorBlocksChange toSelectionPacket()

Creates a packet containing only the selection bounds (no block data).


@Nonnull
public EditorBlocksChange toPacketWithSelection()

Serializes the selection to a packet with both block data and selection bounds.

## Metrics


@Nonnull
@Override
public MetricResults toMetricResults()

Returns diagnostic metrics via the `METRICS_REGISTRY`.

## Properties


public void setPrefabId(int id)

Sets the prefab ID used when spawning entities during placement.


public void copyPropertiesFrom(@Nonnull BlockSelection other)

Copies position, anchor, and bounds from another selection.

## Inner Types

### BlockComparingIterator


@FunctionalInterface
public interface BlockComparingIterator

Functional interface for block comparison predicates.


boolean test(int var1, int var2, int var3, BlockSelection.BlockHolder var4)

Tests a block at local coordinates (x, y, z) with its data. Return `false` to short-circuit iteration.

### BlockHolder


public record BlockHolder(int blockId, int rotation, int filler, int supportValue, Holder<ChunkStore> holder)

Immutable record storing a block's ID, rotation index, filler offset, physics support value, and optional block state holder.


@Nonnull
public BlockSelection.BlockHolder cloneBlockHolder()

Returns a copy with a cloned state holder. If the holder is `null`, returns `this`.

### BlockIterator


@FunctionalInterface
public interface BlockIterator

Functional interface for block iteration.


void accept(int var1, int var2, int var3, BlockSelection.BlockHolder var4)

Called for each block with local coordinates (x, y, z) and its data.

### FallbackMode


public static enum FallbackMode

Enum controlling behavior when a block cannot be matched during operations.

- PASS_THOUGH | Skip unmatched blocks.
- COPY | Copy unmatched blocks as-is.

### FluidHolder


public record FluidHolder(int fluidId, byte fluidLevel)

Immutable record storing a fluid's ID and level.

### FluidIterator


@FunctionalInterface
public interface FluidIterator

Functional interface for fluid iteration.


void accept(int var1, int var2, int var3, int var4, byte var5)

Called for each fluid with local coordinates (x, y, z), fluid ID, and fluid level.

## Related Types

- FeedbackConsumer -- callback interface for placement progress feedback
- `World` -- world instance used for placement and comparison operations
- `BlockMask` -- exclusion mask for selective placement
- `BlockType` -- block type asset used for rotation and hitbox lookup
- `TransformComponent` -- entity position component adjusted during transform operations
- `PrefabPlaceEntityEvent` -- event fired when an entity is placed from a prefab

Also in this package: BlockComparingIterator, BlockHolder, BlockIterator, FallbackMode, FeedbackConsumer, FluidHolder, FluidIterator

Complete API:
  public int getX()
  public int getY()
  public int getZ()
  public int getAnchorX()
  public int getAnchorY()
  public int getAnchorZ()
  public Vector3i getSelectionMin()
  public Vector3i getSelectionMax()
  public boolean hasSelectionBounds()
  public int getBlockCount()
  public int getFluidCount()
  public int getSelectionVolume()
  public int getEntityCount()
  public void setPosition(int x, int y, int z)
  public void setAnchorAtWorldPos(int anchorX, int anchorY, int anchorZ)
  public void setAnchor(int anchorX, int anchorY, int anchorZ)
  public void setSelectionArea(Vector3i min, Vector3i max)
  public void setPrefabId(int id)
  public void copyPropertiesFrom(BlockSelection other)
  public boolean canPlace(World world, Vector3i position, IntList mask)
  public boolean matches(World world, Vector3i position)
  public boolean compare(BlockSelection.BlockComparingIterator iterator)
  public boolean hasBlockAtWorldPos(int x, int y, int z)
  public boolean hasBlockAtLocalPos(int x, int y, int z)
  public int getBlockAtWorldPos(int x, int y, int z)
  private int getBlockAtLocalPos(int x, int y, int z)
  public BlockSelection.BlockHolder getBlockHolderAtWorldPos(int x, int y, int z)
  private BlockSelection.BlockHolder getBlockHolderAtLocalPos(int x, int y, int z)
  public int getFluidAtWorldPos(int x, int y, int z)
  private int getFluidAtLocalPos(int x, int y, int z)
  public byte getFluidLevelAtWorldPos(int x, int y, int z)
  private byte getFluidLevelAtLocalPos(int x, int y, int z)
  public int getSupportValueAtWorldPos(int x, int y, int z)
  private int getSupportValueAtLocalPos(int x, int y, int z)
  public Holder<ChunkStore> getStateAtWorldPos(int x, int y, int z)
  private Holder<ChunkStore> getStateAtLocalPos(int x, int y, int z)
  public void forEachBlock(BlockSelection.BlockIterator iterator)
  public void forEachFluid(BlockSelection.FluidIterator iterator)
  public void forEachEntity(Consumer<Holder<EntityStore>> consumer)
  public void copyFromAtWorld(int x, int y, int z, WorldChunk other, BlockPhysics blockPhysics)
  public void addEmptyAtWorldPos(int x, int y, int z)
  public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
  public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
  public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
  public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
  private void addBlock0(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
  private void addBlock0(int x, int y, int z, BlockSelection.BlockHolder block)
  public void addFluidAtWorldPos(int x, int y, int z, int fluidId, byte fluidLevel)
  public void addFluidAtLocalPos(int x, int y, int z, int fluidId, byte fluidLevel)
  private void addFluid0(int x, int y, int z, int fluidId, byte fluidLevel)
  private void addEntity0(Holder<EntityStore> holder)
  public void reserializeBlockStates(ChunkStore store, boolean destructive)
  public void clearAllSupportValues()
  public void addEntityFromWorld(Holder<EntityStore> entityHolder)
  public void addEntityHolderRaw(Holder<EntityStore> entityHolder)
  public void sortEntitiesByPosition()
  public void placeNoReturn(World world, Vector3i position, ComponentAccessor<EntityStore> componentAccessor)
  public void placeNoReturn(String feedbackKey, CommandSender feedback, World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
  public void placeNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
  public void placeNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, Vector3i position, BlockMask blockMask, ComponentAccessor<EntityStore> componentAccessor)
  private void placeBlockNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, BlockMask blockMask, LongSet dirtyChunks, BlockTypeAssetMap<String,BlockType> assetMap, int totalBlocks, int counter, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int newBlockId, int newRotation, int newFiller, Holder<ChunkStore> holder, ComponentAccessor<EntityStore> componentAccessor)
  private void placeFluidNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, BlockMask blockMask, LongSet dirtyChunks, BlockTypeAssetMap<String,BlockType> assetMap, int totalBlocks, int counter, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int newFluidId, byte newFluidLevel, ComponentAccessor<EntityStore> componentAccessor)
  private void clearFluidAtPosition(World world, WorldChunk chunk, int blockX, int blockY, int blockZ)
  public BlockSelection place(CommandSender feedback, World outerWorld)
  public BlockSelection place(CommandSender feedback, World outerWorld, BlockMask blockMask)
  public BlockSelection place(CommandSender feedback, World outerWorld, Vector3i position, BlockMask blockMask)
  public BlockSelection place(CommandSender feedback, World outerWorld, Vector3i position, BlockMask blockMask, Consumer<Ref<EntityStore>> entityConsumer)
  private void placeBlock(CommandSender feedback, World outerWorld, BlockMask blockMask, BlockSelection before, LongSet dirtyChunks, BlockTypeAssetMap<String,BlockType> assetMap, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int localX, int localY, int localZ, int newBlockId, int newRotation, int newFiller, Holder<ChunkStore> holder, int newSupportValue)
  private void placeFluid(CommandSender feedback, World outerWorld, BlockSelection before, LongSet dirtyChunks, IndexedLookupTableAssetMap<String,Fluid> assetMap, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int localX, int localY, int localZ, int newFluidId, byte newFluidLevel)
  private void placeEntities(World world, Vector3i pos)
  private void placeEntities(World world, Vector3i pos, Consumer<Ref<EntityStore>> entityConsumer)
  private Ref<EntityStore> placeEntity(World world, Holder<EntityStore> entityHolder, Vector3i pos, int prefabId)
  public BlockSelection rotate(Axis axis, int angle)
  public BlockSelection rotate(Axis axis, int angle, Vector3f originOfRotation)
  public BlockSelection rotateArbitrary(float yawDegrees, float pitchDegrees, float rollDegrees)
  public BlockSelection flip(Axis axis)
  public BlockSelection relativize()
  public BlockSelection relativize(int originX, int originY, int originZ)
  public BlockSelection cloneSelection()
  public void add(BlockSelection other)
  public MetricResults toMetricResults()
  public EditorBlocksChange toPacket()
  public EditorBlocksChange toSelectionPacket()
  public EditorBlocksChange toPacketWithSelection()
  public void tryFixFiller(boolean allowDestructive)
  public void reserializeEntities(Store<EntityStore> store, boolean destructive)
  public String toString()

Fields:
public static final Consumer<Ref<EntityStore>> DEFAULT_ENTITY_CONSUMER
public static final MetricsRegistry<BlockSelection> METRICS_REGISTRY
private static final HytaleLogger LOGGER
private int x
private int y
private int z
private int anchorX
private int anchorY
private int anchorZ
private int prefabId
private Vector3i min
private Vector3i max
private final Long2ObjectMap<BlockSelection.BlockHolder> blocks
private final Long2ObjectMap<BlockSelection.FluidHolder> fluids
private final List<Holder<EntityStore>> entities
private final ReentrantReadWriteLock blocksLock
private final ReentrantReadWriteLock entitiesLock
