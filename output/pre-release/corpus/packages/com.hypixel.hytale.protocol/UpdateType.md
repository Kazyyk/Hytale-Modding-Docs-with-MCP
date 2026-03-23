# UpdateType

Type: enum | Package: com.hypixel.hytale.protocol

public enum UpdateType

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Init | 0 | Initial full state.
- AddOrUpdate | 1 | Add new or update existing.
- Remove | 2 | Remove the entry.

## Methods


public int getValue()

Returns the integer wire value for this `UpdateType` constant.


public static UpdateType fromValue(int value)

Returns the `UpdateType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static UpdateType fromValue(int value)

Fields:
public static final UpdateType[] VALUES
private final int value
