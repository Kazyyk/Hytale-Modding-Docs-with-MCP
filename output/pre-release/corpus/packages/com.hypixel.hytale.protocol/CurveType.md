# CurveType

Type: enum | Package: com.hypixel.hytale.protocol

public enum CurveType

Identifies an interpolation curve type for animation or easing.

## Constants

- Linear | 0
- QuartIn | 1
- QuartOut | 2
- QuartInOut | 3

## Methods


public int getValue()

Returns the integer wire value for this `CurveType` constant.


public static CurveType fromValue(int value)

Returns the `CurveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static CurveType fromValue(int value)

Fields:
public static final CurveType[] VALUES
private final int value
