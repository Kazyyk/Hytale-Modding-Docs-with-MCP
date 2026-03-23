# PortalType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.portalworld | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, PortalType>>

public class PortalType implements JsonAssetWithMap<String, DefaultAssetMap<String, PortalType>>

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, PortalType>>`.

## Fields

- ASSET_STORE | AssetStore<String, PortalType, DefaultAssetMap<String, PortalType>> | Static AssetStore<String, PortalType, DefaultAssetMap<String, PortalType>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- instanceId | String | String field.
- description | PortalDescription | PortalDescription field.
- gameplayConfig | String | String field.
- voidInvasionEnabled | boolean | boolean field.

## Methods

- getAssetStore() | AssetStore<String, PortalType, DefaultAssetMap<String, PortalType>> | static public method.
- getAssetMap() | DefaultAssetMap<String, PortalType> | static public method.
- getId() | String | public method.
- getInstanceId() | String | public method.
- getDisplayName() | Message | public method.
- getDescription() | PortalDescription | public method.
- getCursedItems() | Set<String> | public method.
- getGameplayConfigId() | String | public method.
- isVoidInvasionEnabled() | boolean | public method.
- getGameplayConfig() | GameplayConfig | public method.

Also in this package: PillTag, PortalDescription, PortalSpawnConfig

Complete API:
  public static AssetStore<String,PortalType,DefaultAssetMap<String,PortalType>> getAssetStore()
  public static DefaultAssetMap<String,PortalType> getAssetMap()
  public String getId()
  public String getInstanceId()
  public Message getDisplayName()
  public PortalDescription getDescription()
  public Set<String> getCursedItems()
  public String getGameplayConfigId()
  public boolean isVoidInvasionEnabled()
  public PortalSpawnConfig getSpawn()
  public GameplayConfig getGameplayConfig()

Fields:
public static final AssetBuilderCodec<String,PortalType> CODEC
private static AssetStore<String,PortalType,DefaultAssetMap<String,PortalType>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
private AssetExtraInfo.Data data
private String id
private String instanceId
private PortalDescription description
private String gameplayConfig
private boolean voidInvasionEnabled
private Set<String> cursedItems
private PortalSpawnConfig spawn
