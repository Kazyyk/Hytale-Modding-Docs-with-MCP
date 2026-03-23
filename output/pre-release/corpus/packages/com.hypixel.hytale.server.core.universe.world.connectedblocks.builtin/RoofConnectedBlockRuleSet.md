# RoofConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin | Extends: ConnectedBlockRuleSet | Implements: StairLikeConnectedBlockRuleSet

public class RoofConnectedBlockRuleSet extends ConnectedBlockRuleSet implements StairLikeConnectedBlockRuleSet

Connected block rule set for roof blocks. Extends stair logic with hollow variant support, topper blocks, configurable width, and valley connection detection.

Also in this package: ConnectedBlockOutput, StairConnectedBlockRuleSet, StairConnection, StairLikeConnectedBlockRuleSet, StairType

Complete API:
  private static StairConnectedBlockRuleSet.StairType getConnectedBlockStairType(World world, Vector3i coordinate, StairLikeConnectedBlockRuleSet currentRuleSet, int blockId, int rotation, int width)
  private static boolean isWidthFulfilled(World world, Vector3i coordinate, Vector3i mutablePos, StairConnectedBlockRuleSet.StairConnection backConnection, Rotation currentYaw, int blockId, int rotation, int width)
  private static StairConnectedBlockRuleSet.StairConnection getValleyConnection(World world, Vector3i placementCoordinate, Vector3i checkCoordinate, StairLikeConnectedBlockRuleSet currentRuleSet, RotationTuple rotation, Vector3i mutablePos, boolean reverse, int blockId, int blockRotation, int width)
  private static boolean isTopperConnectionCompatible(RotationTuple rotation, ObjectIntPair<StairConnectedBlockRuleSet.StairType> otherStair, Rotation yawOffset)
  private static boolean canBeTopper(World world, Vector3i coordinate, StairLikeConnectedBlockRuleSet currentRuleSet, RotationTuple rotation, Vector3i mutablePos)
  private static boolean isValleyConnectionCompatible(RotationTuple rotation, ObjectIntPair<StairConnectedBlockRuleSet.StairType> otherStair, Rotation yawOffset, boolean inverted)
  public boolean onlyUpdateOnPlacement()
  public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockType(World world, Vector3i coordinate, BlockType blockType, int rotation, Vector3i placementNormal, boolean isPlacement)
  public void updateCachedBlockTypes(BlockType baseBlockType, BlockTypeAssetMap<String,BlockType> assetMap)
  public StairConnectedBlockRuleSet.StairType getStairType(int blockId)
  public String getMaterialName()
  public com.hypixel.hytale.protocol.ConnectedBlockRuleSet toPacket(BlockTypeAssetMap<String,BlockType> assetMap)

Fields:
public static final BuilderCodec<RoofConnectedBlockRuleSet> CODEC
private StairConnectedBlockRuleSet regular
private StairConnectedBlockRuleSet hollow
private ConnectedBlockOutput topper
private String materialName
private int width
