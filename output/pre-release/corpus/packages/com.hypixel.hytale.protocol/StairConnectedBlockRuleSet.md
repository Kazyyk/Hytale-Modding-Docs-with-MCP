# StairConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.protocol

public class StairConnectedBlockRuleSet

Protocol data structure in the Block/Connected Block Rules group.

## Fields

- int straightBlockId
- int cornerLeftBlockId
- int cornerRightBlockId
- int invertedCornerLeftBlockId
- int invertedCornerRightBlockId
- String materialName

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 16,384,026

Binary layout: 1 null-bit byte + 21 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static StairConnectedBlockRuleSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `StairConnectedBlockRuleSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `StairConnectedBlockRuleSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `StairConnectedBlockRuleSet` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static StairConnectedBlockRuleSet deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public StairConnectedBlockRuleSet clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int straightBlockId
public int cornerLeftBlockId
public int cornerRightBlockId
public int invertedCornerLeftBlockId
public int invertedCornerRightBlockId
public String materialName
