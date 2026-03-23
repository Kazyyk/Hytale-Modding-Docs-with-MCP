# UIComponentsUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class UIComponentsUpdate extends ComponentUpdate

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 1).

## Fields

- int``[] components

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 16,384,005

Binary layout: 0 null-bit byte + 0 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UIComponentsUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UIComponentsUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UIComponentsUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `UIComponentsUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
