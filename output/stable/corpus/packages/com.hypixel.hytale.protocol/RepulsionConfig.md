# RepulsionConfig

Type: class | Package: com.hypixel.hytale.protocol

public class RepulsionConfig

Protocol data structure in the Movement/Physics group.

## Fields

- float radius
- float minForce
- float maxForce

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 12
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 12

Binary layout: 12 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RepulsionConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RepulsionConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RepulsionConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RepulsionConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
