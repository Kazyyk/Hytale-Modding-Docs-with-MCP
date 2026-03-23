# ParticleSpawner

Type: class | Package: com.hypixel.hytale.protocol

public class ParticleSpawner

Protocol data structure in the Particle/VFX System group.

## Fields

- String id
- Particle particle
- EmitShape shape
- RangeVector3f emitOffset
- float cameraOffset
- boolean useEmitDirection
- float lifeSpan
- Rangef spawnRate
- boolean spawnBurst
- Rangef waveDelay
- Range totalParticles
- int maxConcurrentParticles
- InitialVelocity initialVelocity
- float velocityStretchMultiplier
- ParticleRotationInfluence particleRotationInfluence
- boolean particleRotateWithSpawner
- boolean isLowRes
- float trailSpawnerPositionMultiplier
- float trailSpawnerRotationMultiplier
- ParticleCollision particleCollision
- FXRenderMode renderMode
- float lightInfluence
- boolean linearFiltering
- Rangef particleLifeSpan
- UVMotion uvMotion
- ParticleAttractor`[] attractors
- IntersectionHighlight intersectionHighlight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 131
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 147
- MAX_SIZE | 651,264,332

Binary layout: 2 null-bit bytes + 131 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ParticleSpawner deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ParticleSpawner` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ParticleSpawner` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ParticleSpawner` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EmitShape
- FXRenderMode
- InitialVelocity
- IntersectionHighlight
- Particle
- ParticleAttractor
- ParticleCollision
- ParticleRotationInfluence
- Range
- RangeVector3f
- Rangef
- UVMotion

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ParticleSpawner deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ParticleSpawner clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public Particle particle
public EmitShape shape
public RangeVector3f emitOffset
public float cameraOffset
public boolean useEmitDirection
public float lifeSpan
public Rangef spawnRate
public boolean spawnBurst
public Rangef waveDelay
public Range totalParticles
public int maxConcurrentParticles
public InitialVelocity initialVelocity
public float velocityStretchMultiplier
public ParticleRotationInfluence particleRotationInfluence
public boolean particleRotateWithSpawner
public boolean isLowRes
public float trailSpawnerPositionMultiplier
public float trailSpawnerRotationMultiplier
public ParticleCollision particleCollision
public FXRenderMode renderMode
public float lightInfluence
public boolean linearFiltering
public Rangef particleLifeSpan
public UVMotion uvMotion
public ParticleAttractor[] attractors
public IntersectionHighlight intersectionHighlight
