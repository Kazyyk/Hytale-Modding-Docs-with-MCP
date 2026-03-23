# BenchUpgradeRequirement

Type: class | Package: com.hypixel.hytale.protocol

public class BenchUpgradeRequirement

Specifies the materials and time required to upgrade a crafting bench to the next tier.

## Fields

- MaterialQuantity`[] material
- double timeSeconds

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BenchUpgradeRequirement deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BenchUpgradeRequirement` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BenchUpgradeRequirement` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BenchUpgradeRequirement` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BenchTierLevel

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static BenchUpgradeRequirement deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BenchUpgradeRequirement clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public MaterialQuantity[] material
public double timeSeconds
