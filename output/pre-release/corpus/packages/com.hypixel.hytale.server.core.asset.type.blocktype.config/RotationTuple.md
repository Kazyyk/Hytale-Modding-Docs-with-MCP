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
