# ItemSoundEvent

Type: enum | Package: com.hypixel.hytale.protocol

public enum ItemSoundEvent

Identifies sound events for inventory item manipulation.

## Constants

- Drag | 0
- Drop | 1

## Methods


public int getValue()

Returns the integer wire value for this `ItemSoundEvent` constant.


public static ItemSoundEvent fromValue(int value)

Returns the `ItemSoundEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ItemSoundSet

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static ItemSoundEvent fromValue(int value)

Fields:
public static final ItemSoundEvent[] VALUES
private final int value
