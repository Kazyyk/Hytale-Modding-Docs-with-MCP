# RespondToHitUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class RespondToHitUpdate extends ComponentUpdate

Empty marker component — zero-size (type ID 17).

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 0

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RespondToHitUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RespondToHitUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RespondToHitUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `RespondToHitUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static RespondToHitUpdate deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public RespondToHitUpdate clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
