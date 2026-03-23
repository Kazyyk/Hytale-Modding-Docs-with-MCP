# ModelDisplay

Type: class | Package: com.hypixel.hytale.protocol

public class ModelDisplay

Protocol data structure in the Model/Rendering group.

## Fields

- String node
- String attachTo
- Vector3f translation
- Vector3f rotation
- Vector3f scale

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 37
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 45
- MAX_SIZE | 32,768,055

Binary layout: 1 null-bit byte + 37 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelDisplay deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelDisplay` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelDisplay` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelDisplay` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Vector3f

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ModelDisplay deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ModelDisplay clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String node
public String attachTo
public Vector3f translation
public Vector3f rotation
public Vector3f scale
