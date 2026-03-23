# CameraActionType

Type: enum | Package: com.hypixel.hytale.protocol

public enum CameraActionType

Identifies the type of camera action triggered by a CameraInteraction.

## Constants

- ForcePerspective | 0
- Orbit | 1
- Transition | 2

## Methods


public int getValue()

Returns the integer wire value for this `CameraActionType` constant.


public static CameraActionType fromValue(int value)

Returns the `CameraActionType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- CameraInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static CameraActionType fromValue(int value)

Fields:
public static final CameraActionType[] VALUES
private final int value
