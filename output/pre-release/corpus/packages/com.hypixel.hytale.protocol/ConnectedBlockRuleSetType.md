# ConnectedBlockRuleSetType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ConnectedBlockRuleSetType

Identifies the type of connected block rule set.

## Constants

- Stair | 0
- Roof | 1

## Methods


public int getValue()

Returns the integer wire value for this `ConnectedBlockRuleSetType` constant.


public static ConnectedBlockRuleSetType fromValue(int value)

Returns the `ConnectedBlockRuleSetType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ConnectedBlockRuleSet

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ConnectedBlockRuleSetType fromValue(int value)

Fields:
public static final ConnectedBlockRuleSetType[] VALUES
private final int value
