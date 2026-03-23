# SchemaFile

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class SchemaFile

Represents a JSON schema file with its path and content.

## Fields

- String content

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 67,108,866

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SchemaFile deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SchemaFile` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SchemaFile` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SchemaFile` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
