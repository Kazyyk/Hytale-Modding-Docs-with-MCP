# GenerateAssetsEvent

Type: class | Package: com.hypixel.hytale.assetstore.event

public class GenerateAssetsEvent

Event triggering asset generation.

Also in this package: AssetMonitorEvent, AssetStoreEvent, AssetStoreMonitorEvent, AssetsEvent, LoadedAssetsEvent, ParentReference, RegisterAssetStoreEvent, RemoveAssetStoreEvent, RemovedAssetsEvent

Complete API:
  public Class<T> getAssetClass()
  public Map<K,T> getLoadedAssets()
  public M getAssetMap()
  public void addChildAsset(K childKey, T asset, K parent)
  public final void addChildAsset(K childKey, T asset, K parents)
  public void addChildAssetWithReference(K childKey, T asset, Class<P> parentAssetClass, PK parentKey)
  public void addChildAssetWithReferences(K childKey, T asset, GenerateAssetsEvent.ParentReference<?,?> parents)
  public void processEvent(String hookName)
  public String toString()

Fields:
private final Class<T> tClass
private final M assetMap
private final Map<K,T> loadedAssets
private final Map<K,Set<K>> assetChildren
private final Map<K,T> unmodifiableLoadedAssets
private final Map<K,T> addedAssets
private final Map<K,Set<K>> addedAssetChildren
private final Map<Class<? extends JsonAssetWithMap<?,?>>,Map<?,Set<K>>> addedChildAssetsMap
private long before
