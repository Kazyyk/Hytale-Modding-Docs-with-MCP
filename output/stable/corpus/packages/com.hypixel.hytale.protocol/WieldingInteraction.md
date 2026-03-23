# WieldingInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: ChargingInteraction

public class WieldingInteraction extends ChargingInteraction

An interaction type that extends `ChargingInteraction` with charge-up mechanics (type ID 10).

## Fields

- DamageEffects blockedEffects
- boolean hasModifiers
- AngledWielding angledWielding

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 58
- VARIABLE_FIELD_COUNT | 8
- VARIABLE_BLOCK_START | 90
- MAX_SIZE | 1,677,721,600

Binary layout: 2 null-bit bytes + 58 bytes of fixed fields + 8 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static WieldingInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `WieldingInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `WieldingInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `WieldingInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AngledWielding
- ChargingInteraction
- DamageEffects
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static WieldingInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public WieldingInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public DamageEffects blockedEffects
public boolean hasModifiers
public AngledWielding angledWielding
