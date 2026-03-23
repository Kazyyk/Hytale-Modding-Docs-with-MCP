# CommonAssetRegistry

Type: class | Package: com.hypixel.hytale.server.core.asset.common

public class CommonAssetRegistry

Global static registry of common assets, indexed by both name and SHA-256 hash. Supports layered asset packs where a later pack can override an earlier one. Thread-safe via `ConcurrentHashMap` and `CopyOnWriteArrayList`.

## Methods

- public static int getDuplicateAssetCount()
- @Nonnull public static Map<String, List<PackAsset>> getDuplicatedAssets()
- @Nonnull public static Collection<List<PackAsset>> getAllAssets()
- public static void clearAllAssets()
- @Nonnull public static AddCommonAssetResult addCommonAsset(String pack, @Nonnull CommonAsset asset)
- @Nullable public static BooleanObjectPair<PackAsset> removeCommonAssetByName(String pack, String name)
- @Nonnull public static List<CommonAsset> getCommonAssetsStartingWith(String pack, String name)
- public static boolean hasCommonAsset(String name)
- public static boolean hasCommonAsset(AssetPack pack, String name)
- @Nullable public static CommonAsset getByName(String name)
- @Nullable public static CommonAsset getByHash(@Nonnull String hash)

## Inner Types

### PackAsset (record)


public record PackAsset(String pack, CommonAsset asset)

### AddCommonAssetResult

Holds the result of adding a common asset, including the new pack asset, any previously existing asset with the same name or hash, and the active (winning) asset.

Also in this package: AddCommonAssetResult, BlockyAnimation, BlockyAnimationCache, ChannelValidator, CommonAsset, CommonAssetModule, CommonAssetMonitorHandler, CommonAssetValidator, HytaleFileTypes, OggVorbisInfo, OggVorbisInfoCache, PackAsset, PlayerCommonAssets, ResourceCommonAsset, SoundFileValidators

Complete API:
  public static int getDuplicateAssetCount()
  public static Map<String,List<CommonAssetRegistry.PackAsset>> getDuplicatedAssets()
  public static Collection<List<CommonAssetRegistry.PackAsset>> getAllAssets()
  public static void clearAllAssets()
  public static CommonAssetRegistry.AddCommonAssetResult addCommonAsset(String pack, CommonAsset asset)
  public static BooleanObjectPair<CommonAssetRegistry.PackAsset> removeCommonAssetByName(String pack, String name)
  public static List<CommonAsset> getCommonAssetsStartingWith(String pack, String name)
  public static boolean hasCommonAsset(String name)
  public static boolean hasCommonAsset(AssetPack pack, String name)
  public static CommonAsset getByName(String name)
  public static CommonAsset getByHash(String hash)
  private static void removeCommonAssetByHash0(CommonAssetRegistry.PackAsset oldAsset)

Fields:
private static final Map<String,List<CommonAssetRegistry.PackAsset>> assetByNameMap
private static final Map<String,List<CommonAssetRegistry.PackAsset>> assetByHashMap
private static final AtomicInteger duplicateAssetCount
private static final Collection<List<CommonAssetRegistry.PackAsset>> unmodifiableAssetByNameMapValues
