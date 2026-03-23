# BlockState

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta | Implements: Component<ChunkStore>

@Deprecated(forRemoval = true)
public abstract class BlockState implements Component<ChunkStore>

Abstract base class for all block states in the world. A block state is an ECS component attached to a specific block position within a `WorldChunk`, stored in the `ChunkStore`. Each block state is associated with a `BlockType` and holds a position (chunk-local coordinates) and an ECS reference. Subclasses implement specific stateful behaviors such as item containers, tickable logic, or network-sendable data.

Block states are serialized via a polymorphic `CodecMapCodec` keyed by a `"Type"` discriminator field. They are registered through BlockStateModule and tracked via BlockStateRegistration.

## Static Fields

- CODEC | CodecMapCodec<BlockState> | Polymorphic codec for serializing/deserializing block states by type key.
- BASE_CODEC | BuilderCodec<BlockState> | Base codec encoding the position field.
- TYPE_STRUCTURE | KeyedCodec<String> | Codec for the `"Type"` discriminator key.
- OPEN_WINDOW | String | Constant `"OpenWindow"`.
- CLOSE_WINDOW | String | Constant `"CloseWindow"`.

## Instance Methods


public void setReference(Ref<ChunkStore> reference)

Assigns the ECS reference for this block state. Throws `IllegalArgumentException` if a valid reference is already set.


public Ref<ChunkStore> getReference()


public void unloadFromWorld()

Clears the chunk association. Throws if the reference is still valid.


public boolean initialize(BlockType blockType)

Called when the block state is first loaded or created. Subclasses override to perform initialization. Returns `true` if initialization succeeds.


public void onUnload()

Called when the chunk containing this block state is unloaded.


public void validateInitialized()

Asserts that this block state has been initialized.


public int getIndex()

Returns the block's index within the chunk column, computed from position.


public void setPosition(WorldChunk chunk, @Nullable Vector3i position)

Sets the chunk and chunk-local position of this block state. Position X and Z are masked to 0-31.


public void setPosition(@Nonnull Vector3i position)

Sets only the position (without changing the chunk reference).


@Nonnull
public Vector3i getPosition()

Returns a clone of the chunk-local position.


public int getBlockX()

Returns the world X coordinate of this block.


public int getBlockY()

Returns the world Y coordinate of this block.


public int getBlockZ()

Returns the world Z coordinate of this block.


@Nonnull
public Vector3i getBlockPosition()

Returns the world position as a new `Vector3i`.


@Nonnull
public Vector3d getCenteredBlockPosition()

Returns the centered world position accounting for block type rotation.


@Nullable
public WorldChunk getChunk()


@Nullable
public BlockType getBlockType()

Returns the `BlockType` at this block state's position in the chunk.


public int getRotationIndex()

Returns the rotation index of the block at this position.


public void markNeedsSave()

Marks the containing chunk as needing to be saved.


public BsonDocument saveToDocument()

Serializes this block state to a BSON document using the polymorphic codec.


@Nonnull
public Holder<ChunkStore> toHolder()

Converts this block state into a detached `Holder` containing all of its ECS components.

## Static Methods


@Nullable
public static BlockState load(BsonDocument doc, @Nonnull WorldChunk chunk, @Nonnull Vector3i pos) throws NoSuchBlockStateException

Deserializes a block state from a BSON document, initializes it, and places it at the given position.


@Nullable
@Deprecated
public static BlockState ensureState(@Nonnull WorldChunk worldChunk, int x, int y, int z)

Creates and assigns a block state for the block at the given position if the block type defines one.


@Deprecated
public static BlockState getBlockState(@Nullable Ref<ChunkStore> reference, @Nonnull ComponentAccessor<ChunkStore> componentAccessor)

Retrieves the `BlockState` component from an ECS reference by searching the archetype for a matching component type.


@Nullable
@Deprecated
public static BlockState getBlockState(int index, @Nonnull ArchetypeChunk<ChunkStore> archetypeChunk)


@Nullable
@Deprecated
public static BlockState getBlockState(@Nonnull Holder<ChunkStore> holder)

## Related Types

- BlockStateModule -- Plugin that manages block state registration and lifecycle systems.
- BlockStateRegistration -- Registration handle for a block state class.
- BlockStateRegistry -- Registry facade used by plugins to register block states.

Known subclasses: BenchState, ItemContainerState, PrefabSpawnerState, SpawnMarkerBlockState

Also in this package: BlockStateModule, BlockStateRegistration, BlockStateRegistry, ItemContainerStateRefSystem, LegacyBlockStateHolderSystem, LegacyBlockStateRefSystem, LegacyLateInitBlockStateSystem, LegacyLoadPacketBlockStateSystem, LegacyTickingBlockStateSystem, LegacyUnloadPacketBlockStateSystem

Complete API:
  public void setReference(Ref<ChunkStore> reference)
  public Ref<ChunkStore> getReference()
  public void unloadFromWorld()
  public boolean initialize(BlockType blockType)
  public void onUnload()
  public void validateInitialized()
  public int getIndex()
  public void setPosition(WorldChunk chunk, Vector3i position)
  public void setPosition(Vector3i position)
  public Vector3i getPosition()
  public Vector3i __internal_getPosition()
  public void clearPositionForSerialization()
  public int getBlockX()
  public int getBlockY()
  public int getBlockZ()
  public Vector3i getBlockPosition()
  public Vector3d getCenteredBlockPosition()
  public WorldChunk getChunk()
  public BlockType getBlockType()
  public int getRotationIndex()
  public void invalidate()
  public void markNeedsSave()
  public BsonDocument saveToDocument()
  public Component<ChunkStore> clone()
  public Holder<ChunkStore> toHolder()
  public static BlockState load(BsonDocument doc, WorldChunk chunk, Vector3i pos)
  public static BlockState load(BsonDocument doc, WorldChunk chunk, Vector3i pos, BlockType blockType)
  public static BlockState ensureState(WorldChunk worldChunk, int x, int y, int z)
  public static BlockState getBlockState(Ref<ChunkStore> reference, ComponentAccessor<ChunkStore> componentAccessor)
  public static BlockState getBlockState(int index, ArchetypeChunk<ChunkStore> archetypeChunk)
  public static BlockState getBlockState(Holder<ChunkStore> holder)
  private static ComponentType<ChunkStore,T> findComponentType(Archetype<ChunkStore> archetype, Class<C> entityClass)

Fields:
private static final HytaleLogger LOGGER
public static final CodecMapCodec<BlockState> CODEC
public static final BuilderCodec<BlockState> BASE_CODEC
public static final KeyedCodec<String> TYPE_STRUCTURE
public static final String OPEN_WINDOW
public static final String CLOSE_WINDOW
final AtomicBoolean initialized
private WorldChunk chunk
private Vector3i position
protected Ref<ChunkStore> reference
