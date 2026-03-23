# ItemPullbackConfiguration

Type: class | Package: com.hypixel.hytale.protocol

public class ItemPullbackConfiguration

Configuration for pullback (draw) mechanics on items like bows, including timing and animation parameters.

## Fields

- Vector3f leftOffsetOverride
- Vector3f leftRotationOverride
- Vector3f rightOffsetOverride
- Vector3f rightRotationOverride

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 49
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 49
- MAX_SIZE | 49

Binary layout: 1 null-bit byte + 49 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemPullbackConfiguration deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemPullbackConfiguration` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemPullbackConfiguration` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemPullbackConfiguration` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemPlayerAnimations
- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ItemPullbackConfiguration deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemPullbackConfiguration clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public Vector3f leftOffsetOverride
public Vector3f leftRotationOverride
public Vector3f rightOffsetOverride
public Vector3f rightRotationOverride
