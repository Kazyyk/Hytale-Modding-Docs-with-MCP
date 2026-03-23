# ItemGridInfoDisplayMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum ItemGridInfoDisplayMode

Determines how item information is displayed in inventory grids.

## Constants

- Tooltip | 0
- Adjacent | 1
- None | 2

## Methods


public int getValue()

Returns the integer wire value for this `ItemGridInfoDisplayMode` constant.


public static ItemGridInfoDisplayMode fromValue(int value)

Returns the `ItemGridInfoDisplayMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ItemCategory

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ItemGridInfoDisplayMode fromValue(int value)

Fields:
public static final ItemGridInfoDisplayMode[] VALUES
private final int value
