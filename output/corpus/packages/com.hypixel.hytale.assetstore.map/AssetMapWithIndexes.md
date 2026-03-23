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
