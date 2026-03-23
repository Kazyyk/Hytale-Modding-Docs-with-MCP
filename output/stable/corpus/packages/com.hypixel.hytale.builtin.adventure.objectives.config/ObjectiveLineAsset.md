# ObjectiveLineAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLineAsset>>

public class ObjectiveLineAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLineAsset>>

Asset definition for ObjectiveLine configuration data.

## Constants

- @Nonnull public static final ValidatorCache<String> VALIDATOR_CACHE

## Fields

- private static AssetStore<String, ObjectiveLineAsset, DefaultAssetMap<String, ObjectiveLineAsset>> ASSET_STORE
- protected AssetExtraInfo.Data extraData
- protected String id
- protected String category
- protected String[] objectiveIds
- protected String objectiveTitleKey
- protected String objectiveDescriptionKey
- protected String[] nextObjectiveLineIds

## Methods

- public ObjectiveLineAsset(String id, String category, String[] objectiveIds, String objectiveTitleKey, String objectiveDescriptionKey, String[] nextObjectiveLineIds)
- protected ObjectiveLineAsset()
- public static AssetStore<String, ObjectiveLineAsset, DefaultAssetMap<String, ObjectiveLineAsset>> getAssetStore()
- public static DefaultAssetMap<String, ObjectiveLineAsset> getAssetMap()
- public String getId()
- public String getCategory()
- public String[] getObjectiveIds()
- @Nullable public String getNextObjectiveId(String currentObjectiveId)
- public String getObjectiveTitleKey()
- public String getObjectiveDescriptionKey()
- public String[] getNextObjectiveLineIds()
- @Nonnull @Override public String toString()

Also in this package: ObjectiveAsset, ObjectiveLocationMarkerAsset

Complete API:
  public static AssetStore<String,ObjectiveLineAsset,DefaultAssetMap<String,ObjectiveLineAsset>> getAssetStore()
  public static DefaultAssetMap<String,ObjectiveLineAsset> getAssetMap()
  public String getId()
  public String getCategory()
  public String[] getObjectiveIds()
  public String getNextObjectiveId(String currentObjectiveId)
  public String getObjectiveTitleKey()
  public String getObjectiveDescriptionKey()
  public String[] getNextObjectiveLineIds()
  public String toString()

Fields:
public static AssetBuilderCodec<String,ObjectiveLineAsset> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ObjectiveLineAsset,DefaultAssetMap<String,ObjectiveLineAsset>> ASSET_STORE
protected AssetExtraInfo.Data extraData
protected String id
protected String category
protected String[] objectiveIds
protected String objectiveTitleKey
protected String objectiveDescriptionKey
protected String[] nextObjectiveLineIds
