# RequiredBlockFaceSupport

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.RequiredBlockFaceSupport>

Defines what support a block requires from a neighboring face. Supports matching by face type, self face type, block set, block type, fluid, tag, and self-matching. The `Match` enum (`IGNORED`, `REQUIRED`, `DISALLOWED`) controls each criterion. Supports rotation and filler position filtering.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public String getFaceType()
  public String getSelfFaceType()
  public String getBlockSetId()
  public int getBlockSetIndex()
  public String getBlockTypeId()
  public String getFluidId()
  public RequiredBlockFaceSupport.Match getMatchSelf()
  public RequiredBlockFaceSupport.Match getSupport()
  public boolean allowsSupportPropagation()
  public boolean isRotated()
  public Vector3i[] getFiller()
  public boolean isAppliedToFiller(Vector3i filler)
  public String getTagId()
  public int getTagIndex()
  public String toString()
  public static RequiredBlockFaceSupport rotate(RequiredBlockFaceSupport original, Rotation rotationYaw, Rotation rotationPitch, Rotation roll)
  public com.hypixel.hytale.protocol.RequiredBlockFaceSupport toPacket()

Fields:
public static final BuilderCodec<RequiredBlockFaceSupport> CODEC
protected String faceType
protected String selfFaceType
protected String blockSetId
protected int blockSetIndex
protected String blockTypeId
protected String fluidId
protected RequiredBlockFaceSupport.Match matchSelf
protected String tagId
protected int tagIndex
protected RequiredBlockFaceSupport.Match support
protected boolean allowSupportPropagation
protected boolean rotate
protected Vector3i[] filler
