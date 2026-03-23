# EntityUIType

Type: enum | Package: com.hypixel.hytale.protocol

public enum EntityUIType

Identifies the type of entity UI overlay.

## Constants

- EntityStat | 0
- CombatText | 1

## Methods


public int getValue()

Returns the integer wire value for this `EntityUIType` constant.


public static EntityUIType fromValue(int value)

Returns the `EntityUIType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- EntityUIComponent

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static EntityUIType fromValue(int value)

Fields:
public static final EntityUIType[] VALUES
private final int value
