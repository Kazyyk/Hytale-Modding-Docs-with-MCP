# RandomRotation

Type: enum | Package: com.hypixel.hytale.protocol

public enum RandomRotation

Enum with 5 constants used in the protocol serialization layer.

## Constants

- None | 0 | No random rotation.
- YawPitchRollStep1 | 1 | Random yaw, pitch, and roll in 1-degree steps.
- YawStep1 | 2 | Random yaw in 1-degree steps.
- YawStep1XZ | 3 | Random yaw in 1-degree steps on XZ plane.
- YawStep90 | 4 | Random yaw in 90-degree steps.

## Methods


public int getValue()

Returns the integer wire value for this `RandomRotation` constant.


public static RandomRotation fromValue(int value)

Returns the `RandomRotation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static RandomRotation fromValue(int value)

Fields:
public static final RandomRotation[] VALUES
private final int value
