# MovementType

Type: enum | Package: com.hypixel.hytale.protocol

public enum MovementType

Enum with 13 constants used in the protocol serialization layer.

## Constants

- None | 0 | No movement state.
- Idle | 1 | Standing still.
- Crouching | 2 | Crouching/sneaking.
- Walking | 3 | Walking at normal speed.
- Running | 4 | Running.
- Sprinting | 5 | Sprinting at maximum speed.
- Climbing | 6 | Climbing a surface.
- Swimming | 7 | Swimming in fluid.
- Flying | 8 | Flying through the air.
- Sliding | 9 | Sliding on a surface.
- Rolling | 10 | Rolling.
- Mounting | 11 | Riding a mount at normal speed.
- SprintMounting | 12 | Riding a mount at sprint speed.

## Methods


public int getValue()

Returns the integer wire value for this `MovementType` constant.


public static MovementType fromValue(int value)

Returns the `MovementType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`12`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static MovementType fromValue(int value)

Fields:
public static final MovementType[] VALUES
private final int value
