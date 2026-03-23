# BlockRotationUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk

public class BlockRotationUtil

Utility class for computing rotated and flipped block orientations. Used by builder tools and world editing operations to transform block rotation tuples around axes and to transform filler block offsets accordingly.

## Static Methods


@Nullable
public static RotationTuple getFlipped(@Nonnull RotationTuple blockRotation, @Nullable BlockFlipType flipType, @Nonnull Axis axis, @Nonnull VariantRotation variantRotation)

Computes the flipped rotation of a block around the given axis. Applies the flip type's yaw transformation and then rotates by 180 degrees. Returns `null` if the resulting rotation is not valid for the variant.


@Nullable
public static RotationTuple getRotated(@Nonnull RotationTuple blockRotation, @Nonnull Axis axis, Rotation rotation, @Nonnull VariantRotation variantRotation)

Computes the rotated orientation of a block around the given axis by the specified rotation amount. Returns `null` if the result is not valid for the variant.


public static int getFlippedFiller(int filler, @Nonnull Axis axis)

Computes the flipped filler offset (180-degree rotation around the axis).


public static int getRotatedFiller(int filler, @Nonnull Axis axis, Rotation rotation)

Computes the rotated filler offset around the given axis.
