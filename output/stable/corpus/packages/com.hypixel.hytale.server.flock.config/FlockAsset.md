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

Known subclasses: RangeSizeFlockAsset, WeightedSizeFlockAsset

Also in this package: RangeSizeFlockAsset, WeightedSizeFlockAsset

Complete API:
  public static AssetStore<String,FlockAsset,IndexedLookupTableAssetMap<String,FlockAsset>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,FlockAsset> getAssetMap()
  public String getId()
  public abstract int getMinFlockSize()
  public abstract int pickFlockSize()
  public int getMaxGrowSize()
  public String[] getBlockedRoles()
  public String toString()

Fields:
public static final BuilderCodec<FlockAsset> ABSTRACT_CODEC
public static final AssetCodecMapCodec<String,FlockAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,FlockAsset,IndexedLookupTableAssetMap<String,FlockAsset>> ASSET_STORE
private AssetExtraInfo.Data data
protected String id
protected int maxGrowSize
protected String[] blockedRoles
