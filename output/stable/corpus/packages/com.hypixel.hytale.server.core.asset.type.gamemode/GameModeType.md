# GameModeType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gamemode | Implements: JsonAssetWithMap

public class GameModeType implements JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,GameModeType> CODEC
- private static AssetStore<String,GameModeType,DefaultAssetMap<String,GameModeType>> ASSET_STORE
- public static final ValidatorCache<String> VALIDATOR_CACHE
- protected AssetExtraInfo.Data data
- protected String id
- private String[] permissionGroups
- private String interactionsOnEnter

## Methods

- @Nonnull public static AssetStore<String,GameModeType,DefaultAssetMap<String,GameModeType>> getAssetStore()
- public static DefaultAssetMap<String,GameModeType> getAssetMap()
- @Nonnull public static GameModeType fromGameMode(GameMode gameMode)
- @Nullable public String getInteractionsOnEnter()
- @Nonnull public String[] getPermissionGroups()
- public String getId()

Complete API:
  public static AssetStore<String,GameModeType,DefaultAssetMap<String,GameModeType>> getAssetStore()
  public static DefaultAssetMap<String,GameModeType> getAssetMap()
  public static GameModeType fromGameMode(GameMode gameMode)
  public String getInteractionsOnEnter()
  public String[] getPermissionGroups()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,GameModeType> CODEC
private static AssetStore<String,GameModeType,DefaultAssetMap<String,GameModeType>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
private String[] permissionGroups
private String interactionsOnEnter
