# PhysicsType

Type: enum | Package: com.hypixel.hytale.protocol

public enum PhysicsType

Enum with 1 constants used in the protocol serialization layer.

## Constants

- Standard | 0 | Standard physics simulation.

## Methods


public int getValue()

Returns the integer wire value for this `PhysicsType` constant.


public static PhysicsType fromValue(int value)

Returns the `PhysicsType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`0`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static PhysicsType fromValue(int value)

Fields:
public static final PhysicsType[] VALUES
private final int value
