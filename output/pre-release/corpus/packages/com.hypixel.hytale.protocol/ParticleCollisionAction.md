# ParticleCollisionAction

Type: enum | Package: com.hypixel.hytale.protocol

public enum ParticleCollisionAction

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Expire | 0 | Particle expires on collision.
- LastFrame | 1 | Particle plays its last animation frame on collision.
- Linger | 2 | Particle lingers at the collision point.

## Methods


public int getValue()

Returns the integer wire value for this `ParticleCollisionAction` constant.


public static ParticleCollisionAction fromValue(int value)

Returns the `ParticleCollisionAction` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ParticleCollisionAction fromValue(int value)

Fields:
public static final ParticleCollisionAction[] VALUES
private final int value
