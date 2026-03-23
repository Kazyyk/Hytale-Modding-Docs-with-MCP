# ChangeStatInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ChangeStatInteraction extends SimpleInteraction

An interaction (type ID 30) that modifies an entity stat using a specified behavior and value type. Extends SimpleInteraction.

## Fields

- InteractionTarget entityTarget
- ValueType valueType
- Map<``Integer``, ``Float``> statModifiers
- ChangeStatBehaviour changeStatBehaviour

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 46
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ChangeStatInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ChangeStatInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ChangeStatInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ChangeStatInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ChangeStatBehaviour
- InteractionTarget
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ChangeStatInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChangeStatInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public InteractionTarget entityTarget
public ValueType valueType
public Map<Integer,Float> statModifiers
public ChangeStatBehaviour changeStatBehaviour
