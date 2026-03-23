# ConnectedBlockPatternRule

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public class ConnectedBlockPatternRule

Defines a single pattern matching rule for connected block faces.

## Enum Constants

- `Up`
- `Down`
- `North`
- `East`
- `South`
- `West`

## Constants

- BuilderCodec<ConnectedBlockPatternRule> CODEC

## Key Methods

- public Vector3i getRelativePosition()
- public HashSet<String> getBlockTypes()
- public Set<BlockPattern.BlockEntry> getShapeBlockTypeKeys()
- public ConnectedBlockFaceTags getFaceTags()
- public BlockTypeListAsset[] getBlockTypeListAssets()
- public ConnectedBlockPatternRule.AdjacentSide[] getPlacementNormals()
- public boolean isInclude()

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  public Vector3i getRelativePosition()
  public HashSet<String> getBlockTypes()
  public Set<BlockPattern.BlockEntry> getShapeBlockTypeKeys()
  public ConnectedBlockFaceTags getFaceTags()
  public BlockTypeListAsset[] getBlockTypeListAssets()
  public ConnectedBlockPatternRule.AdjacentSide[] getPlacementNormals()
  public boolean isInclude()

Fields:
public static final BuilderCodec<ConnectedBlockPatternRule> CODEC
private ConnectedBlockPatternRule.IncludeOrExclude includeOrExclude
private Vector3i relativePosition
private final HashSet<String> blockTypes
private BlockTypeListAsset[] blockTypeListAssets
private Set<BlockPattern.BlockEntry> shapeBlockTypeKeys
private ConnectedBlockFaceTags faceTags
private ConnectedBlockPatternRule.AdjacentSide[] placementNormals
