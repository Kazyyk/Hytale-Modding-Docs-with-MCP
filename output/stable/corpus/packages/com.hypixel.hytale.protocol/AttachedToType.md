# AttachedToType

Type: enum | Package: com.hypixel.hytale.protocol

public enum AttachedToType

Specifies what an effect or visual element is attached to in the scene.

## Constants

- LocalPlayer | 0
- EntityId | 1
- None | 2

## Methods


public int getValue()

Returns the integer wire value for this `AttachedToType` constant.


public static AttachedToType fromValue(int value)

Returns the `AttachedToType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static AttachedToType fromValue(int value)

Fields:
public static final AttachedToType[] VALUES
private final int value
