# BenchTierLevel

Type: class | Package: com.hypixel.hytale.protocol

public class BenchTierLevel

Defines a single tier level of a crafting bench, including upgrade requirements and crafting bonuses.

## Fields

- BenchUpgradeRequirement benchUpgradeRequirement
- double craftingTimeReductionModifier
- int extraInputSlot
- int extraOutputSlot

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 17
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 17
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BenchTierLevel deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BenchTierLevel` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BenchTierLevel` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BenchTierLevel` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BenchUpgradeRequirement
- Bench

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static BenchTierLevel deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BenchTierLevel clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public BenchUpgradeRequirement benchUpgradeRequirement
public double craftingTimeReductionModifier
public int extraInputSlot
public int extraOutputSlot
