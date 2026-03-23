# ParticleCollisionBlockType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ParticleCollisionBlockType

Enum with 4 constants used in the protocol serialization layer.

## Constants

- None | 0 | No block collision.
- Air | 1 | Collide with air blocks.
- Solid | 2 | Collide with solid blocks.
- All | 3 | Collide with all block types.

## Methods


public int getValue()

Returns the integer wire value for this `ParticleCollisionBlockType` constant.


public static ParticleCollisionBlockType fromValue(int value)

Returns the `ParticleCollisionBlockType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ParticleCollisionBlockType fromValue(int value)

Fields:
public static final ParticleCollisionBlockType[] VALUES
private final int value
