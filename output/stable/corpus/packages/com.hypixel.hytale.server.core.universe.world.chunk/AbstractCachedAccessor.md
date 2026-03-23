# AbstractCachedAccessor

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk

public abstract class AbstractCachedAccessor

Abstract base for cached chunk/section accessors that maintain a local grid of chunk and section references around a central point. Used to avoid repeated lookups during operations that access multiple neighboring chunks/sections (e.g., world generation, lighting, block physics). The cache stores 2D chunk references and 3D section references plus component caches.

Subclasses call `init()` with a center position and radius, then use `getChunk()`, `getSection()`, and `getComponentSection()` for cached lookups.

## Protected Fields

- commandBuffer | ComponentAccessor<ChunkStore> | The component accessor used for store lookups.

## Instance Methods


@Nullable
public Ref<ChunkStore> getChunk(int cx, int cz)

Returns the chunk reference at the given chunk coordinates, using the cache if within range.


@Nullable
public Ref<ChunkStore> getSection(int cx, int cy, int cz)

Returns the section reference at the given chunk-section coordinates (cy must be 0-9). Uses the cache if within range.


@Nullable
protected <T extends Component<ChunkStore>> T getComponentSection(int cx, int cy, int cz, int typeIndex, @Nonnull ComponentType<ChunkStore, T> componentType)

Returns a cached component from a section, lazily loading it on first access.

Known subclasses: CachedAccessor, CachedAccessor, CachedAccessor

Also in this package: BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  protected void init(ComponentAccessor<ChunkStore> commandBuffer, int cx, int cy, int cz, int radius)
  protected void insertSection(Ref<ChunkStore> section, int cx, int cy, int cz)
  protected void insertSectionComponent(int index, Component<ChunkStore> component, int cx, int cy, int cz)
  public Ref<ChunkStore> getChunk(int cx, int cz)
  public Ref<ChunkStore> getSection(int cx, int cy, int cz)
  protected T getComponentSection(int cx, int cy, int cz, int typeIndex, ComponentType<ChunkStore,T> componentType)

Fields:
protected ComponentAccessor<ChunkStore> commandBuffer
private int minX
private int minY
private int minZ
private int length
private Ref<ChunkStore>[] chunks
private Ref<ChunkStore>[] sections
private Component<ChunkStore>[][] sectionComponents
