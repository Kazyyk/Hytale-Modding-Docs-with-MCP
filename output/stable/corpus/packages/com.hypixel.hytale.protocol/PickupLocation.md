# PickupLocation

Type: enum | Package: com.hypixel.hytale.protocol

public enum PickupLocation

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Hotbar | 0 | Pick up into the hotbar.
- Storage | 1 | Pick up into storage/inventory.
- Backpack | 2 | Pick up into the backpack.

## Methods


public int getValue()

Returns the integer wire value for this `PickupLocation` constant.


public static PickupLocation fromValue(int value)

Returns the `PickupLocation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static PickupLocation fromValue(int value)

Fields:
public static final PickupLocation[] VALUES
private final int value
