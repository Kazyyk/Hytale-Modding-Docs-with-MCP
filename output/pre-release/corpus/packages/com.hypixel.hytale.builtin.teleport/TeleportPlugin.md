# TeleportPlugin

Type: class | Package: com.hypixel.hytale.builtin.teleport | Extends: JavaPlugin

public class TeleportPlugin extends JavaPlugin

## Fields

- private static TeleportPlugin instance
- public static final String WARP_MODEL_ID
- private ComponentType<EntityStore, TeleportHistory> teleportHistoryComponentType
- private ComponentType<EntityStore, TeleportPlugin.WarpComponent> warpComponentType
- private final AtomicBoolean loaded
- private final ReentrantLock saveLock
- private final AtomicBoolean postSaveRedo
- private final Map<String, Warp> warps
- private Model warpModel
- CommandRegistry commandRegistry
- EventRegistry eventRegistry
- ModelAsset modelAsset
- BsonDocument document
- Path universePath
- Path oldPath
- Path path
- BsonArray bsonWarps
- Warp[] array
- Map<String, ModelAsset> modelMap
- WorldChunk chunk
- BlockChunk blockChunk
- int chunkX
- int chunkZ
- World world
- String worldName
- Warp warp
- Transform transform
- Vector3d position
- Store<EntityStore> store
- Holder<EntityStore> holder
- public static final TeleportPlugin.WarpMarkerProvider INSTANCE
- Map<String, Warp> warps
- GameplayConfig gameplayConfig
- MapMarker marker

## Constructors

- public TeleportPlugin(@Nonnull JavaPluginInit init)

## Methods

- public static TeleportPlugin get()
- public ComponentType<EntityStore, TeleportHistory> getTeleportHistoryComponentType()
- public boolean isWarpsLoaded()
- protected void setup()
- throw new UnsupportedOperationException("WarpComponent must be created manually")
- protected void start()
- throw new IllegalStateException(String.format("Default warp model '%s' not found", "Warp")
- protected void shutdown()
- public void loadWarps()
- private void saveWarps0()
- public void saveWarps()
- public Map<String, Warp> getWarps()
- private void onModelAssetChange(@Nonnull LoadedAssetsEvent<String, ModelAsset, DefaultAssetMap<String, ModelAsset>> event)
- private void onChunkPreLoadProcess(@Nonnull ChunkPreLoadProcessEvent event)
- public Holder<EntityStore> createWarp(@Nonnull Warp warp, @Nonnull Store<EntityStore> store)
- public record WarpComponent(Warp warp)
- public static ComponentType<EntityStore, TeleportPlugin.WarpComponent> getComponentType()
- public Component<EntityStore> clone()
- public void update(@Nonnull World world, @Nonnull Player player, @Nonnull MarkersCollector collector)

## Inner Types

- `TeleportPlugin.WarpComponent`
- `TeleportPlugin.WarpMarkerProvider`

## Related Types

- Warp

Also in this package: Warp, WarpComponent, WarpListPage, WarpListPageEventData, WarpMarkerProvider

Complete API:
  public static TeleportPlugin get()
  public ComponentType<EntityStore,TeleportHistory> getTeleportHistoryComponentType()
  public boolean isWarpsLoaded()
  protected void setup()
  protected void start()
  protected void shutdown()
  public void loadWarps()
  private void saveWarps0()
  public void saveWarps()
  public Map<String,Warp> getWarps()
  private void onModelAssetChange(LoadedAssetsEvent<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> event)
  private void onChunkPreLoadProcess(ChunkPreLoadProcessEvent event)
  public Holder<EntityStore> createWarp(Warp warp, Store<EntityStore> store)

Fields:
private static TeleportPlugin instance
public static final String WARP_MODEL_ID
private ComponentType<EntityStore,TeleportHistory> teleportHistoryComponentType
private ComponentType<EntityStore,TeleportPlugin.WarpComponent> warpComponentType
private final AtomicBoolean loaded
private final ReentrantLock saveLock
private final AtomicBoolean postSaveRedo
private final Map<String,Warp> warps
private Model warpModel
