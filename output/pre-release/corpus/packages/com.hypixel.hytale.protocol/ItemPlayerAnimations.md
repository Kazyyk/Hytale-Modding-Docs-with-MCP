# ItemPlayerAnimations

Type: class | Package: com.hypixel.hytale.protocol

public class ItemPlayerAnimations

Defines player animation overrides when holding a specific item, including wiggle weights, camera settings, and pullback configuration.

## Fields

- String id
- Map<``String``, `ItemAnimation`> animations
- WiggleWeights wiggleWeights
- CameraSettings camera
- ItemPullbackConfiguration pullbackConfig
- boolean useFirstPersonOverride

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 91
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 103
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 91 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemPlayerAnimations deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemPlayerAnimations` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemPlayerAnimations` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemPlayerAnimations` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CameraSettings
- ItemPullbackConfiguration

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ItemPlayerAnimations deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemPlayerAnimations clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public Map<String,ItemAnimation> animations
public WiggleWeights wiggleWeights
public CameraSettings camera
public ItemPullbackConfiguration pullbackConfig
public boolean useFirstPersonOverride
