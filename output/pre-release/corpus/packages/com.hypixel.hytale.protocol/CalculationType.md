# CalculationType

Type: enum | Package: com.hypixel.hytale.protocol

public enum CalculationType

Determines whether a stat modification is applied additively or multiplicatively.

## Constants

- Additive | 0
- Multiplicative | 1

## Methods


public int getValue()

Returns the integer wire value for this `CalculationType` constant.


public static CalculationType fromValue(int value)

Returns the `CalculationType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static CalculationType fromValue(int value)

Fields:
public static final CalculationType[] VALUES
private final int value
