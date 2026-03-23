# OverlapBehavior

Type: enum | Package: com.hypixel.hytale.protocol

public enum OverlapBehavior

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Extend | 0 | Extend the existing value when overlapping.
- Overwrite | 1 | Overwrite the existing value.
- Ignore | 2 | Ignore the new value and keep existing.

## Methods


public int getValue()

Returns the integer wire value for this `OverlapBehavior` constant.


public static OverlapBehavior fromValue(int value)

Returns the `OverlapBehavior` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static OverlapBehavior fromValue(int value)

Fields:
public static final OverlapBehavior[] VALUES
private final int value
