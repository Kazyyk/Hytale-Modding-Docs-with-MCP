# ModelTrail

Type: class | Package: com.hypixel.hytale.protocol

public class ModelTrail

Protocol data structure in the Model/Rendering group.

## Fields

- String trailId
- EntityPart targetEntityPart
- String targetNodeName
- Vector3f positionOffset
- Direction rotationOffset
- boolean fixedRotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 27
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 35
- MAX_SIZE | 32,768,045

Binary layout: 1 null-bit byte + 27 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelTrail deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelTrail` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelTrail` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelTrail` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Direction
- EntityPart
- Vector3f
