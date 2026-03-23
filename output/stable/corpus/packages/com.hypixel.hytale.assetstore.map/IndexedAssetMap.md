# IndexedAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class IndexedAssetMap<K, T extends JsonAssetWithMap<K, IndexedAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Asset map that auto-assigns incrementing integer indexes to assets. Provides key-to-index lookup without a dense backing array.

## Methods


public int getIndex(K key)


public int getIndexOrDefault(K key, int def)


public int getNextIndex()
