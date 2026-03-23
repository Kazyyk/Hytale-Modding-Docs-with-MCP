# RotationTuple

Type: record | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Record combining `index`, `yaw`, `pitch`, and `roll` `Rotation` values into a single rotation state. Pre-computes all 64 possible combinations in a static `VALUES` array. Provides factory methods `of()`, index calculation, and rotation application to `Vector3d`.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 7 more)

Complete API:
  public static RotationTuple of(Rotation yaw, Rotation pitch, Rotation roll)
  public static RotationTuple of(Rotation yaw, Rotation pitch)
  public static int index(Rotation yaw, Rotation pitch, Rotation roll)
  public static RotationTuple get(int index)
  public static RotationTuple getRotation(RotationTuple[] rotations, RotationTuple pair, Rotation rotation)
  public Vector3d rotate(Vector3d vector)

Fields:
public static final RotationTuple[] EMPTY_ARRAY
public static final RotationTuple NONE
public static final int NONE_INDEX
public static final RotationTuple[] VALUES
