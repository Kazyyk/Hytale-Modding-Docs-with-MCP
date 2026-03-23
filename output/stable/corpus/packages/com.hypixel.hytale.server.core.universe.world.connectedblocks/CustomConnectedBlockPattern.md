# CustomConnectedBlockPattern

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks | Extends: CustomTemplateConnectedBlockPattern

public class CustomConnectedBlockPattern extends CustomTemplateConnectedBlockPattern

Custom implementation of a connected block pattern with user-defined face matching logic.

## Constants

- BuilderCodec<CustomConnectedBlockPattern> CODEC

## Key Methods

- public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockTypeKey(String shapeName, @Nonnull World world, @Nonnull Vector3i coordinate, @Nonnull CustomTemplateConnectedBlockRuleSet connectedBlockRuleset, @Nonnull BlockType blockType, int rotation, @Nonnull Vector3i placementNormal, boolean isPlacement)

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  private static boolean checkPatternRuleAgainstBlockType(CustomTemplateConnectedBlockRuleSet placedRuleset, CustomConnectedBlockTemplateAsset template, String block, ConnectedBlockPatternRule rule, String blockToTest, RotationTuple rotationToCheckUnrotated, int fillerToCheckUnrotated)
  public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockTypeKey(String shapeName, World world, Vector3i coordinate, CustomTemplateConnectedBlockRuleSet connectedBlockRuleset, BlockType blockType, int rotation, Vector3i placementNormal, boolean isPlacement)

Fields:
public static final BuilderCodec<CustomConnectedBlockPattern> CODEC
private static final Random random
private boolean transformRulesToOrientation
private PatternRotationDefinition patternRotationDefinition
private ConnectedBlockPatternRule[] rulesToMatch
private Rotation yawToApplyAddReplacedBlockType
private boolean requireFaceTagsMatchingRoll
private boolean onlyOnUpdate
private boolean onlyOnPlacement
