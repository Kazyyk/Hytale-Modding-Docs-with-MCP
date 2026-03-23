# HorizontalSelector

Type: class | Package: com.hypixel.hytale.protocol | Extends: Selector

public class HorizontalSelector extends Selector

A targeting selector (type ID 3) that selects entities in a horizontal arc defined by direction, extents, yaw length, and distance range.

## Fields

- float extendTop
- float extendBottom
- float yawLength
- float yawStartOffset
- float pitchOffset
- float rollOffset
- float startDistance
- float endDistance
- HorizontalSelectorDirection direction
- boolean testLineOfSight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 34
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 34
- MAX_SIZE | 34

Binary layout: 34 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static HorizontalSelector deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `HorizontalSelector` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `HorizontalSelector` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `HorizontalSelector` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- HorizontalSelectorDirection
- AOECircleSelector
- AOECylinderSelector

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static HorizontalSelector deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public HorizontalSelector clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float extendTop
public float extendBottom
public float yawLength
public float yawStartOffset
public float pitchOffset
public float rollOffset
public float startDistance
public float endDistance
public HorizontalSelectorDirection direction
public boolean testLineOfSight
