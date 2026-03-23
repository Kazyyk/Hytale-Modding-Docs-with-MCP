# PlaceBlockInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class PlaceBlockInteraction extends SimpleInteraction

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 8).

## Fields

- int blockId
- boolean removeItemInHand
- boolean allowDragPlacement

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 25
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 45
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 25 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static PlaceBlockInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `PlaceBlockInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `PlaceBlockInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `PlaceBlockInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
- SimpleInteraction
