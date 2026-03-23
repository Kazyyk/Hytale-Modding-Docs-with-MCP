# EasingType

Type: enum | Package: com.hypixel.hytale.protocol

public enum EasingType

Standard easing function library with 31 functions covering linear, polynomial (quad through quint), trigonometric, exponential, circular, elastic, back, and bounce curves.

## Constants

- Linear | 0
- QuadIn | 1
- QuadOut | 2
- QuadInOut | 3
- CubicIn | 4
- CubicOut | 5
- CubicInOut | 6
- QuartIn | 7
- QuartOut | 8
- QuartInOut | 9
- QuintIn | 10
- QuintOut | 11
- QuintInOut | 12
- SineIn | 13
- SineOut | 14
- SineInOut | 15
- ExpoIn | 16
- ExpoOut | 17
- ExpoInOut | 18
- CircIn | 19
- CircOut | 20
- CircInOut | 21
- ElasticIn | 22
- ElasticOut | 23
- ElasticInOut | 24
- BackIn | 25
- BackOut | 26
- BackInOut | 27
- BounceIn | 28
- BounceOut | 29
- BounceInOut | 30

## Methods


public int getValue()

Returns the integer wire value for this `EasingType` constant.


public static EasingType fromValue(int value)

Returns the `EasingType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`30`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- EasingConfig

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static EasingType fromValue(int value)

Fields:
public static final EasingType[] VALUES
private final int value
