# EntityMatcher

Type: class | Package: com.hypixel.hytale.protocol

public class EntityMatcher

Defines an entity matching rule by type with optional inversion.

## Fields

- EntityMatcherType type
- boolean invert

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 2

Binary layout: 2 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityMatcher deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityMatcher` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityMatcher` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityMatcher` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityMatcherType
- HitEntity
