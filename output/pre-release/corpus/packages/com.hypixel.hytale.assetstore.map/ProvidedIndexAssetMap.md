# ProvidedIndexAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class ProvidedIndexAssetMap<K, T extends JsonAssetWithMap<K, ProvidedIndexAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Asset map where the index is computed from the key and value via an externally-provided `ToIntBiFunction`. Does not use a dense array.

## Methods


public int getIndex(K key)


public int getIndexOrDefault(K key, int def)


@Override
public boolean requireReplaceOnRemove()

Also in this package: AssetMapWithIndexes, AssetRef, BlockTypeAssetMap, CaseInsensitiveHashStrategy, DefaultAssetMap, IndexedAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, LookupTableAssetMap

Complete API:
  public int getIndex(K key)
  public int getIndexOrDefault(K key, int def)
  protected void clear()
  protected void putAll(String packKey, AssetCodec<K,T> codec, Map<K,T> loadedAssets, Map<K,Path> loadedKeyToPathMap, Map<K,Set<K>> loadedAssetChildren)
  protected Set<K> remove(Set<K> keys)
  public boolean requireReplaceOnRemove()

Fields:
private final StampedLock keyToIndexLock
private final Object2IntMap<K> keyToIndex
private final ToIntBiFunction<K,T> indexGetter
