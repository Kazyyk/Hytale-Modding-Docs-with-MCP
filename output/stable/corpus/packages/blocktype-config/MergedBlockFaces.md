# MergedBlockFaces

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Predefined sets of `BlockFace` values for common face groupings. Values: `ALL` (all 26), `BLOCK_SIDES` (6 cardinal), `CARDINAL_DIRECTIONS` (N/E/S/W), `HORIZONTAL` (8 horizontal), `UP_CARDINAL_DIRECTIONS` (4 upper edges), `DOWN_CARDINAL_DIRECTIONS` (4 lower edges).

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, PhysicsDropType, RequiredBlockFaceSupport, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public BlockFace[] getComponents()
  public String toString()

Fields:
public static EnumCodec<MergedBlockFaces> CODEC
private final BlockFace[] components
