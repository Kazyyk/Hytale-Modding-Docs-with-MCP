# SmartMoveType

Type: enum | Package: com.hypixel.hytale.protocol

public enum SmartMoveType

Enum with 3 constants used in the protocol serialization layer.

## Constants

- EquipOrMergeStack | 0 | Equip the item or merge into an existing stack.
- PutInHotbarOrWindow | 1 | Place in the hotbar or open window.
- PutInHotbarOrBackpack | 2 | Place in the hotbar or backpack.

## Methods


public int getValue()

Returns the integer wire value for this `SmartMoveType` constant.


public static SmartMoveType fromValue(int value)

Returns the `SmartMoveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static SmartMoveType fromValue(int value)

Fields:
public static final SmartMoveType[] VALUES
private final int value
