# AccumulationMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum AccumulationMode

Determines how multiple values are combined when accumulated. Used in stat calculations and effect stacking.

## Constants

- Set | 0
- Sum | 1
- Average | 2

## Methods


public int getValue()

Returns the integer wire value for this `AccumulationMode` constant.


public static AccumulationMode fromValue(int value)

Returns the `AccumulationMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 378 more)

Complete API:
  public int getValue()
  public static AccumulationMode fromValue(int value)

Fields:
public static final AccumulationMode[] VALUES
private final int value
