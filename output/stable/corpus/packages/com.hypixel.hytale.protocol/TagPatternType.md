# TagPatternType

Type: enum | Package: com.hypixel.hytale.protocol

public enum TagPatternType

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Equals | 0 | Match a single tag by equality.
- And | 1 | Logical AND of child operands.
- Or | 2 | Logical OR of child operands.
- Not | 3 | Logical NOT of a single operand.

## Methods


public int getValue()

Returns the integer wire value for this `TagPatternType` constant.


public static TagPatternType fromValue(int value)

Returns the `TagPatternType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static TagPatternType fromValue(int value)

Fields:
public static final TagPatternType[] VALUES
private final int value
