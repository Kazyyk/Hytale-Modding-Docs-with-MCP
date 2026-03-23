# AmbienceFXBlockSoundSet

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFXBlockSoundSet

Associates a block sound set index with a required percentage range. Used in ambience conditions to match surrounding block types.

## Fields

- int blockSoundSetIndex
- Rangef percent

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 13
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 13

Binary layout: 1 null-bit byte + 13 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFXBlockSoundSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFXBlockSoundSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFXBlockSoundSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFXBlockSoundSet` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceFXConditions

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 381 more)

Complete API:
  public static AmbienceFXBlockSoundSet deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AmbienceFXBlockSoundSet clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int blockSoundSetIndex
public Rangef percent
