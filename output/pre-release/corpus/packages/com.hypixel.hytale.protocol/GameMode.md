# GameMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum GameMode

Identifies the player's game mode.

## Constants

- Adventure | 0 | Standard gameplay with survival mechanics and progression.
- Creative | 1 | Unrestricted building mode with full block/item access.

## Methods


public int getValue()

Returns the integer wire value for this `GameMode` constant.


public static GameMode fromValue(int value)

Returns the `GameMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ConditionInteraction
- InteractionConfiguration
- InteractionSettings

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static GameMode fromValue(int value)

Fields:
public static final GameMode[] VALUES
private final int value
