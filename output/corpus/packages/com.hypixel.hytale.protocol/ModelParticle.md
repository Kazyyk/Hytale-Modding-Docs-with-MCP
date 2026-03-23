# ModelParticle

Type: class | Package: com.hypixel.hytale.protocol

public class ModelParticle

Protocol data structure in the Model/Rendering group.

## Fields

- String systemId
- float scale
- Color color
- EntityPart targetEntityPart
- String targetNodeName
- Vector3f positionOffset
- Direction rotationOffset
- boolean detachedFromModel

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 34
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 32,768,052

Binary layout: 1 null-bit byte + 34 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelParticle deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelParticle` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelParticle` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelParticle` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- Direction
- EntityPart
- Vector3f
