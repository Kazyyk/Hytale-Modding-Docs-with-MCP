# SupportMatch

Type: enum | Package: com.hypixel.hytale.protocol

public enum SupportMatch

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Ignored | 0 | Block face support is not checked.
- Required | 1 | Block face support is required.
- Disallowed | 2 | Block face support is disallowed.

## Methods


public int getValue()

Returns the integer wire value for this `SupportMatch` constant.


public static SupportMatch fromValue(int value)

Returns the `SupportMatch` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static SupportMatch fromValue(int value)

Fields:
public static final SupportMatch[] VALUES
private final int value
