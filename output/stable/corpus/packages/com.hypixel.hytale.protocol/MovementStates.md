# MovementStates

Type: class | Package: com.hypixel.hytale.protocol

public class MovementStates

Protocol data structure in the Movement/Physics group.

## Fields

- boolean idle
- boolean horizontalIdle
- boolean jumping
- boolean flying
- boolean walking
- boolean running
- boolean sprinting
- boolean crouching
- boolean forcedCrouching
- boolean falling
- boolean climbing
- boolean inFluid
- boolean swimming
- boolean swimJumping
- boolean onGround
- boolean mantling
- boolean sliding
- boolean mounting
- boolean rolling
- boolean sitting
- boolean gliding
- boolean sleeping

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 22
- MAX_SIZE | 22

Binary layout: 22 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementStates deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementStates` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementStates` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `MovementStates` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
