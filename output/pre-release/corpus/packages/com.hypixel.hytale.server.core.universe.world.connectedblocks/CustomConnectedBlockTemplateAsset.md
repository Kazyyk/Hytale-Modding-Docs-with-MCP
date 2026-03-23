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

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  public static AssetStore<String,CustomConnectedBlockTemplateAsset,DefaultAssetMap<String,CustomConnectedBlockTemplateAsset>> getAssetStore()
  public static DefaultAssetMap<String,CustomConnectedBlockTemplateAsset> getAssetMap()
  public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockType(World world, Vector3i coordinate, CustomTemplateConnectedBlockRuleSet ruleSet, BlockType blockType, int rotation, Vector3i placementNormal, boolean useDefaultShapeIfNoMatch, boolean isPlacement)
  public boolean isDontUpdateAfterInitialPlacement()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,CustomConnectedBlockTemplateAsset> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,CustomConnectedBlockTemplateAsset,DefaultAssetMap<String,CustomConnectedBlockTemplateAsset>> ASSET_STORE
private String id
private AssetExtraInfo.Data data
protected boolean connectsToOtherMaterials
private boolean dontUpdateAfterInitialPlacement
private String defaultShapeName
protected Map<String,ConnectedBlockShape> connectedBlockShapes
