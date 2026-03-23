# BlockParticleSet

Type: class | Package: com.hypixel.hytale.protocol

public class BlockParticleSet

Maps particle event types to particle system references for a block.

## Fields

- String id
- Color color
- float scale
- Vector3f positionOffset
- Direction rotationOffset
- Map<`BlockParticleEvent`, ``String``> particleSystemIds

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 32
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 40
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 32 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockParticleSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockParticleSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockParticleSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockParticleSet` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockParticleEvent
- BlockType
