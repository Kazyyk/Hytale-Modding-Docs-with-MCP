# BalanceAsset

Type: class | Package: com.hypixel.hytale.server.npc.config.balancing | Implements: JsonAssetWithMap

public class BalanceAsset implements JsonAssetWithMap

## Fields

- public static final BuilderCodec<BalanceAsset> ABSTRACT_CODEC
- public static final BuilderCodec<BalanceAsset> BASE_CODEC
- public static final AssetCodecMapCodec<String,BalanceAsset> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>> ASSET_STORE
- private AssetExtraInfo.Data data
- protected String id
- protected String entityEffect

## Methods

- public static AssetStore<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>> getAssetStore()
- public static DefaultAssetMap<String,BalanceAsset> getAssetMap()
- public String getId()
- public String getEntityEffect()
- @Nonnull @Override public String toString()

Known subclasses: CombatBalanceAsset

Complete API:
  public static AssetStore<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>> getAssetStore()
  public static DefaultAssetMap<String,BalanceAsset> getAssetMap()
  public String getId()
  public String getEntityEffect()
  public String toString()

Fields:
public static final BuilderCodec<BalanceAsset> ABSTRACT_CODEC
public static final BuilderCodec<BalanceAsset> BASE_CODEC
public static final AssetCodecMapCodec<String,BalanceAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>> ASSET_STORE
private AssetExtraInfo.Data data
protected String id
protected String entityEffect
