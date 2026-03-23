# BlockComponentChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: Component<ChunkStore>

public class BlockComponentChunk implements Component<ChunkStore>

ECS component that stores per-block component entities (block states) for a chunk column. Maps block indexes (computed from x, y, z within the chunk) to either `Holder<ChunkStore>` (serialized, not yet loaded into the store) or `Ref<ChunkStore>` (live references in the ECS store). Provides thread-safe access patterns for the chunk loading/unloading lifecycle.

## Static Methods


public static ComponentType<ChunkStore, BlockComponentChunk> getComponentType()

## Instance Methods


@Nonnull
public Int2ObjectMap<Holder<ChunkStore>> getEntityHolders()

Returns an unmodifiable view of the stored entity holders.


@Nullable
public Holder<ChunkStore> getEntityHolder(int index)


public void addEntityHolder(int index, @Nonnull Holder<ChunkStore> holder)

Adds a holder at the given block index. Throws if a reference or holder already exists at that index.


@Nonnull
public Int2ObjectMap<Ref<ChunkStore>> getEntityReferences()

Returns an unmodifiable view of the live entity references.


@Nullable
public Ref<ChunkStore> getEntityReference(int index)


public void addEntityReference(int index, @Nonnull Ref<ChunkStore> reference)


public void removeEntityReference(int index, Ref<ChunkStore> reference)


@Nullable
public <T extends Component<ChunkStore>> T getComponent(int index, @Nonnull ComponentType<ChunkStore, T> componentType)

Gets a component from the block entity at the given index, checking live references first, then holders.


public boolean hasComponents(int index)

Returns `true` if any entity (reference or holder) exists at the given block index.

## Inner Classes

- `BlockComponentChunkLoadingSystem` -- `RefChangeSystem` managing the transition between holders and live references when chunks start/stop ticking.
- `LoadBlockComponentPacketSystem` -- Sends block component data packets to clients on chunk load.
- `UnloadBlockComponentPacketSystem` -- Sends unload packets to clients on chunk unload.

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunkLoadingSystem, BlockOperations, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public static ComponentType<ChunkStore,BlockComponentChunk> getComponentType()
  public Component<ChunkStore> clone()
  public Component<ChunkStore> cloneSerializable()
  public Int2ObjectMap<Holder<ChunkStore>> getEntityHolders()
  public Holder<ChunkStore> getEntityHolder(int index)
  public void addEntityHolder(int index, Holder<ChunkStore> holder)
  public void storeEntityHolder(int index, Holder<ChunkStore> holder)
  public Holder<ChunkStore> removeEntityHolder(int index)
  public Int2ReferenceMap<Ref<ChunkStore>> getEntityReferences()
  public Ref<ChunkStore> getEntityReference(int index)
  public void addEntityReference(int index, Ref<ChunkStore> reference)
  public void loadEntityReference(int index, Ref<ChunkStore> reference)
  public void removeEntityReference(int index, Ref<ChunkStore> reference)
  public void unloadEntityReference(int index, Ref<ChunkStore> reference)
  public Int2ObjectMap<Holder<ChunkStore>> takeEntityHolders()
  public Int2ObjectMap<Ref<ChunkStore>> takeEntityReferences()
  public T getComponent(int index, ComponentType<ChunkStore,T> componentType)
  public boolean hasComponents(int index)
  public boolean getNeedsSaving()
  public void markNeedsSaving()
  public boolean consumeNeedsSaving()

Fields:
public static final BuilderCodec<BlockComponentChunk> CODEC
private final Int2ObjectMap<Holder<ChunkStore>> entityHolders
private final Int2ReferenceMap<Ref<ChunkStore>> entityReferences
private final Int2ObjectMap<Holder<ChunkStore>> entityHoldersUnmodifiable
private final Int2ReferenceMap<Ref<ChunkStore>> entityReferencesUnmodifiable
private boolean needsSaving
