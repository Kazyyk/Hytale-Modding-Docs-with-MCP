# EasingConfig

Type: class | Package: com.hypixel.hytale.protocol

public class EasingConfig

Pairs an easing function type with a time duration for smooth transitions.

## Fields

- float time
- EasingType type

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 5

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EasingConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EasingConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EasingConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EasingConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EasingType
- CameraShakeConfig
