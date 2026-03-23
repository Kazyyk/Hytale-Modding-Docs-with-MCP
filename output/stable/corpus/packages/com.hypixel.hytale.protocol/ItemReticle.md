# ItemReticle

Type: class | Package: com.hypixel.hytale.protocol

public class ItemReticle

Defines a crosshair/reticle configuration from component parts.

## Fields

- boolean hideBase
- String``[] parts
- float duration

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemReticle deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemReticle` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemReticle` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemReticle` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemReticleConfig
