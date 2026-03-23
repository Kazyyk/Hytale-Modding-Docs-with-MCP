# CommonAssetModule

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Extends: JavaPlugin

public class CommonAssetModule extends JavaPlugin

Plugin that manages the common asset pipeline: loading assets from asset packs (via hash index files, cache files, or file-tree walking), distributing them to connected clients, and hot-reloading changed files through the asset monitor system.

## Constants

- public static final PluginManifest MANIFEST
- public static final Set<Path> IGNORED_FILES
- public static final int MAX_FRAME

## Methods

- public static CommonAssetModule get()
- public void loadCommonAssets(@Nonnull AssetPack pack, long bootTime)
- public <T extends CommonAsset> void addCommonAsset(String pack, @Nonnull T asset)
- public <T extends CommonAsset> void addCommonAsset(String pack, @Nonnull T asset, boolean log)
- @Nullable public Asset[] getRequiredAssets()
- public void sendAssetsToPlayer(@Nonnull PacketHandler packetHandler, @Nullable Asset[] requested, boolean forceRebuild)
- public void sendAssets(@Nonnull List<CommonAsset> toSend, boolean forceRebuild)
- public void sendAsset(@Nonnull CommonAsset asset, boolean forceRebuild)
- public void sendRemoveAssets(@Nonnull List<CommonAssetRegistry.PackAsset> assets, boolean forceRebuild)

Also in this package: AddCommonAssetResult, BlockyAnimation, BlockyAnimationCache, ChannelValidator, CommonAsset, CommonAssetMonitorHandler, CommonAssetRegistry, CommonAssetValidator, HytaleFileTypes, OggVorbisInfo, OggVorbisInfoCache, PackAsset, PlayerCommonAssets, ResourceCommonAsset, SoundFileValidators

Complete API:
  public static CommonAssetModule get()
  protected void setup()
  private void removeCommonAssets(AssetPack assetPack)
  public void loadCommonAssets(AssetPack pack, long bootTime)
  public void addCommonAsset(String pack, T asset)
  public void addCommonAsset(String pack, T asset, boolean log)
  public Asset[] getRequiredAssets()
  private boolean readCommonAssetsIndexHashes(AssetPack pack)
  private void readCommonAssetsIndexCache(AssetPack pack)
  private void walkFileTree(AssetPack pack)
  private void unregisterAssetMonitor(AssetPack pack)
  private void reloadAsset(List<CompletableFuture<Void>> addedOrUpdatedAssets, String pack, Path file, String name)
  private void onSendCommonAssets(SendCommonAssetsEvent event)
  public void sendAssetsToPlayer(PacketHandler packetHandler, Asset[] requested, boolean forceRebuild)
  public void sendAssets(List<CommonAsset> toSend, boolean forceRebuild)
  public void sendAssetsToPlayer(PacketHandler packetHandler, List<CommonAsset> toSend, boolean forceRebuild)
  public void sendAsset(CommonAsset asset, boolean forceRebuild)
  public void sendRemoveAssets(List<CommonAssetRegistry.PackAsset> assets, boolean forceRebuild)

Fields:
public static final PluginManifest MANIFEST
private static CommonAssetModule instance
public static final Set<Path> IGNORED_FILES
public static final Instant TICK_TIMESTAMP_ORIGIN
public static final String ASSET_INDEX_VERSION_IDENTIFIER
public static final int ASSET_INDEX_HASHES_VERSION
public static final int ASSET_INDEX_CACHE_VERSION
public static final int MAX_FRAME
private final CachedSupplier<Asset[]> assets
