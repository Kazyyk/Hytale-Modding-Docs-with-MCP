# ConnectedBlocksUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public class ConnectedBlocksUtil

Utility methods for evaluating connected block patterns and resolving shape variants.

## Record Components


Vector3i coordinate, int depth

## Key Methods

- public static void setConnectedBlockAndNotifyNeighbors(int blockTypeId, @Nonnull RotationTuple blockTypeRotation, @Nonnull Vector3i placementNormal, @Nonnull Vector3i blockPosition, @Nonnull WorldChunk worldChunkComponent, @Nonnull BlockChunk blockChunkComponent)
- public static void notifyNeighborsAndCollectChanges(@Nonnull World world, @Nonnull Vector3i origin, @Nonnull Map<Vector3i, ConnectedBlocksUtil.ConnectedBlockResult> desiredChanges, Vector3i placementNormal)
- public static Optional<ConnectedBlocksUtil.ConnectedBlockResult> getDesiredConnectedBlockType(@Nonnull World world, @Nonnull Vector3i coordinate, @Nonnull BlockType currentBlockType, int currentRotation, @Nonnull Vector3i placementNormal, boolean isPlacement)
- public String blockTypeKey()
- public int rotationIndex()
- public void addAdditionalBlock(@Nonnull Vector3i offset, @Nonnull String blockTypeKey, int rotationIndex)
- public boolean equals(Object obj)
- public int hashCode()
- public String toString()

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  public static void setConnectedBlockAndNotifyNeighbors(int blockTypeId, RotationTuple blockTypeRotation, Vector3i placementNormal, Vector3i blockPosition, WorldChunk worldChunkComponent, BlockChunk blockChunkComponent)
  private static void updateNeighborsWithDepth(WorldChunk worldChunkComponent, Vector3i startCoordinate, Vector3i placementNormal, int settings)
  public static void notifyNeighborsAndCollectChanges(World world, Vector3i origin, Map<Vector3i,ConnectedBlocksUtil.ConnectedBlockResult> desiredChanges, Vector3i placementNormal)
  public static Optional<ConnectedBlocksUtil.ConnectedBlockResult> getDesiredConnectedBlockType(World world, Vector3i coordinate, BlockType currentBlockType, int currentRotation, Vector3i placementNormal, boolean isPlacement)

Fields:
private static final int MAX_UPDATE_DEPTH
