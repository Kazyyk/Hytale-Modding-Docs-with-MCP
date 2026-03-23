# ConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.protocol

public class ConnectedBlockRuleSet

Defines connected block rules for automatic block shape selection (stairs, roofs).

## Fields

- ConnectedBlockRuleSetType type
- StairConnectedBlockRuleSet stair
- RoofConnectedBlockRuleSet roof

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 10
- MAX_SIZE | 65,536,114

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ConnectedBlockRuleSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ConnectedBlockRuleSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ConnectedBlockRuleSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ConnectedBlockRuleSet` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ConnectedBlockRuleSetType

Known subclasses: CustomTemplateConnectedBlockRuleSet, RoofConnectedBlockRuleSet, StairConnectedBlockRuleSet

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ConnectedBlockRuleSet deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ConnectedBlockRuleSet clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public ConnectedBlockRuleSetType type
public StairConnectedBlockRuleSet stair
public RoofConnectedBlockRuleSet roof
