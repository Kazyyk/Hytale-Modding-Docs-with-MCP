# Particle

Type: class | Package: com.hypixel.hytale.protocol

public class Particle

Protocol data structure in the Particle/VFX System group.

## Fields

- String texturePath
- Size frameSize
- ParticleUVOption uvOption
- ParticleScaleRatioConstraint scaleRatioConstraint
- SoftParticle softParticles
- float softParticlesFadeFactor
- boolean useSpriteBlending
- ParticleAnimationFrame initialAnimationFrame
- ParticleAnimationFrame collisionAnimationFrame
- Map<``Integer``, `ParticleAnimationFrame`> animationFrames

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 133
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 141
- MAX_SIZE | 270,336,151

Binary layout: 1 null-bit byte + 133 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Particle deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Particle` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Particle` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Particle` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ParticleAnimationFrame
- ParticleScaleRatioConstraint
- ParticleUVOption
- Size
- SoftParticle
