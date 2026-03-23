# ItemAttitudeGroup

Type: class | Package: com.hypixel.hytale.server.npc.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ItemAttitudeGroup>>

public class ItemAttitudeGroup implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ItemAttitudeGroup>>

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ItemAttitudeGroup>>`.

## Fields

- ASSET_MAP | IndexedLookupTableAssetMap<String, ItemAttitudeGroup> | Static IndexedLookupTableAssetMap<String, ItemAttitudeGroup> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.

## Constructors

- ItemAttitudeGroup(String id) | Creates a new ItemAttitudeGroup instance.
- ItemAttitudeGroup() | Creates a new ItemAttitudeGroup instance.

## Methods

- getAssetMap() | IndexedLookupTableAssetMap<String, ItemAttitudeGroup> | static public method.
- getId() | String | public method.
- getAttitudes() | Map<Attitude, String[]> | public method.

Also in this package: AttitudeGroup, Sentiment

Complete API:
  public static IndexedLookupTableAssetMap<String,ItemAttitudeGroup> getAssetMap()
  public String getId()
  public Map<Attitude,String[]> getAttitudes()

Fields:
public static final AssetBuilderCodec<String,ItemAttitudeGroup> CODEC
private static IndexedLookupTableAssetMap<String,ItemAttitudeGroup> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected Map<ItemAttitudeGroup.Sentiment,String[]> sentiments
protected Map<Attitude,String[]> attitudes
