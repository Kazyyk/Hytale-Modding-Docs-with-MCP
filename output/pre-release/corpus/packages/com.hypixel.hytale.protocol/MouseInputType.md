# MouseInputType

Type: enum | Package: com.hypixel.hytale.protocol

public enum MouseInputType

Enum with 4 constants used in the protocol serialization layer.

## Constants

- LookAtTarget | 0 | Mouse input targets the looked-at object.
- LookAtTargetBlock | 1 | Mouse input targets the looked-at block.
- LookAtTargetEntity | 2 | Mouse input targets the looked-at entity.
- LookAtPlane | 3 | Mouse input targets a plane in world space.

## Methods


public int getValue()

Returns the integer wire value for this `MouseInputType` constant.


public static MouseInputType fromValue(int value)

Returns the `MouseInputType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static MouseInputType fromValue(int value)

Fields:
public static final MouseInputType[] VALUES
private final int value
