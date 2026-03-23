# NetworkChannel

Type: enum | Package: com.hypixel.hytale.protocol

public enum NetworkChannel

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Default | 0 | Primary channel for most packets.
- Chunks | 1 | Dedicated channel for chunk data transfer.
- WorldMap | 2 | Channel for world map updates.

## Methods


public int getValue()

Returns the integer wire value for this `NetworkChannel` constant.


public static NetworkChannel fromValue(int value)

Returns the `NetworkChannel` constant for the given wire value. Throws `IllegalArgumentException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static NetworkChannel fromValue(int value)

Fields:
public static final NetworkChannel[] VALUES
public static final int COUNT
private final int value
