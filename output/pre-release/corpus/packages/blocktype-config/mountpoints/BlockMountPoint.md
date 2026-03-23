# BlockMountPoint

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints | Extends: java.lang.Object

Defines a mount/seat point on a block. Contains a `Vector3f` offset relative to the block center and a yaw offset in degrees. Supports rotation and provides world-space position and rotation euler computation.

Also in this package: RotatedMountPointsArray

Complete API:
  public Vector3f getOffset()
  public float getYawOffSetDegrees()
  public BlockMountPoint rotate(Rotation yaw, Rotation pitch, Rotation roll)
  public Vector3f computeWorldSpacePosition(Vector3i blockLoc)
  public Vector3f computeRotationEuler(int rotationIndex)

Fields:
public static final BuilderCodec<BlockMountPoint> CODEC
public static final BlockMountPoint[] EMPTY_ARRAY
private Vector3f offset
private float yawOffSetDegrees
