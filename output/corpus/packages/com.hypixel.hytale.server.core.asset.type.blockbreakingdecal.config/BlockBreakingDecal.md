# BlockBreakingDecal

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockbreakingdecal.config | Implements: JsonAssetWithMap, NetworkSerializable

public class BlockBreakingDecal implements JsonAssetWithMap, NetworkSerializable

## Fields

- private static final String[] DEFAULT_STAGE_TEXTURE_LIST
- public static final AssetCodec<String,BlockBreakingDecal> CODEC
- private static AssetStore<String,BlockBreakingDecal,DefaultAssetMap<String,BlockBreakingDecal>> ASSET_STORE
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private String id
- private AssetExtraInfo.Data data
- private String[] stageTextures

## Methods

- public static AssetStore<String,BlockBreakingDecal,DefaultAssetMap<String,BlockBreakingDecal>> getAssetStore()
- @Nonnull public com.hypixel.hytale.protocol.BlockBreakingDecal toPacket()
- public String getId()
- @Nonnull @Override public String toString()
