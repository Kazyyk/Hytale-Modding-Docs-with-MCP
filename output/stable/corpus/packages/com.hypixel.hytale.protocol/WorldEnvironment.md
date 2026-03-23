# WorldEnvironment

Type: class | Package: com.hypixel.hytale.protocol

public class WorldEnvironment

Protocol data structure in the World/Environment group.

## Fields

- String id
- Color waterTint
- Map<``Integer``, `FluidParticle`> fluidParticles
- int``[] tagIndexes

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 16
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 4 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static WorldEnvironment deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `WorldEnvironment` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `WorldEnvironment` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `WorldEnvironment` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- FluidParticle
