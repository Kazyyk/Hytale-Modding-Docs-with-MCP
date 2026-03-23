# RotatedMountPointsArray

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints | Extends: java.lang.Object

Lazily computed array of mount points for all rotation variants. Stores the raw `BlockMountPoint[]` and caches rotated versions on first access per rotation index. Uses `RotationTuple.VALUES.length` for the cache size.
