# ChunkColumn

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: Component<ChunkStore>

@Deprecated
public class ChunkColumn implements Component<ChunkStore>

ECS component representing the vertical subdivision of a chunk into 10 sections (each 32 blocks tall). Holds an array of `Ref<ChunkStore>` for live section entities and an optional array of `Holder<ChunkStore>` for serialized section data not yet loaded into the store.

## Static Methods


public static ComponentType<ChunkStore, ChunkColumn> getComponentType()

## Instance Methods


@Nullable
public Ref<ChunkStore> getSection(int section)

Returns the live section reference at the given index (0-9), or `null` if out of range or not loaded.


@Nonnull
public Ref<ChunkStore>[] getSections()

Returns the full 10-element section reference array.


@Nullable
public Holder<ChunkStore>[] getSectionHolders()

Returns the serialized section holders, or `null` if already consumed.


@Nullable
public Holder<ChunkStore>[] takeSectionHolders()

Returns and clears the section holders array.


public void putSectionHolders(Holder<ChunkStore>[] holders)

Sets the section holders array (used during serialization or migration).

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockOperations, BlockRotationUtil, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public static ComponentType<ChunkStore,ChunkColumn> getComponentType()
  public Ref<ChunkStore> getSection(int section)
  public Ref<ChunkStore>[] getSections()
  public Holder<ChunkStore>[] getSectionHolders()
  public Holder<ChunkStore>[] takeSectionHolders()
  public void putSectionHolders(Holder<ChunkStore>[] holders)
  public Component<ChunkStore> clone()
  public Component<ChunkStore> cloneSerializable()

Fields:
public static final BuilderCodec<ChunkColumn> CODEC
private final Ref<ChunkStore>[] sections
private Holder<ChunkStore>[] sectionHolders
