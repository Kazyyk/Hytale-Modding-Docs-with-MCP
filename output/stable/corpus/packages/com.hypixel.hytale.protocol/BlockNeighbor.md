# BlockNeighbor

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockNeighbor

Identifies a neighboring block position relative to a center block. Covers all 26 positions in a 3x3x3 cube excluding center.

## Constants

- Up | 0
- Down | 1
- North | 2
- East | 3
- South | 4
- West | 5
- UpNorth | 6
- UpSouth | 7
- UpEast | 8
- UpWest | 9
- DownNorth | 10
- DownSouth | 11
- DownEast | 12
- DownWest | 13
- NorthEast | 14
- SouthEast | 15
- SouthWest | 16
- NorthWest | 17
- UpNorthEast | 18
- UpSouthEast | 19
- UpSouthWest | 20
- UpNorthWest | 21
- DownNorthEast | 22
- DownSouthEast | 23
- DownSouthWest | 24
- DownNorthWest | 25

## Methods


public int getValue()

Returns the integer wire value for this `BlockNeighbor` constant.


public static BlockNeighbor fromValue(int value)

Returns the `BlockNeighbor` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`25`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static BlockNeighbor fromValue(int value)

Fields:
public static final BlockNeighbor[] VALUES
private final int value
