# IndexedAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class IndexedAssetMap<K, T extends JsonAssetWithMap<K, IndexedAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Asset map that auto-assigns incrementing integer indexes to assets. Provides key-to-index lookup without a dense backing array.

## Methods


public int getIndex(K key)


public int getIndexOrDefault(K key, int def)


public int getNextIndex()

Also in this package: AssetMapWithIndexes, AssetRef, BlockTypeAssetMap, CaseInsensitiveHashStrategy, DefaultAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, LookupTableAssetMap, ProvidedIndexAssetMap

Complete API:
  public int getIndex(K key)
  public int getIndexOrDefault(K key, int def)
  public int getNextIndex()
  protected void clear()
  protected void putAll(String packKey, AssetCodec<K,T> codec, Map<K,T> loadedAssets, Map<K,Path> loadedKeyToPathMap, Map<K,Set<K>> loadedAssetChildren)
  protected Set<K> remove(Set<K> keys)
  protected Set<K> remove(String packKey, Set<K> keys, List<Entry<String,Object>> pathsToReload)
  private void remove0(Set<K> keys)

Fields:
private final AtomicInteger nextIndex
private final StampedLock keyToIndexLock
private final Object2IntMap<K> keyToIndex
