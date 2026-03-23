# ParticleRotationInfluence

Type: enum | Package: com.hypixel.hytale.protocol

public enum ParticleRotationInfluence

Enum with 5 constants used in the protocol serialization layer.

## Constants

- None | 0 | No rotation influence.
- Billboard | 1 | Billboard facing (always faces camera).
- BillboardY | 2 | Billboard on Y-axis only.
- BillboardVelocity | 3 | Billboard aligned with velocity direction.
- Velocity | 4 | Rotation follows velocity direction.

## Methods


public int getValue()

Returns the integer wire value for this `ParticleRotationInfluence` constant.


public static ParticleRotationInfluence fromValue(int value)

Returns the `ParticleRotationInfluence` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ParticleRotationInfluence fromValue(int value)

Fields:
public static final ParticleRotationInfluence[] VALUES
private final int value
