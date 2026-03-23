# ItemAnimation

Type: class | Package: com.hypixel.hytale.protocol

public class ItemAnimation

Defines animation references for an item with separate third-person, first-person, and first-person override variants.

## Fields

- String thirdPerson
- String thirdPersonMoving
- String thirdPersonFace
- String firstPerson
- String firstPersonOverride
- boolean keepPreviousFirstPersonAnimation
- float speed
- float blendingDuration
- boolean looping
- boolean clipsGeometry

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 12
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 32
- MAX_SIZE | 81,920,057

Binary layout: 1 null-bit byte + 12 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemAnimation deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemAnimation` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemAnimation` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemAnimation` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ItemAnimation deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemAnimation clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String thirdPerson
public String thirdPersonMoving
public String thirdPersonFace
public String firstPerson
public String firstPersonOverride
public boolean keepPreviousFirstPersonAnimation
public float speed
public float blendingDuration
public boolean looping
public boolean clipsGeometry
