# MovementForceRotationType

Type: enum | Package: com.hypixel.hytale.protocol

public enum MovementForceRotationType

Enum with 3 constants used in the protocol serialization layer.

## Constants

- AttachedToHead | 0 | Rotation attached to the entity's head direction.
- CameraRotation | 1 | Rotation follows the camera.
- Custom | 2 | Custom rotation defined by other fields.

## Methods


public int getValue()

Returns the integer wire value for this `MovementForceRotationType` constant.


public static MovementForceRotationType fromValue(int value)

Returns the `MovementForceRotationType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static MovementForceRotationType fromValue(int value)

Fields:
public static final MovementForceRotationType[] VALUES
private final int value
