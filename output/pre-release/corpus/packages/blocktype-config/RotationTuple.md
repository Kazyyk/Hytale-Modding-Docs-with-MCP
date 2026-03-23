# RotationTuple

Type: record | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Record combining `index`, `yaw`, `pitch`, and `roll` `Rotation` values into a single rotation state. Pre-computes all 64 possible combinations in a static `VALUES` array. Provides factory methods `of()`, index calculation, and rotation application to `Vector3d`.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType (and 8 more)

Complete API:
  public static RotationTuple of(Rotation yaw, Rotation pitch, Rotation roll)
  public static RotationTuple of(Rotation yaw, Rotation pitch)
  public static int index(Rotation yaw, Rotation pitch, Rotation roll)
  public static RotationTuple get(int index)
  public static RotationTuple getRotation(RotationTuple[] rotations, RotationTuple pair, Rotation rotation)
  public static RotationTuple flip(RotationTuple blockRotation, BlockFlipType flipType, Axis axis, int[][][] flipCorrections)
  public RotationTuple composeOnAxis(Axis axis, Rotation rotation)
  private static int[][] eulerToMatrix(Rotation yaw, Rotation pitch, Rotation roll)
  private static int[][] axisRotationMatrix(Axis axis, Rotation rotation)
  private static int[][] multiply3x3(int[][] a, int[][] b)
  private static RotationTuple matrixToRotationTuple(int[][] m)
  private static int cos90(Rotation r)
  private static int sin90(Rotation r)
  private static Rotation sinToRotation(int s)
  private static Rotation atan2_90(int sinVal, int cosVal)
  public RotationTuple add(RotationTuple rotation)
  public Vector3d rotatedVector(Vector3d vector)
  public void applyRotationTo(Vector3i vector)
  public void applyRotationTo(Vector3f vector)
  public void applyRotationTo(Vector3d vector)
  public void undoRotationTo(Vector3i vector)
  public void undoRotationTo(Vector3f vector)
  public void undoRotationTo(Vector3d vector)

Fields:
public static final RotationTuple[] EMPTY_ARRAY
public static final RotationTuple NONE
public static final int NONE_INDEX
public static final RotationTuple[] VALUES
