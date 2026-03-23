# StairConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin | Extends: ConnectedBlockRuleSet | Implements: StairLikeConnectedBlockRuleSet

public class StairConnectedBlockRuleSet extends ConnectedBlockRuleSet implements StairLikeConnectedBlockRuleSet

Connected block rule set for stair blocks. Detects corners and inverted corners based on adjacent stair orientations and material matching.

Also in this package: ConnectedBlockOutput, RoofConnectedBlockRuleSet, StairConnection, StairLikeConnectedBlockRuleSet, StairType

Complete API:
  protected static ObjectIntPair<StairConnectedBlockRuleSet.StairType> getStairData(World world, Vector3i coordinate, String requiredMaterialName)
  protected static StairConnectedBlockRuleSet.StairConnection getCornerConnection(World world, StairLikeConnectedBlockRuleSet currentRuleSet, Vector3i coordinate, Vector3i mutablePos, int rotation, Rotation currentYaw, boolean upsideDown, int width)
  protected static StairConnectedBlockRuleSet.StairConnection getInvertedCornerConnection(World world, StairLikeConnectedBlockRuleSet currentRuleSet, Vector3i coordinate, Vector3i mutablePos, Rotation currentYaw, boolean upsideDown)
  private static boolean canConnectTo(Rotation currentYaw, Rotation otherYaw, boolean upsideDown, boolean otherUpsideDown)
  private static StairConnectedBlockRuleSet.StairConnection getConnection(Rotation currentYaw, Rotation otherYaw, StairConnectedBlockRuleSet.StairType otherStairType, boolean inverted, boolean upsideDown)
  public boolean onlyUpdateOnPlacement()
  public void updateCachedBlockTypes(BlockType baseBlockType, BlockTypeAssetMap<String,BlockType> assetMap)
  public StairConnectedBlockRuleSet.StairType getStairType(int blockId)
  public String getMaterialName()
  public BlockType getStairBlockType(StairConnectedBlockRuleSet.StairType stairType)
  public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockType(World world, Vector3i coordinate, BlockType currentBlockType, int rotation, Vector3i placementNormal, boolean isPlacement)
  public com.hypixel.hytale.protocol.ConnectedBlockRuleSet toPacket(BlockTypeAssetMap<String,BlockType> assetMap)
  public com.hypixel.hytale.protocol.StairConnectedBlockRuleSet toProtocol(BlockTypeAssetMap<String,BlockType> assetMap)
  private int getBlockIdForStairType(StairConnectedBlockRuleSet.StairType stairType, BlockTypeAssetMap<String,BlockType> assetMap)

Fields:
public static final String DEFAULT_MATERIAL_NAME
public static final BuilderCodec<StairConnectedBlockRuleSet> CODEC
protected Object2IntMap<StairConnectedBlockRuleSet.StairType> stairTypeToBlockId
private ConnectedBlockOutput straight
private ConnectedBlockOutput cornerLeft
private ConnectedBlockOutput cornerRight
private ConnectedBlockOutput invertedCornerLeft
private ConnectedBlockOutput invertedCornerRight
private String materialName
private Int2ObjectMap<StairConnectedBlockRuleSet.StairType> blockIdToStairType
