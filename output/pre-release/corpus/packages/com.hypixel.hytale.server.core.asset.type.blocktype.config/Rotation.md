# Rotation

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Enum | Implements: NetworkSerializable

public enum Rotation implements NetworkSerializable<com.hypixel.hytale.protocol.Rotation>

Represents a 90-degree-increment rotation used for block placement, prefab transforms, and vector math. Provides methods for rotating `Vector3i`, `Vector3f`, and `Vector3d` around each axis.

## Enum Constants

- None | 0 | Z
- Ninety | 90 | X
- OneEighty | 180 | Z
- TwoSeventy | 270 | X

## Key Methods


public com.hypixel.hytale.protocol.Rotation toPacket()

Converts to the protocol rotation enum.


public int getDegrees()

Returns the rotation in degrees.


public double getRadians()

Returns the rotation in radians.


@Nonnull
public Rotation flip()

Returns the rotation flipped by 180 degrees.


@Nonnull
public Rotation add(@Nullable Rotation rotation)

Adds another rotation to this one.


@Nonnull
public Rotation subtract(@Nullable Rotation rotation)

Subtracts another rotation from this one.


@Nonnull
public static Rotation ofDegrees(int degrees)

Returns the `Rotation` for the given degree value (must be a multiple of 90).


public Rotation toInverse()

Returns the inverse of this rotation.

## Related Types

- RotationTuple -- compound yaw/pitch/roll rotation
- BlockFlipType -- uses rotations for flip computation
- BlockType -- blocks use rotations for placement

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType (and 8 more)

Complete API:
  public com.hypixel.hytale.protocol.Rotation toPacket()
  public int getDegrees()
  public double getRadians()
  public Axis getAxisOfAlignment()
  public Vector3i getAxisDirection()
  public Rotation flip()
  public Rotation flip(Axis axis)
  public Rotation subtract(Rotation rotation)
  public Rotation add(Rotation rotation)
  public static Rotation add(Rotation a, Rotation b)
  public Vector3i rotatePitch(Vector3i in, Vector3i out)
  public Vector3f rotatePitch(Vector3f in, Vector3f out)
  public int rotateX(int filler)
  public Vector3i rotateX(Vector3i in, Vector3i out)
  public Vector3f rotateX(Vector3f in, Vector3f out)
  public Vector3d rotateX(Vector3d in, Vector3d out)
  public Vector3i rotateYaw(Vector3i in, Vector3i out)
  public Vector3f rotateYaw(Vector3f in, Vector3f out)
  public int rotateY(int filler)
  public Vector3i rotateY(Vector3i in, Vector3i out)
  public Vector3f rotateY(Vector3f in, Vector3f out)
  public Vector3d rotateY(Vector3d in, Vector3d out)
  private Vector3i rotateRoll(Vector3i in, Vector3i out)
  private Vector3f rotateRoll(Vector3f in, Vector3f out)
  public int rotateZ(int filler)
  public Vector3i rotateZ(Vector3i in, Vector3i out)
  public Vector3f rotateZ(Vector3f in, Vector3f out)
  public Vector3d rotateZ(Vector3d in, Vector3d out)
  public static Rotation ofDegrees(int degrees)
  public static Rotation closestOfDegrees(float degrees)
  public static Rotation valueOf(com.hypixel.hytale.protocol.Rotation packet)
  public static Vector3i rotate(Vector3i vector3i, Rotation rotationYaw, Rotation rotationPitch)
  public static Vector3i rotate(Vector3i vector3i, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static Vector3f rotate(Vector3f vector3f, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static Vector3d rotate(Vector3d vector3d, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static void applyRotationTo(Vector3i vector, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static void applyRotationTo(Vector3f vector, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static void applyRotationTo(Vector3d vector, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static void undoRotationTo(Vector3i vector, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static void undoRotationTo(Vector3f vector, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public static void undoRotationTo(Vector3d vector, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  public Rotation toInverse()

Fields:
public static final Rotation[] VALUES
public static final Rotation[] NORMAL
public static final Codec<Rotation> CODEC
private final int degrees
private final com.hypixel.hytale.protocol.Rotation packet
private final Axis axisOfAlignment
private final Vector3i axisDirection
