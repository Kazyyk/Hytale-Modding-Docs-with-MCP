# EntityStatUpdate

Type: class | Package: com.hypixel.hytale.protocol

public class EntityStatUpdate

Individual stat operation carrying the op type, predictability flag, value, and optional modifier data.

## Fields

- EntityStatOp op
- boolean predictable
- float value
- Map<``String``, `Modifier`> modifiers
- String modifierKey
- Modifier modifier

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 13
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityStatUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityStatUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityStatUpdate` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityStatUpdate` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityStatOp
- EntityStatsUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static EntityStatUpdate deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EntityStatUpdate clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public EntityStatOp op
public boolean predictable
public float value
public Map<String,Modifier> modifiers
public String modifierKey
public Modifier modifier
