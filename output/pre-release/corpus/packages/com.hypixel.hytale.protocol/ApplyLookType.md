# ApplyLookType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ApplyLookType

Determines how an entity's look direction is applied during force-based movement.

## Constants

- LocalPlayerLookOrientation | 0
- Rotation | 1

## Methods


public int getValue()

Returns the integer wire value for this `ApplyLookType` constant.


public static ApplyLookType fromValue(int value)

Returns the `ApplyLookType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ApplyLookType fromValue(int value)

Fields:
public static final ApplyLookType[] VALUES
private final int value
