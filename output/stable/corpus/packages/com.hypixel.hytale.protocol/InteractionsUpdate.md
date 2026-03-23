# InteractionsUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class InteractionsUpdate extends ComponentUpdate

A component update (type ID 12) that synchronizes an entity's active interactions and hint text.

## Fields

- Map<`InteractionType`, ``Integer``> interactions
- String interactionHint

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 36,864,019

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionsUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionsUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionsUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionsUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionType
- ComponentUpdate
- EntityUpdate
