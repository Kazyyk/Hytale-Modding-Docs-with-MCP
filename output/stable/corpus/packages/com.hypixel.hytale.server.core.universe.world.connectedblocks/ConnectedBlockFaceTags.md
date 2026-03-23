# ConnectedBlockFaceTags

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public class ConnectedBlockFaceTags

Tag constants and utility methods for evaluating connected block face matching rules.

## Constants

- BuilderCodec<ConnectedBlockFaceTags> CODEC
- ConnectedBlockFaceTags EMPTY

## Key Methods

- public boolean contains(Vector3i direction, String blockFaceTag)
- public Set<String> getBlockFaceTags(Vector3i direction)
- public Set<Vector3i> getDirections()

Also in this package: AdjacentSide, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  public boolean contains(Vector3i direction, String blockFaceTag)
  public Map<Vector3i,HashSet<String>> getBlockFaceTags()
  public Set<String> getBlockFaceTags(Vector3i direction)
  public Set<Vector3i> getDirections()

Fields:
public static final BuilderCodec<ConnectedBlockFaceTags> CODEC
public static final ConnectedBlockFaceTags EMPTY
private final Map<Vector3i,HashSet<String>> blockFaceTags
