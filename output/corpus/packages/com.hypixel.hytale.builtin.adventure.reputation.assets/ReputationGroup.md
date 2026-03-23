# ReputationGroup

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation.assets | Implements: JsonAssetWithMap

public class ReputationGroup implements JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,ReputationGroup> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,ReputationGroup,DefaultAssetMap<String,ReputationGroup>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected String[] npcGroups
- protected int initialReputationValue

## Methods

- @Nonnull public static AssetStore<String,ReputationGroup,DefaultAssetMap<String,ReputationGroup>> getAssetStore()
- public static DefaultAssetMap<String,ReputationGroup> getAssetMap()
- public String getId()
- public String[] getNpcGroups()
- public int getInitialReputationValue()
