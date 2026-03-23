# MovementStatesUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class MovementStatesUpdate extends ComponentUpdate

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 10).

## Fields

- MovementStates movementStates

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 22
- MAX_SIZE | 22

Binary layout: 22 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementStatesUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementStatesUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementStatesUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `MovementStatesUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
- MovementStates
