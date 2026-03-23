# AppliedForce

Type: class | Package: com.hypixel.hytale.protocol

public class AppliedForce

Defines a directional force vector with optional vertical adjustment, used by ApplyForceInteraction to push entities.

## Fields

- Vector3f direction
- boolean adjustVertical
- float force

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 18
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 18
- MAX_SIZE | 18

Binary layout: 1 null-bit byte + 18 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AppliedForce deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AppliedForce` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AppliedForce` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AppliedForce` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ApplyForceInteraction
