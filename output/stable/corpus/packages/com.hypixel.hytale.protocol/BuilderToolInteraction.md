# BuilderToolInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class BuilderToolInteraction extends SimpleInteraction

An interaction (type ID 7) for builder tool usage. Extends SimpleInteraction with no additional fields.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 19
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 39
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BuilderToolInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BuilderToolInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BuilderToolInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BuilderToolInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
- ItemBuilderToolData

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static BuilderToolInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
