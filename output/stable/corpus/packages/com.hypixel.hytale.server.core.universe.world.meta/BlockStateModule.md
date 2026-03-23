# BlockStateModule

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta | Extends: JavaPlugin

@Deprecated(forRemoval = true)
public class BlockStateModule extends JavaPlugin

Server plugin responsible for registering and managing block state types within the ECS. Provides the bridge between the polymorphic `BlockState.CODEC` system and the ECS component registry. When a block state class is registered, this module creates the corresponding `ComponentType`, installs lifecycle systems (late-init, holder, ref, ticking, and packet systems), and registers codec entries for serialization.

## Static Fields

- MANIFEST | PluginManifest | Plugin manifest declaring dependency on `BlockModule`.

## Static Methods


public static BlockStateModule get()

Returns the singleton instance.

## Instance Methods


@Nullable
public <T extends BlockState> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, Codec<T> codec)

Registers a block state class with the given codec key. Installs ECS component type, lifecycle systems, and codec entries.


@Nullable
public <T extends BlockState, D extends StateData> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, @Nullable Codec<T> codec, Class<D> dataClass, @Nullable Codec<D> dataCodec)

Registers a block state class along with its associated `StateData` class and codec.


public <T extends BlockState, D extends StateData> void unregisterBlockState(Class<T> clazz, @Nullable Class<D> dataClass)

Unregisters a block state class and its data class. Skipped during server shutdown.


@Nullable
public <T extends BlockState> T createBlockState(Class<T> clazz, WorldChunk chunk, Vector3i pos, BlockType blockType)

Creates a new block state instance by class, placing it at the given position.


@Nullable
public BlockState createBlockState(String key, WorldChunk chunk, Vector3i pos, BlockType blockType)

Creates a new block state instance by codec key.


@Nullable
public <T extends BlockState> ComponentType<ChunkStore, T> getComponentType(@Nullable Class<T> entityClass)

Returns the ECS component type for the given block state class.


public ResourceType<ChunkStore, SpatialResource<Ref<ChunkStore>, ChunkStore>> getItemContainerSpatialResourceType()

Returns the spatial resource type used for `ItemContainerState` spatial indexing.

## Inner Classes

- `ItemContainerStateRefSystem` -- `RefSystem` that marks the block state info as needing rebuild when `ItemContainerState` entities are added or removed.
- `LegacyBlockStateHolderSystem<T>` -- `HolderSystem` handling removal lifecycle (destroy, unload) for block state entities.
- `LegacyBlockStateRefSystem<T>` -- `RefSystem` handling reference assignment and late initialization.
- `LegacyLateInitBlockStateSystem<T>` -- `EntityTickingSystem` performing deferred initialization for block states loaded alongside `BlockStateInfo`.
- `LegacyLoadPacketBlockStateSystem<T>` -- Sends block state data packets to players on chunk load.
- `LegacyTickingBlockStateSystem<T>` -- `EntityTickingSystem` dispatching `tick()` to `TickableBlockState` instances.
- `LegacyUnloadPacketBlockStateSystem<T>` -- Sends unload packets to players on chunk unload.

Also in this package: BlockState, BlockStateRegistration, BlockStateRegistry, ItemContainerStateRefSystem, LegacyBlockStateHolderSystem, LegacyBlockStateRefSystem, LegacyLateInitBlockStateSystem, LegacyLoadPacketBlockStateSystem, LegacyTickingBlockStateSystem, LegacyUnloadPacketBlockStateSystem

Complete API:
  public static BlockStateModule get()
  public ResourceType<ChunkStore,SpatialResource<Ref<ChunkStore>,ChunkStore>> getItemContainerSpatialResourceType()
  protected void setup()
  public BlockStateRegistration registerBlockState(Class<T> clazz, String key, Codec<T> codec)
  public BlockStateRegistration registerBlockState(Class<T> clazz, String key, Codec<T> codec, Class<D> dataClass, Codec<D> dataCodec)
  public void unregisterBlockState(Class<T> clazz, Class<D> dataClass)
  public T createBlockState(Class<T> clazz, WorldChunk chunk, Vector3i pos, BlockType blockType)
  public BlockState createBlockState(String key, WorldChunk chunk, Vector3i pos, BlockType blockType)
  public ComponentType<ChunkStore,T> getComponentType(Class<T> entityClass)

Fields:
public static final PluginManifest MANIFEST
private static BlockStateModule instance
private final Map<Class<? extends BlockState>,ComponentType<ChunkStore,? extends BlockState>> classToComponentType
private ResourceType<ChunkStore,SpatialResource<Ref<ChunkStore>,ChunkStore>> itemContainerSpatialResourceType
