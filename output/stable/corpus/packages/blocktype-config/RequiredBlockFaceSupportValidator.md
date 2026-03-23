# RequiredBlockFaceSupportValidator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: LegacyValidator<Map<BlockFace, RequiredBlockFaceSupport[]>>

Validates `RequiredBlockFaceSupport` configurations. Checks for null entries, empty requirements with non-ignored support, and redundant entries that disable both support and propagation.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 7 more)

Complete API:
  public void accept(Map<BlockFace,RequiredBlockFaceSupport[]> support, ValidationResults results)

Fields:
static final RequiredBlockFaceSupportValidator INSTANCE
