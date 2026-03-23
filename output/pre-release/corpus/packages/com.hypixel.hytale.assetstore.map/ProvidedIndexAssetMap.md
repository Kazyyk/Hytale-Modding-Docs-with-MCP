# ProvidedIndexAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class ProvidedIndexAssetMap<K, T extends JsonAssetWithMap<K, ProvidedIndexAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Asset map where the index is computed from the key and value via an externally-provided `ToIntBiFunction`. Does not use a dense array.

## Methods


public int getIndex(K key)


public int getIndexOrDefault(K key, int def)


@Override
public boolean requireReplaceOnRemove()
