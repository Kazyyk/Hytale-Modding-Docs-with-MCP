# RoofConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.protocol

public class RoofConnectedBlockRuleSet

Protocol data structure in the Block/Connected Block Rules group.

## Fields

- StairConnectedBlockRuleSet regular
- StairConnectedBlockRuleSet hollow
- int topperBlockId
- int width
- String materialName

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 49,152,078

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RoofConnectedBlockRuleSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RoofConnectedBlockRuleSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RoofConnectedBlockRuleSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RoofConnectedBlockRuleSet` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- StairConnectedBlockRuleSet

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static RoofConnectedBlockRuleSet deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public RoofConnectedBlockRuleSet clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public StairConnectedBlockRuleSet regular
public StairConnectedBlockRuleSet hollow
public int topperBlockId
public int width
public String materialName
