# BlockFlipType

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Controls how a block's yaw rotation responds to axis flipping. Two values: `ORTHOGONAL` (adjusts index by +/-1 based on axis alignment) and `SYMMETRIC` (adds 180 degrees when aligned with the flip axis).

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public Rotation flipYaw(Rotation rotation, Axis axis)
  private Rotation flipComponent(Rotation rotation, Axis axis, Axis ownAxis, Axis negateAxis, Axis alignment)
