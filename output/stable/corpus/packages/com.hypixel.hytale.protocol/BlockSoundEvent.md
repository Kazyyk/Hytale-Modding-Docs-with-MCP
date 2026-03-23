# BlockSoundEvent

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockSoundEvent

Identifies the type of block interaction that triggers a sound.

## Constants

- Walk | 0
- Land | 1
- MoveIn | 2
- MoveOut | 3
- Hit | 4
- Break | 5
- Build | 6
- Clone | 7
- Harvest | 8

## Methods


public int getValue()

Returns the integer wire value for this `BlockSoundEvent` constant.


public static BlockSoundEvent fromValue(int value)

Returns the `BlockSoundEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`8`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockSoundSet

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static BlockSoundEvent fromValue(int value)

Fields:
public static final BlockSoundEvent[] VALUES
private final int value
