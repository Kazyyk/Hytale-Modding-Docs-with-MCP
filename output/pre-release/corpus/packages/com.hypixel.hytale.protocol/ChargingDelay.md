# ChargingDelay

Type: class | Package: com.hypixel.hytale.protocol

public class ChargingDelay

Defines delay parameters for a charging interaction, mapping health ranges to delay timing.

## Fields

- float minDelay
- float maxDelay
- float maxTotalDelay
- float minHealth
- float maxHealth

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 20
- MAX_SIZE | 20

Binary layout: 20 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ChargingDelay deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ChargingDelay` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ChargingDelay` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ChargingDelay` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ChargingInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ChargingDelay deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChargingDelay clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float minDelay
public float maxDelay
public float maxTotalDelay
public float minHealth
public float maxHealth
