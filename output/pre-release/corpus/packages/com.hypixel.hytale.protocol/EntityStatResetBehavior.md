# EntityStatResetBehavior

Type: enum | Package: com.hypixel.hytale.protocol

public enum EntityStatResetBehavior

Determines what value a stat resets to.

## Constants

- InitialValue | 0
- MaxValue | 1

## Methods


public int getValue()

Returns the integer wire value for this `EntityStatResetBehavior` constant.


public static EntityStatResetBehavior fromValue(int value)

Returns the `EntityStatResetBehavior` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- EntityStatType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static EntityStatResetBehavior fromValue(int value)

Fields:
public static final EntityStatResetBehavior[] VALUES
private final int value
