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
