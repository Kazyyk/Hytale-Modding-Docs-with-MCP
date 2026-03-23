# LookupTableAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class LookupTableAssetMap<K, T extends JsonAssetWithMap<K, LookupTableAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Asset map using externally-provided index and max-index functions for a dense backing array. Resizes automatically as the max index changes.

## Methods


@Nullable
public T getAsset(int index)


public T getAssetOrDefault(int index, T def)


@Override
public boolean requireReplaceOnRemove()
