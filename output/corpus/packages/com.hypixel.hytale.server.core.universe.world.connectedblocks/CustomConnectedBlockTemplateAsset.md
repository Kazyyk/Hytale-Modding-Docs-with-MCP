# CustomConnectedBlockTemplateAsset

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, CustomConnectedBlockTemplateAsset>>

public class CustomConnectedBlockTemplateAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, CustomConnectedBlockTemplateAsset>>

Asset defining a reusable connected block template with configurable pattern rules.

## Constants

- AssetBuilderCodec<String, CustomConnectedBlockTemplateAsset> CODEC
- ValidatorCache<String> VALIDATOR_CACHE

## Key Methods

- public static DefaultAssetMap<String, CustomConnectedBlockTemplateAsset> getAssetMap()
- public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockType(World world, Vector3i coordinate, CustomTemplateConnectedBlockRuleSet ruleSet, BlockType blockType, int rotation, Vector3i placementNormal, boolean useDefaultShapeIfNoMatch, boolean isPlacement)
- public boolean isDontUpdateAfterInitialPlacement()
- public String getId()
