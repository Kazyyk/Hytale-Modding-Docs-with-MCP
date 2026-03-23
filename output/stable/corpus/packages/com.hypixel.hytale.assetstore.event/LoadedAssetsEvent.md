# LoadedAssetsEvent

Type: class | Package: com.hypixel.hytale.assetstore.event

public class LoadedAssetsEvent

Event fired after assets are loaded.

Also in this package: AssetMonitorEvent, AssetStoreEvent, AssetStoreMonitorEvent, AssetsEvent, GenerateAssetsEvent, ParentReference, RegisterAssetStoreEvent, RemoveAssetStoreEvent, RemovedAssetsEvent

Complete API:
  public Class<T> getAssetClass()
  public M getAssetMap()
  public Map<K,T> getLoadedAssets()
  public boolean isInitial()
  public AssetUpdateQuery getQuery()
  public String toString()

Fields:
private final Class<T> tClass
private final M assetMap
private final Map<K,T> loadedAssets
private final boolean initial
private final AssetUpdateQuery query
