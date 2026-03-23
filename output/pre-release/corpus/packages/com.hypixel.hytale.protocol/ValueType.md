# ValueType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ValueType

Enum with 2 constants used in the protocol serialization layer.

## Constants

- Percent | 0 | Value is a percentage (0.0-1.0).
- Absolute | 1 | Value is an absolute number.

## Methods


public int getValue()

Returns the integer wire value for this `ValueType` constant.


public static ValueType fromValue(int value)

Returns the `ValueType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ValueType fromValue(int value)

Fields:
public static final ValueType[] VALUES
private final int value
