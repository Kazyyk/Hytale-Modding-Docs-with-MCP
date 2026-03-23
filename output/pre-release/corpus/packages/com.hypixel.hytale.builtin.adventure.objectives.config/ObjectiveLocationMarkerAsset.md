# ObjectiveLocationMarkerAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>>

public class ObjectiveLocationMarkerAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>>

Asset definition for ObjectiveLocationMarker configuration data.

## Constants

- @Nonnull public static final ValidatorCache<String> VALIDATOR_CACHE

## Fields

- private static AssetStore<String, ObjectiveLocationMarkerAsset, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected ObjectiveTypeSetup objectiveTypeSetup
- protected ObjectiveLocationMarkerArea area
- protected String[] environmentIds
- protected int[] environmentIndexes
- protected ObjectiveLocationTriggerCondition[] triggerConditions

## Methods

- public static AssetStore<String, ObjectiveLocationMarkerAsset, DefaultAssetMap<String, ObjectiveLocationMarkerAsset>> getAssetStore()
- public static DefaultAssetMap<String, ObjectiveLocationMarkerAsset> getAssetMap()
- public String getId()
- public ObjectiveTypeSetup getObjectiveTypeSetup()
- public ObjectiveLocationMarkerArea getArea()
- public String[] getEnvironmentIds()
- public int[] getEnvironmentIndexes()
- public ObjectiveLocationTriggerCondition[] getTriggerConditions()
- @Nonnull @Override public String toString()

Also in this package: ObjectiveAsset, ObjectiveLineAsset

Complete API:
  public static AssetStore<String,ObjectiveLocationMarkerAsset,DefaultAssetMap<String,ObjectiveLocationMarkerAsset>> getAssetStore()
  public static DefaultAssetMap<String,ObjectiveLocationMarkerAsset> getAssetMap()
  public String getId()
  public ObjectiveTypeSetup getObjectiveTypeSetup()
  public ObjectiveLocationMarkerArea getArea()
  public String[] getEnvironmentIds()
  public int[] getEnvironmentIndexes()
  public ObjectiveLocationTriggerCondition[] getTriggerConditions()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ObjectiveLocationMarkerAsset> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ObjectiveLocationMarkerAsset,DefaultAssetMap<String,ObjectiveLocationMarkerAsset>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected ObjectiveTypeSetup objectiveTypeSetup
protected ObjectiveLocationMarkerArea area
protected String[] environmentIds
protected int[] environmentIndexes
protected ObjectiveLocationTriggerCondition[] triggerConditions
