# ModifyInventoryInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ModifyInventoryInteraction extends SimpleInteraction

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 23).

## Fields

- GameMode requiredGameMode
- ItemWithAllMetadata itemToRemove
- int adjustHeldItemQuantity
- ItemWithAllMetadata itemToAdd
- String brokenItem
- double adjustHeldItemDurability

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 33
- VARIABLE_FIELD_COUNT | 8
- VARIABLE_BLOCK_START | 65
- MAX_SIZE | 1,677,721,600

Binary layout: 2 null-bit bytes + 33 bytes of fixed fields + 8 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModifyInventoryInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModifyInventoryInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModifyInventoryInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `ModifyInventoryInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- GameMode
- Interaction
- ItemWithAllMetadata
- SimpleInteraction
