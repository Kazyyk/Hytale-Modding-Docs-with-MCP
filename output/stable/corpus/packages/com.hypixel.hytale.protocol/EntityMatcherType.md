# EntityMatcherType

Type: enum | Package: com.hypixel.hytale.protocol

public enum EntityMatcherType

Identifies the category of entity matching: server-side, vulnerability-based, or player-specific.

## Constants

- Server | 0
- VulnerableMatcher | 1
- Player | 2

## Methods


public int getValue()

Returns the integer wire value for this `EntityMatcherType` constant.


public static EntityMatcherType fromValue(int value)

Returns the `EntityMatcherType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- EntityMatcher

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static EntityMatcherType fromValue(int value)

Fields:
public static final EntityMatcherType[] VALUES
private final int value
