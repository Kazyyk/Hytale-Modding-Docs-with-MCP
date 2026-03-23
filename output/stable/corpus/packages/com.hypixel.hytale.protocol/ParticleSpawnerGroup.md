# ParticleSpawnerGroup

Type: class | Package: com.hypixel.hytale.protocol

public class ParticleSpawnerGroup

Protocol data structure in the Particle/VFX System group.

## Fields

- String spawnerId
- Vector3f positionOffset
- Direction rotationOffset
- boolean fixedRotation
- float startDelay
- Rangef spawnRate
- Rangef waveDelay
- int totalSpawners
- int maxConcurrent
- InitialVelocity initialVelocity
- RangeVector3f emitOffset
- Rangef lifeSpan
- ParticleAttractor`[] attractors

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 113
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 121
- MAX_SIZE | 364,544,131

Binary layout: 2 null-bit bytes + 113 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ParticleSpawnerGroup deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ParticleSpawnerGroup` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ParticleSpawnerGroup` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ParticleSpawnerGroup` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Direction
- InitialVelocity
- ParticleAttractor
- RangeVector3f
- Rangef
- Vector3f
