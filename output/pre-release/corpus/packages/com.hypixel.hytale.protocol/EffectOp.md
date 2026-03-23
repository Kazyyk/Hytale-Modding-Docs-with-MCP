# EffectOp

Type: enum | Package: com.hypixel.hytale.protocol

public enum EffectOp

Identifies whether an entity effect is being added or removed.

## Constants

- Add | 0
- Remove | 1

## Methods


public int getValue()

Returns the integer wire value for this `EffectOp` constant.


public static EffectOp fromValue(int value)

Returns the `EffectOp` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- EntityEffectUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static EffectOp fromValue(int value)

Fields:
public static final EffectOp[] VALUES
private final int value
