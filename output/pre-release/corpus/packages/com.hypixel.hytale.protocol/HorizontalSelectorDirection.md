# HorizontalSelectorDirection

Type: enum | Package: com.hypixel.hytale.protocol

public enum HorizontalSelectorDirection

Specifies the horizontal sweep direction for a HorizontalSelector.

## Constants

- ToLeft | 0
- ToRight | 1

## Methods


public int getValue()

Returns the integer wire value for this `HorizontalSelectorDirection` constant.


public static HorizontalSelectorDirection fromValue(int value)

Returns the `HorizontalSelectorDirection` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- HorizontalSelector

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static HorizontalSelectorDirection fromValue(int value)

Fields:
public static final HorizontalSelectorDirection[] VALUES
private final int value
