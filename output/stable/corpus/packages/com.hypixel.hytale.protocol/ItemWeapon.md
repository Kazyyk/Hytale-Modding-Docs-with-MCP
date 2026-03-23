# ItemWeapon

Type: class | Package: com.hypixel.hytale.protocol

public class ItemWeapon

Weapon-specific item configuration.

## Fields

- int``[] entityStatsToClear
- Map``<``Integer, Modifier[]``> statModifiers
- boolean renderDualWielded

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 10
- MAX_SIZE | 1,626,112,020

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemWeapon deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemWeapon` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemWeapon` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemWeapon` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ItemWeapon deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemWeapon clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int[] entityStatsToClear
public Map<Integer,Modifier[]> statModifiers
public boolean renderDualWielded
