# Rotation

Type: enum | Package: com.hypixel.hytale.protocol

public enum Rotation

Enum with 4 constants used in the protocol serialization layer.

## Constants

- None | 0 | No rotation (0 degrees).
- Ninety | 1 | 90-degree rotation.
- OneEighty | 2 | 180-degree rotation.
- TwoSeventy | 3 | 270-degree rotation.

## Methods


public int getValue()

Returns the integer wire value for this `Rotation` constant.


public static Rotation fromValue(int value)

Returns the `Rotation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static Rotation fromValue(int value)

Fields:
public static final Rotation[] VALUES
private final int value
