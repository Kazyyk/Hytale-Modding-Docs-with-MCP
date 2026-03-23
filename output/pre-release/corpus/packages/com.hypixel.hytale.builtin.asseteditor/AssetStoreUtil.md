# AssetStoreUtil

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.util

public class AssetStoreUtil

Static utility for resolving asset IDs from integer indices across different `AssetMap` implementations.

## Methods


@Deprecated
public static <K, T extends JsonAssetWithMap<K, M>, M extends AssetMap<K, T>> String getIdFromIndex(AssetStore<K, T, M> assetStore, int assetIndex)

Resolves an asset's string ID from its integer index. Supports `BlockTypeAssetMap`, `IndexedLookupTableAssetMap`, and `LookupTableAssetMap`. Throws `IllegalArgumentException` for unsupported map types.

Marked `@Deprecated` -- used by legacy packet handling paths.

Also in this package: AssetPathUtil, BsonTransformationUtil

Complete API:
  public static String getIdFromIndex(AssetStore<K,T,M> assetStore, int assetIndex)
