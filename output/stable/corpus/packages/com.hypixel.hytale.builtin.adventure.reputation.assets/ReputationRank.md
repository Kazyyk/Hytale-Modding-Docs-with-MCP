# ReputationRank

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation.assets | Implements: JsonAssetWithMap

public class ReputationRank implements JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,ReputationRank> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,ReputationRank,DefaultAssetMap<String,ReputationRank>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected int minValue
- protected int maxValue
- protected Attitude attitude

## Methods

- @Nonnull public static AssetStore<String,ReputationRank,DefaultAssetMap<String,ReputationRank>> getAssetStore()
- public static DefaultAssetMap<String,ReputationRank> getAssetMap()
- public String getId()
- public int getMinValue()
- public int getMaxValue()
- public Attitude getAttitude()
- public boolean containsValue(int value)
- @Nonnull @Override public String toString()

Also in this package: ReputationGroup

Complete API:
  public static AssetStore<String,ReputationRank,DefaultAssetMap<String,ReputationRank>> getAssetStore()
  public static DefaultAssetMap<String,ReputationRank> getAssetMap()
  public String getId()
  public int getMinValue()
  public int getMaxValue()
  public Attitude getAttitude()
  public boolean containsValue(int value)
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ReputationRank> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ReputationRank,DefaultAssetMap<String,ReputationRank>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected int minValue
protected int maxValue
protected Attitude attitude
