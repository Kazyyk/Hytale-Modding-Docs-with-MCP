# CameraShakeConfig

Type: class | Package: com.hypixel.hytale.protocol

public class CameraShakeConfig

Detailed camera shake parameters including duration, timing, easing curves, and noise generators for offset and rotation.

## Fields

- float duration
- float startTime
- boolean continuous
- EasingConfig easeIn
- EasingConfig easeOut
- OffsetNoise offset
- RotationNoise rotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 28
- MAX_SIZE | 565,248,084

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CameraShakeConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CameraShakeConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CameraShakeConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `CameraShakeConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EasingConfig
- CameraShake
