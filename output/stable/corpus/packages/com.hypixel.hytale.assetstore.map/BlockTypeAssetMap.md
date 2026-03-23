# BlockTypeAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class BlockTypeAssetMap<K, T extends JsonAssetWithMap<K, BlockTypeAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Specialized asset map for block types. Maintains a dense array for O(1) index-based lookup, a key-to-index mapping, sub-key grouping, and deprecated group ID tracking. Thread-safe via `StampedLock` and `ReentrantLock`.

## Methods


public int getIndex(K key)


public int getNextIndex()


@Nullable
public T getAsset(int index)


@Nonnull
public ObjectSet<K> getSubKeys(K key)


public int getGroupId(String group)


@Nonnull
public String[] getGroups()

Also in this package: AssetMapWithIndexes, AssetRef, CaseInsensitiveHashStrategy, DefaultAssetMap, IndexedAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, LookupTableAssetMap, ProvidedIndexAssetMap

Complete API:
  public int getIndex(K key)
  public int getIndexOrDefault(K key, int def)
  public int getNextIndex()
  public T getAsset(int index)
  public T getAssetOrDefault(int index, T def)
  public ObjectSet<K> getSubKeys(K key)
  public int getGroupId(String group)
  public String[] getGroups()
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
private final Map<K,ObjectSet<K>> subKeyMap
private final Function<T,String> groupGetter
private final Object2IntMap<String> groupMap
