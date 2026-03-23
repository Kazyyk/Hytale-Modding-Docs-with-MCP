# FlockAsset

Type: class | Package: com.hypixel.hytale.server.flock.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>

public abstract class FlockAsset implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>`.

## Fields

- ASSET_STORE | AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>> | Static AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- maxGrowSize | int | int field.
- blockedRoles | String[] | String[] field.

## Constructors

- FlockAsset() | Creates a new FlockAsset instance.
- FlockAsset(String id) | Creates a new FlockAsset instance.

## Methods

- getAssetStore() | AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, FlockAsset> | static public method.
- getId() | String | public method.
- getMinFlockSize() | int | public method.
- pickFlockSize() | int | public method.
- getMaxGrowSize() | int | public method.
- getBlockedRoles() | String[] | public method.
- toString() | String | public method.
