# RotatedMountPointsArray

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints | Extends: java.lang.Object

Lazily computed array of mount points for all rotation variants. Stores the raw `BlockMountPoint[]` and caches rotated versions on first access per rotation index. Uses `RotationTuple.VALUES.length` for the cache size.

Also in this package: BlockMountPoint

Complete API:
  public int size()
  public BlockMountPoint[] getRaw()
  public BlockMountPoint[] getRotated(int rotationIndex)

Fields:
private static final ArrayCodec<BlockMountPoint> CHILD
public static final Codec<RotatedMountPointsArray> CODEC
private BlockMountPoint[] raw
private transient BlockMountPoint[][] rotated
