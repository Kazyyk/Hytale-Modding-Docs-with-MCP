# AttitudeGroup

Type: class | Package: com.hypixel.hytale.server.npc.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, AttitudeGroup>>

public class AttitudeGroup implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, AttitudeGroup>>

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, AttitudeGroup>>`.

## Fields

- ASSET_MAP | IndexedLookupTableAssetMap<String, AttitudeGroup> | Static IndexedLookupTableAssetMap<String, AttitudeGroup> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.

## Constructors

- AttitudeGroup(String id) | Creates a new AttitudeGroup instance.
- AttitudeGroup() | Creates a new AttitudeGroup instance.

## Methods

- getAssetMap() | IndexedLookupTableAssetMap<String, AttitudeGroup> | static public method.
- getId() | String | public method.
- getAttitudeGroups() | Map<Attitude, String[]> | public method.

Also in this package: ItemAttitudeGroup, Sentiment

Complete API:
  public static IndexedLookupTableAssetMap<String,AttitudeGroup> getAssetMap()
  public String getId()
  public Map<Attitude,String[]> getAttitudeGroups()

Fields:
public static final AssetBuilderCodec<String,AttitudeGroup> CODEC
private static IndexedLookupTableAssetMap<String,AttitudeGroup> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected Map<Attitude,String[]> attitudeGroups
