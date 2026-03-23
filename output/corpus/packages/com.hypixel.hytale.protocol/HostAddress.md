# HostAddress

Type: class | Package: com.hypixel.hytale.protocol

public class HostAddress

Network address with hostname string and port number.

## Fields

- String host
- short port

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 1,031

Binary layout: 2 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static HostAddress deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `HostAddress` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `HostAddress` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `HostAddress` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
