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

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ParticleSpawnerGroup deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ParticleSpawnerGroup clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String spawnerId
public Vector3f positionOffset
public Direction rotationOffset
public boolean fixedRotation
public float startDelay
public Rangef spawnRate
public Rangef waveDelay
public int totalSpawners
public int maxConcurrent
public InitialVelocity initialVelocity
public RangeVector3f emitOffset
public Rangef lifeSpan
public ParticleAttractor[] attractors
