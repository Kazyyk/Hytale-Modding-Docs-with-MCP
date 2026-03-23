# IndexedLookupTableAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class IndexedLookupTableAssetMap<K, T extends JsonAssetWithMap<K, IndexedLookupTableAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Combines auto-incrementing index assignment with a dense array for O(1) index-based asset retrieval. Similar to BlockTypeAssetMap but without group tracking or sub-key support.

## Methods


public int getIndex(K key)


public int getIndexOrDefault(K key, int def)


public int getNextIndex()


@Nullable
public T getAsset(int index)


public T getAssetOrDefault(int index, T def)

Also in this package: AssetMapWithIndexes, AssetRef, BlockTypeAssetMap, CaseInsensitiveHashStrategy, DefaultAssetMap, IndexedAssetMap, JsonAssetWithMap, LookupTableAssetMap, ProvidedIndexAssetMap

Complete API:
  public int getIndex(K key)
  public int getIndexOrDefault(K key, int def)
  public int getNextIndex()
  public T getAsset(int index)
  public T getAssetOrDefault(int index, T def)
  protected void clear()
  protected void putAll(String packKey, AssetCodec<K,T> codec, Map<K,T> loadedAssets, Map<K,Path> loadedKeyToPathMap, Map<K,Set<K>> loadedAssetChildren)
  private void putAll0(AssetCodec<K,T> codec, Map<K,T> loadedAssets)
  protected Set<K> remove(Set<K> keys)
  protected Set<K> remove(String packKey, Set<K> keys, List<Entry<String,Object>> pathsToReload)
  private void remove0(Set<K> keys)

Fields:
private final AtomicInteger nextIndex
private final StampedLock keyToIndexLock
private final Object2IntMap<K> keyToIndex
private final IntFunction<T[]> arrayProvider
private final ReentrantLock arrayLock
private T[] array
