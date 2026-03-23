# InteractableUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class InteractableUpdate extends ComponentUpdate

A component update (type ID 14) that synchronizes an entity's interactable state and hint text.

## Fields

- String interactionHint

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 16,384,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractableUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractableUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractableUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `InteractableUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
- EntityUpdate
