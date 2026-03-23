# PrioritySlot

Type: enum | Package: com.hypixel.hytale.protocol

public enum PrioritySlot

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Default | 0 | Default priority slot.
- MainHand | 1 | Main hand priority slot.
- OffHand | 2 | Off-hand priority slot.

## Methods


public int getValue()

Returns the integer wire value for this `PrioritySlot` constant.


public static PrioritySlot fromValue(int value)

Returns the `PrioritySlot` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static PrioritySlot fromValue(int value)

Fields:
public static final PrioritySlot[] VALUES
private final int value
