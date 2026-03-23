# SoftBlock

Type: class | Package: com.hypixel.hytale.protocol

public class SoftBlock

Protocol data structure in the Block/Connected Block Rules group.

## Fields

- String itemId
- String dropListId
- boolean isWeaponBreakable

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 10
- MAX_SIZE | 32,768,020

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SoftBlock deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SoftBlock` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SoftBlock` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SoftBlock` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static SoftBlock deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SoftBlock clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String itemId
public String dropListId
public boolean isWeaponBreakable
