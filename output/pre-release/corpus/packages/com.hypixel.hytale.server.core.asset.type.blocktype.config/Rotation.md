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
