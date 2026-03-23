# FogOptions

Type: class | Package: com.hypixel.hytale.protocol

public class FogOptions

Global fog rendering configuration with distance and height parameters.

## Fields

- boolean ignoreFogLimits
- float effectiveViewDistanceMultiplier
- float fogFarViewDistance
- float fogHeightCameraOffset
- boolean fogHeightCameraOverriden
- float fogHeightCameraFixed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 18
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 18
- MAX_SIZE | 18

Binary layout: 18 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FogOptions deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FogOptions` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FogOptions` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FogOptions` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static FogOptions deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public FogOptions clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean ignoreFogLimits
public float effectiveViewDistanceMultiplier
public float fogFarViewDistance
public float fogHeightCameraOffset
public boolean fogHeightCameraOverriden
public float fogHeightCameraFixed
