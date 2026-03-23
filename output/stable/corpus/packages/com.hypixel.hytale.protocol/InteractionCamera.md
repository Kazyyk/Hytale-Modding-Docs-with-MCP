# InteractionCamera

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionCamera

Defines a camera keyframe within an interaction sequence, with time, position, and rotation.

## Fields

- float time
- Vector3f position
- Direction rotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 29
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 29
- MAX_SIZE | 29

Binary layout: 1 null-bit byte + 29 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionCamera deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionCamera` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionCamera` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionCamera` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Direction
- InteractionCameraSettings

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static InteractionCamera deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public InteractionCamera clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float time
public Vector3f position
public Direction rotation
