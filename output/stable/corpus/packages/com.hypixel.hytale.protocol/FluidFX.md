# FluidFX

Type: class | Package: com.hypixel.hytale.protocol

public class FluidFX

Comprehensive fluid visual effects configuration including shader, fog, color filter, particles, and movement settings.

## Fields

- String id
- ShaderType shader
- FluidFog fogMode
- Color fogColor
- NearFar fogDistance
- float fogDepthStart
- float fogDepthFalloff
- Color colorFilter
- float colorSaturation
- float distortionAmplitude
- float distortionFrequency
- FluidParticle particle
- FluidFXMovementSettings movementSettings

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 61
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 69
- MAX_SIZE | 32,768,087

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FluidFX deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FluidFX` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FluidFX` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FluidFX` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FluidFog
- FluidFXMovementSettings
- FluidParticle
- Color
- Fluid

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static FluidFX deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public FluidFX clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public ShaderType shader
public FluidFog fogMode
public Color fogColor
public NearFar fogDistance
public float fogDepthStart
public float fogDepthFalloff
public Color colorFilter
public float colorSaturation
public float distortionAmplitude
public float distortionFrequency
public FluidParticle particle
public FluidFXMovementSettings movementSettings
