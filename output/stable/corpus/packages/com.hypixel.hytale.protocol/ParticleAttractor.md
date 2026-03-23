# ParticleAttractor

Type: class | Package: com.hypixel.hytale.protocol

public class ParticleAttractor

Protocol data structure in the Particle/VFX System group.

## Fields

- Vector3f position
- Vector3f radialAxis
- float trailPositionMultiplier
- float radius
- float radialAcceleration
- float radialTangentAcceleration
- Vector3f linearAcceleration
- float radialImpulse
- float radialTangentImpulse
- Vector3f linearImpulse
- Vector3f dampingMultiplier

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 85
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 85
- MAX_SIZE | 85

Binary layout: 1 null-bit byte + 85 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ParticleAttractor deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ParticleAttractor` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ParticleAttractor` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ParticleAttractor` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Vector3f
