# AOECylinderSelector

Type: class | Package: com.hypixel.hytale.protocol | Extends: Selector

public class AOECylinderSelector extends Selector

A targeting selector (type ID 1) that selects entities within a cylindrical volume defined by range, height, and offset.

## Fields

- float range
- float height
- Vector3f offset

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 21

Binary layout: 1 null-bit byte + 21 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AOECylinderSelector deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AOECylinderSelector` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AOECylinderSelector` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AOECylinderSelector` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AOECircleSelector
- HorizontalSelector

Also in this package: AOECircleSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 381 more)

Complete API:
  public static AOECylinderSelector deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AOECylinderSelector clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float range
public float height
public Vector3f offset
