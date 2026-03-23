# ShadingMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum ShadingMode

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Standard | 0 | Standard lighting and shading.
- Flat | 1 | Flat shading with no lighting gradients.
- Fullbright | 2 | Fully lit, ignores lighting.
- Reflective | 3 | Reflective surface shading.

## Methods


public int getValue()

Returns the integer wire value for this `ShadingMode` constant.


public static ShadingMode fromValue(int value)

Returns the `ShadingMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ShadingMode fromValue(int value)

Fields:
public static final ShadingMode[] VALUES
private final int value
