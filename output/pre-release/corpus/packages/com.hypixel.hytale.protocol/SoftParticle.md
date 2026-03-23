# SoftParticle

Type: enum | Package: com.hypixel.hytale.protocol

public enum SoftParticle

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Enable | 0 | Enable soft particle rendering.
- Disable | 1 | Disable soft particle rendering.
- Require | 2 | Require soft particle support.

## Methods


public int getValue()

Returns the integer wire value for this `SoftParticle` constant.


public static SoftParticle fromValue(int value)

Returns the `SoftParticle` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static SoftParticle fromValue(int value)

Fields:
public static final SoftParticle[] VALUES
private final int value
