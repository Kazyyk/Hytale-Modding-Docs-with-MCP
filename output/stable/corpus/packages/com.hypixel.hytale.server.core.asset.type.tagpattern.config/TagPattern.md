# TagPattern

Type: class | Package: com.hypixel.hytale.server.core.asset.type.tagpattern.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, TagPattern>>, NetworkSerializable<com.hypixel.hytale.protocol.TagPattern>

public abstract class TagPattern implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, TagPattern>>, NetworkSerializable<com.hypixel.hytale.protocol.TagPattern>

Class in the config subsystem.

## Fields

- ASSET_STORE | AssetStore<String, TagPattern, IndexedLookupTableAssetMap<String, TagPattern>> | Static AssetStore<String, TagPattern, IndexedLookupTableAssetMap<String, TagPattern>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- cachedPacket | SoftReference<com.hypixel.hytale.protocol.TagPattern> | SoftReference<com.hypixel.hytale.protocol.TagPattern> field.

## Methods

- getAssetStore() | AssetStore<String, TagPattern, IndexedLookupTableAssetMap<String, TagPattern>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, TagPattern> | static public method.
- getId() | String | public method.
- test(Int2ObjectMap<IntSet> var1) | boolean | public method.
- toString() | String | public method.
