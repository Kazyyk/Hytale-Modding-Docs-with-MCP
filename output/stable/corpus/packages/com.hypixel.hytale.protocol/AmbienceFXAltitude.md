# AmbienceFXAltitude

Type: enum | Package: com.hypixel.hytale.protocol

public enum AmbienceFXAltitude

Specifies the vertical positioning strategy for 3D ambience sound playback.

## Constants

- Normal | 0
- Lowest | 1
- Highest | 2
- Random | 3

## Methods


public int getValue()

Returns the integer wire value for this `AmbienceFXAltitude` constant.


public static AmbienceFXAltitude fromValue(int value)

Returns the `AmbienceFXAltitude` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- AmbienceFXSound

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 378 more)

Complete API:
  public int getValue()
  public static AmbienceFXAltitude fromValue(int value)

Fields:
public static final AmbienceFXAltitude[] VALUES
private final int value
