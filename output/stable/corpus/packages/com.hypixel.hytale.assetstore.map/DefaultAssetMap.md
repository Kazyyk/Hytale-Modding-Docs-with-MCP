# DefaultAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMap

public class DefaultAssetMap<K, T extends JsonAsset<K>> extends AssetMap<K, T>

Default implementation of `AssetMap` using case-insensitive hash maps. Supports asset chains (multiple packs overriding the same key), tag-based indexing, path-to-key mapping, and parent-child asset relationships. Uses `StampedLock` for concurrent read/write safety.

## Fields


public static final DefaultAssetMap.AssetRef[] EMPTY_PAIR_ARRAY


public static final String DEFAULT_PACK_KEY = "Hytale:Hytale"

## Key Methods


@Nullable
@Override
public T getAsset(K key)


@Override
public int getAssetCount()


@Nonnull
@Override
public Map<K, T> getAssetMap()


@Override
public Set<K> getKeysForTag(int tagIndex)


@Override
public Set<K> getKeysForPack(@Nonnull String name)

Known subclasses: AssetMapWithIndexes

Also in this package: AssetMapWithIndexes, AssetRef, BlockTypeAssetMap, CaseInsensitiveHashStrategy, IndexedAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, LookupTableAssetMap, ProvidedIndexAssetMap

Complete API:
  public T getAsset(K key)
  public T getAsset(String packKey, K key)
  private T getAssetForPack0(String packKey, K key)
  public Path getPath(K key)
  public String getAssetPack(K key)
  private Path getPath0(K key)
  private String getAssetPack0(K key)
  private DefaultAssetMap.AssetRef<T> getAssetRef(K key)
  public Set<K> getKeys(Path path)
  public Set<K> getChildren(K key)
  public int getAssetCount()
  public Map<K,T> getAssetMap()
  public Map<K,Path> getPathMap(String packKey)
  public Set<K> getKeysForTag(int tagIndex)
  public IntSet getTagIndexes()
  public int getTagCount()
  protected void clear()
  protected void putAll(String packKey, AssetCodec<K,T> codec, Map<K,T> loadedAssets, Map<K,Path> loadedKeyToPathMap, Map<K,Set<K>> loadedAssetChildren)
  protected void putAssetTags(AssetCodec<K,T> codec, Map<K,T> loadedAssets)
  protected void putAssetTag(K key, int tag)
  public Set<K> getKeysForPack(String name)
  protected Set<K> remove(Set<K> keys)
  protected Set<K> remove(String packKey, Set<K> keys, List<Entry<String,Object>> pathsToReload)

Fields:
public static final DefaultAssetMap.AssetRef[] EMPTY_PAIR_ARRAY
public static final String DEFAULT_PACK_KEY
protected final StampedLock assetMapLock
protected final Map<K,T> assetMap
protected final Map<K,DefaultAssetMap.AssetRef<T>[]> assetChainMap
protected final Map<String,ObjectSet<K>> packAssetKeys
protected final Map<Path,ObjectSet<K>> pathToKeyMap
protected final Map<K,ObjectSet<K>> assetChildren
protected final Int2ObjectConcurrentHashMap<Set<K>> tagStorage
protected final Int2ObjectConcurrentHashMap<Set<K>> unmodifiableTagStorage
protected final IntSet unmodifiableTagKeys
