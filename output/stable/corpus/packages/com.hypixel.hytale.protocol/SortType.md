# SortType

Type: enum | Package: com.hypixel.hytale.protocol

public enum SortType

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Name | 0 | Sort alphabetically by name.
- Type | 1 | Sort by item type.
- Rarity | 2 | Sort by item rarity.

## Methods


public int getValue()

Returns the integer wire value for this `SortType` constant.


public static SortType fromValue(int value)

Returns the `SortType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static SortType fromValue(int value)

Fields:
public static final SortType[] VALUES
private final int value
