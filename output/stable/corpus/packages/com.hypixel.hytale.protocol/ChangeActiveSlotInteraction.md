# ChangeActiveSlotInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class ChangeActiveSlotInteraction extends Interaction

An interaction (type ID 24) that changes the player's active inventory slot. Extends Interaction directly.

## Fields

- int targetSlot

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 15
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 35
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 15 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ChangeActiveSlotInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ChangeActiveSlotInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ChangeActiveSlotInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ChangeActiveSlotInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ChangeActiveSlotInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChangeActiveSlotInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int targetSlot
