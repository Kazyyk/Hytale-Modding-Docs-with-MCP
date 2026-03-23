# RotatedMountPointsArray

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints

public class RotatedMountPointsArray

## Fields

- private static final ArrayCodec<BlockMountPoint> CHILD
- public static final Codec<RotatedMountPointsArray> CODEC
- private BlockMountPoint[] raw
- private transient BlockMountPoint[][] rotated

## Methods

- public int size()
- public BlockMountPoint[] getRaw()
- @Nullable public BlockMountPoint[] getRotated(int rotationIndex)
