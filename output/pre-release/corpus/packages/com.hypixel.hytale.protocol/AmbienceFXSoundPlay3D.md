# AmbienceFXSoundPlay3D

Type: enum | Package: com.hypixel.hytale.protocol

public enum AmbienceFXSoundPlay3D

Specifies how 3D positional audio is determined for ambience sounds.

## Constants

- Random | 0
- LocationName | 1
- No | 2

## Methods


public int getValue()

Returns the integer wire value for this `AmbienceFXSoundPlay3D` constant.


public static AmbienceFXSoundPlay3D fromValue(int value)

Returns the `AmbienceFXSoundPlay3D` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- AmbienceFXSound

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 381 more)

Complete API:
  public int getValue()
  public static AmbienceFXSoundPlay3D fromValue(int value)

Fields:
public static final AmbienceFXSoundPlay3D[] VALUES
private final int value
