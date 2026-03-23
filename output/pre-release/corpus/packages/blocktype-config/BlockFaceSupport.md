# BlockFaceSupport

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BlockFaceSupport>

Defines the support a block face provides to adjacent blocks. Contains a `faceType` string (commonly `Full`) and optional `filler` position offsets. Supports rotation via static `rotate()` method.

Also in this package: BlockBreakingDropType, BlockFace, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public String getFaceType()
  public Vector3i[] getFiller()
  public boolean providesSupportFromFiller(Vector3i filler)
  public String toString()
  public static BlockFaceSupport rotate(BlockFaceSupport original, Rotation rotationYaw, Rotation rotationPitch, Rotation roll)
  public com.hypixel.hytale.protocol.BlockFaceSupport toPacket()

Fields:
public static final BuilderCodec<BlockFaceSupport> CODEC
public static final BlockFaceSupport ALL
public static final String FULL_SUPPORTING_FACE
protected String faceType
protected Vector3i[] filler
