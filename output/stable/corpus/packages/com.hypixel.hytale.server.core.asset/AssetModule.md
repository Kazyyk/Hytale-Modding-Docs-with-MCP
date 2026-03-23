# AssetModule

Type: class | Package: com.hypixel.hytale.server.core.asset | Extends: JavaPlugin

public class AssetModule extends JavaPlugin

Core plugin managing asset pack discovery, registration, loading, validation, and file monitoring. Orchestrates the server's asset pipeline from boot through runtime hot-reload. Loads packs from command-line paths, the `mods/` directory, and plugin JARs.

## Methods

- public static AssetModule get()
- @Nonnull public AssetPack getBaseAssetPack()
- @Nonnull public List<AssetPack> getAssetPacks()
- @Nullable public AssetMonitor getAssetMonitor()
- @Nullable public AssetPack findAssetPackForPath(Path path)
- public boolean isWithinPackSubDir(@Nonnull Path path, @Nonnull String subDir)
- public boolean isAssetPathImmutable(@Nonnull Path path)
- public void registerPack(@Nonnull String name, @Nonnull Path path, @Nonnull PluginManifest manifest, boolean ignoreIfExists)
- public void unregisterPack(@Nonnull String name)
- @Nullable public AssetPack getAssetPack(@Nonnull String name)
- public void initPendingStores()

Also in this package: AssetNotifications, AssetPackRegisterEvent, AssetPackUnregisterEvent, AssetRegistryLoader, AssetStoreMonitorHandler, Builder, GenerateSchemaEvent, HytaleAssetStore, LoadAssetEvent

Complete API:
  public static AssetModule get()
  protected void setup()
  protected void shutdown()
  public AssetPack getBaseAssetPack()
  public List<AssetPack> getAssetPacks()
  public AssetMonitor getAssetMonitor()
  public AssetPack findAssetPackForPath(Path path)
  public boolean isWithinPackSubDir(Path path, String subDir)
  public boolean isAssetPathImmutable(Path path)
  private PluginManifest loadPackManifest(Path packPath)
  private void loadPacksFromDirectory(Path modsPath)
  private void loadAndRegisterPack(Path packPath, boolean isExternal)
  public void registerPack(String name, Path path, PluginManifest manifest, boolean ignoreIfExists)
  public void unregisterPack(String name)
  public AssetPack getAssetPack(String name)
  private void onRemoveStore(RemoveAssetStoreEvent event)
  private void onNewStore(RegisterAssetStoreEvent event)
  public void initPendingStores()
  private void initStore(AssetStore<?,?,?> assetStore)
  private static void validateWorldGen(LoadAssetEvent event)

Fields:
public static final PluginManifest MANIFEST
private static AssetModule instance
private AssetMonitor assetMonitor
private final List<AssetPack> assetPacks
private final List<ObjectBooleanPair<AssetPack>> pendingAssetPacks
private boolean hasSetup
private boolean hasLoaded
private final List<AssetStore<?,?,?>> pendingAssetStores
