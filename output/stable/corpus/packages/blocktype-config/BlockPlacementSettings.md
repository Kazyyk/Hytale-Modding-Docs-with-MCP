# BlockPlacementSettings

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BlockPlacementSettings>

Controls block placement behavior. Includes rotation key permission, empty-block placement, rotation mode, block preview visibility, and surface-specific block type overrides (wall/floor/ceiling). Inner enums `RotationMode` (`FACING_PLAYER`, `BLOCK_NORMAL`, `STAIR_FACING_PLAYER`, `DEFAULT`) and `BlockPreviewVisibility` (`ALWAYS_VISIBLE`, `ALWAYS_HIDDEN`, `DEFAULT`).

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public com.hypixel.hytale.protocol.BlockPlacementSettings toPacket()
  public String getWallPlacementOverrideBlockId()
  public String getFloorPlacementOverrideBlockId()
  public String getCeilingPlacementOverrideBlockId()

Fields:
public static final BuilderCodec<BlockPlacementSettings> CODEC
protected String wallPlacementOverrideBlockId
protected String floorPlacementOverrideBlockId
protected String ceilingPlacementOverrideBlockId
private boolean allowRotationKey
private boolean placeInEmptyBlocks
private BlockPlacementSettings.BlockPreviewVisibility previewVisibility
private BlockPlacementSettings.RotationMode rotationMode
protected boolean allowBreakReplace
