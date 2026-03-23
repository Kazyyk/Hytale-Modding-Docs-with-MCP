# Cloud

Type: class | Package: com.hypixel.hytale.protocol

public class Cloud

Defines a cloud layer with texture, altitude-speed mapping, and altitude-color gradient.

## Fields

- String texture
- Map<``Float``, ``Float``> speeds
- Map<``Float``, `ColorAlpha`> colors

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 81,920,028

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Cloud deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Cloud` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Cloud` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Cloud` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ColorAlpha
