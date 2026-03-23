# AssetMapWithIndexes

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: DefaultAssetMap

public abstract class AssetMapWithIndexes<K, T extends JsonAsset<K>> extends DefaultAssetMap<K, T>

Extends DefaultAssetMap with integer-indexed tag storage. Assets can be looked up by numeric index in addition to key-based lookup. Subclasses such as BlockTypeAssetMap and IndexedAssetMap provide concrete index assignment strategies.

## Fields


public static final int NOT_FOUND = Integer.MIN_VALUE

## Methods


public IntSet getIndexesForTag(int index)


@Override
public boolean requireReplaceOnRemove()

Known subclasses: BlockTypeAssetMap, IndexedAssetMap, IndexedLookupTableAssetMap, LookupTableAssetMap, ProvidedIndexAssetMap

Also in this package: AssetRef, BlockTypeAssetMap, CaseInsensitiveHashStrategy, DefaultAssetMap, IndexedAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, LookupTableAssetMap, ProvidedIndexAssetMap

Complete API:
  protected void clear()
  public IntSet getIndexesForTag(int index)
  protected void putAssetTags(AssetCodec<K,T> codec, Map<K,T> loadedAssets)
  protected void putAssetTag(AssetCodec<K,T> codec, K key, int index, T value)
  protected void putAssetTag(K key, int index, int tag)
  public boolean requireReplaceOnRemove()

Fields:
public static final int NOT_FOUND
protected final Int2ObjectConcurrentHashMap<IntSet> indexedTagStorage
protected final Int2ObjectConcurrentHashMap<IntSet> unmodifiableIndexedTagStorage
