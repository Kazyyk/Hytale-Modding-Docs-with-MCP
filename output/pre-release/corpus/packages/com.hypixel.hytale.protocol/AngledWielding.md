# AngledWielding

Type: class | Package: com.hypixel.hytale.protocol

public class AngledWielding

Defines angle-based wielding configuration for directional attack modifiers.

## Fields

- float angleRad
- float angleDistanceRad
- boolean hasModifiers

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 9

Binary layout: 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AngledWielding deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AngledWielding` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AngledWielding` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AngledWielding` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 381 more)

Complete API:
  public static AngledWielding deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AngledWielding clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float angleRad
public float angleDistanceRad
public boolean hasModifiers
