# RotationTuple

Type: record | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Record

public record RotationTuple(int index, Rotation yaw, Rotation pitch, Rotation roll)

A compound rotation expressed as separate yaw, pitch, and roll Rotation components. Pre-computed into a static lookup table of all 64 possible combinations (4 yaw x 4 pitch x 4 roll). Supports matrix-based composition and flip operations for editor tools.

## Record Components

- index | int | Pre-computed index into the `VALUES` lookup table
- yaw | Rotation | Yaw component (Y-axis rotation)
- pitch | Rotation | Pitch component (X-axis rotation)
- roll | Rotation | Roll component (Z-axis rotation)

## Constants

- NONE | Identity rotation (all components `None`)
- NONE_INDEX | 0
- VALUES | Pre-computed array of all 64 rotation tuples

## Key Methods


public static RotationTuple of(@Nonnull Rotation yaw, @Nonnull Rotation pitch, @Nonnull Rotation roll)

Returns the pre-computed `RotationTuple` for the given components.


public static int index(@Nonnull Rotation yaw, @Nonnull Rotation pitch, @Nonnull Rotation roll)

Computes the lookup index for a yaw/pitch/roll combination.


public static RotationTuple flip(@Nonnull RotationTuple blockRotation, @Nullable BlockFlipType flipType, @Nonnull Axis axis, int[][][] flipCorrections)

Computes the rotation after flipping along an axis using matrix math and flip corrections.


@Nonnull
public RotationTuple composeOnAxis(@Nonnull Axis axis, @Nonnull Rotation rotation)

Composes an additional rotation on a specific axis using matrix multiplication.

## Related Types

- Rotation -- individual rotation component
- BlockFlipType -- flip behavior used with this type

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
