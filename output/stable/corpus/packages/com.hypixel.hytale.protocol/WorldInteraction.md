# WorldInteraction

Type: class | Package: com.hypixel.hytale.protocol

public class WorldInteraction

Protocol data structure in the World/Environment group.

## Fields

- int entityId
- BlockPosition blockPosition
- BlockRotation blockRotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 20
- MAX_SIZE | 20

Binary layout: 1 null-bit byte + 20 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static WorldInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `WorldInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `WorldInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `WorldInteraction` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockPosition
- BlockRotation
