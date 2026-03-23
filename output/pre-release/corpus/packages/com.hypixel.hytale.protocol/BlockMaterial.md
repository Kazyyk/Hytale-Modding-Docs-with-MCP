# BlockMaterial

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockMaterial

Defines the physical material type of a block for collision and rendering purposes.

## Constants

- Empty | 0
- Solid | 1

## Methods


public int getValue()

Returns the integer wire value for this `BlockMaterial` constant.


public static BlockMaterial fromValue(int value)

Returns the `BlockMaterial` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static BlockMaterial fromValue(int value)

Fields:
public static final BlockMaterial[] VALUES
private final int value
