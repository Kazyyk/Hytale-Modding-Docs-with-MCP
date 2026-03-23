# BlockMountPoint

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints

public class BlockMountPoint

## Fields

- public static final BuilderCodec<BlockMountPoint> CODEC
- public static final BlockMountPoint[] EMPTY_ARRAY
- private Vector3f offset
- private float yawOffSetDegrees

## Methods

- public Vector3f getOffset()
- public float getYawOffSetDegrees()
- @Nonnull public BlockMountPoint rotate(Rotation yaw, Rotation pitch, Rotation roll)
- @Nonnull public Vector3f computeWorldSpacePosition(Vector3i blockLoc)
- @Nonnull public Vector3f computeRotationEuler(int rotationIndex)

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
