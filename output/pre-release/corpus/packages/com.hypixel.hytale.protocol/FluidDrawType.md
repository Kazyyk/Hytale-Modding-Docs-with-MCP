# FluidDrawType

Type: enum | Package: com.hypixel.hytale.protocol

public enum FluidDrawType

Determines how a fluid is visually rendered.

## Constants

- None | 0
- Liquid | 1

## Methods


public int getValue()

Returns the integer wire value for this `FluidDrawType` constant.


public static FluidDrawType fromValue(int value)

Returns the `FluidDrawType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- Fluid

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static FluidDrawType fromValue(int value)

Fields:
public static final FluidDrawType[] VALUES
private final int value
