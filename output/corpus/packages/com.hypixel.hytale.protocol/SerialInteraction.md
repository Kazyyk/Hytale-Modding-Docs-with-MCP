# SerialInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class SerialInteraction extends Interaction

An interaction type that extends `Interaction` directly. Part of the interaction/ability system (type ID 31).

## Fields

- int``[] serialInteractions

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 11
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 35
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 11 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SerialInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SerialInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SerialInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `SerialInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
