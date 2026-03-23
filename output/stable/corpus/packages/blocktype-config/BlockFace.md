# BlockFace

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Enumerates all 26 possible block face directions (6 cardinal + 12 edge + 8 corner). Each face has a direction vector, a `FaceConnectionType` for rotation semantics, and mappings to/from protocol `BlockNeighbor` values. Provides rotation, flipping, and lookup operations. Inner enum `FaceConnectionType` defines rotation categories: `FLIP`, `ROTATE_X`, `ROTATE_Y`, `ROTATE_Z`, `ROTATE_ALL`.

Also in this package: BlockBreakingDropType, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public BlockFace.FaceConnectionType getFaceConnectionType()
  public BlockFace[] getComponents()
  public Vector3i getDirection()
  public BlockFace[] getConnectingFaces()
  public Vector3i[] getConnectingFaceOffsets()
  private BlockFace[] getConnectingFaces0()
  private Vector3i directionTo(BlockFace connectingFace)
  public static BlockFace lookup(Vector3i direction)
  public static BlockFace rotate(BlockFace blockFace, Rotation rotationYaw, Rotation rotationPitch)
  public static BlockFace rotate(BlockFace blockFace, Rotation rotationX, Rotation rotationY, Rotation rotationZ)
  public static BlockFace flip(BlockFace blockFace)
  public BlockNeighbor toProtocolBlockNeighbor()
  public static BlockFace fromProtocolFace(com.hypixel.hytale.protocol.BlockFace face)
  public static com.hypixel.hytale.protocol.BlockFace toProtocolFace(BlockFace face)

Fields:
public static final EnumCodec<BlockFace> CODEC
public static final BlockFace[] VALUES
private static final Map<Vector3i,BlockFace> DIRECTION_MAP
private final BlockFace.FaceConnectionType faceConnectionType
private final BlockFace[] components
private final Vector3i direction
private final BlockNeighbor blockNeighbor
private BlockFace[] connectingFaces
private Vector3i[] connectingFaceOffsets
