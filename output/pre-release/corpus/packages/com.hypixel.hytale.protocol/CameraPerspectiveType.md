# CameraPerspectiveType

Type: enum | Package: com.hypixel.hytale.protocol

public enum CameraPerspectiveType

Specifies first-person or third-person camera perspective.

## Constants

- First | 0
- Third | 1

## Methods


public int getValue()

Returns the integer wire value for this `CameraPerspectiveType` constant.


public static CameraPerspectiveType fromValue(int value)

Returns the `CameraPerspectiveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- CameraInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static CameraPerspectiveType fromValue(int value)

Fields:
public static final CameraPerspectiveType[] VALUES
private final int value
