# MovementEffects

Type: class | Package: com.hypixel.hytale.protocol

public class MovementEffects

Protocol data structure in the Movement/Physics group.

## Fields

- boolean disableForward
- boolean disableBackward
- boolean disableLeft
- boolean disableRight
- boolean disableSprint
- boolean disableJump
- boolean disableCrouch

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 7
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 7
- MAX_SIZE | 7

Binary layout: 7 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `MovementEffects` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
