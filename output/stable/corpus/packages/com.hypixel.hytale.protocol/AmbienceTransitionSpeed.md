# AmbienceTransitionSpeed

Type: enum | Package: com.hypixel.hytale.protocol

public enum AmbienceTransitionSpeed

Controls the transition speed when switching between ambience effects.

## Constants

- Default | 0
- Fast | 1
- Instant | 2

## Methods


public int getValue()

Returns the integer wire value for this `AmbienceTransitionSpeed` constant.


public static AmbienceTransitionSpeed fromValue(int value)

Returns the `AmbienceTransitionSpeed` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- AmbienceFXAmbientBed

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 378 more)

Complete API:
  public int getValue()
  public static AmbienceTransitionSpeed fromValue(int value)

Fields:
public static final AmbienceTransitionSpeed[] VALUES
private final int value
