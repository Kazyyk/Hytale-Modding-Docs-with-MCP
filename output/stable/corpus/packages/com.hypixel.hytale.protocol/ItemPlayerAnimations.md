# ItemPlayerAnimations

Type: class | Package: com.hypixel.hytale.protocol

public class ItemPlayerAnimations

Defines player animation overrides when holding a specific item, including wiggle weights, camera settings, and pullback configuration.

## Fields

- String id
- Map<``String``, `ItemAnimation`> animations
- WiggleWeights wiggleWeights
- CameraSettings camera
- ItemPullbackConfiguration pullbackConfig
- boolean useFirstPersonOverride

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 91
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 103
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 91 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemPlayerAnimations deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemPlayerAnimations` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemPlayerAnimations` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemPlayerAnimations` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CameraSettings
- ItemPullbackConfiguration
