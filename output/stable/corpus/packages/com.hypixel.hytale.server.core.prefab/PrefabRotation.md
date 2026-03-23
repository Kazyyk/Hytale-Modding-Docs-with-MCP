# PrefabRotation

Type: enum | Package: com.hypixel.hytale.server.core.prefab

public enum PrefabRotation

Represents one of four 90-degree rotation increments around the Y axis for prefab placement. Each constant delegates coordinate transformation to a private `RotationExecutor` implementation for int, long, and double vector types.

## Constants

- ROTATION_0 | Rotation.None | 0.0
- ROTATION_90 | Rotation.Ninety | -PI/2
- ROTATION_180 | Rotation.OneEighty | -PI
- ROTATION_270 | Rotation.TwoSeventy | -3*PI/2

## Fields

- public static final PrefabRotation[] VALUES
- public static final String PREFIX

## Methods

- @Nonnull public static PrefabRotation fromRotation(@Nonnull Rotation rotation)
- @Nonnull public static PrefabRotation valueOfExtended(@Nonnull String s)
- public PrefabRotation add(@Nonnull PrefabRotation other)
- public void rotate(@Nonnull Vector3d v)
- public void rotate(@Nonnull Vector3i v)
- public void rotate(@Nonnull Vector3l v)
- public int getX(int x, int z)
- public int getZ(int x, int z)
- public float getYaw()
- public int getRotation(int rotation)
- public int getFiller(int filler)
