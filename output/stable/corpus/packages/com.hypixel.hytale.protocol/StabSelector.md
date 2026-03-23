# StabSelector

Type: class | Package: com.hypixel.hytale.protocol | Extends: Selector

public class StabSelector extends Selector

A targeting selector that extends `Selector`. Part of the target-selection system (type ID 4).

## Fields

- float extendTop
- float extendBottom
- float extendLeft
- float extendRight
- float yawOffset
- float pitchOffset
- float rollOffset
- float startDistance
- float endDistance
- boolean testLineOfSight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 37
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 37
- MAX_SIZE | 37

Binary layout: 37 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static StabSelector deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `StabSelector` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `StabSelector` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `StabSelector` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Selector

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static StabSelector deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public StabSelector clone()
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
public float extendLeft
public float extendRight
public float yawOffset
public float pitchOffset
public float rollOffset
public float startDistance
public float endDistance
public boolean testLineOfSight
