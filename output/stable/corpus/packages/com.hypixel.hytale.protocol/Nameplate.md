# Nameplate

Type: class | Package: com.hypixel.hytale.protocol

public class Nameplate

Protocol data structure in the Model/Rendering group.

## Fields

- String text

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 16,384,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Nameplate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Nameplate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Nameplate` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Nameplate` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
