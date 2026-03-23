# ClickType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ClickType

Identifies mouse button click types.

## Constants

- None | 0
- Left | 1
- Right | 2
- Middle | 3

## Methods


public int getValue()

Returns the integer wire value for this `ClickType` constant.


public static ClickType fromValue(int value)

Returns the `ClickType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- InteractionSyncData

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ClickType fromValue(int value)

Fields:
public static final ClickType[] VALUES
private final int value
