# MouseButtonState

Type: enum | Package: com.hypixel.hytale.protocol

public enum MouseButtonState

Enum with 2 constants used in the protocol serialization layer.

## Constants

- Pressed | 0 | The button is pressed down.
- Released | 1 | The button has been released.

## Methods


public int getValue()

Returns the integer wire value for this `MouseButtonState` constant.


public static MouseButtonState fromValue(int value)

Returns the `MouseButtonState` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static MouseButtonState fromValue(int value)

Fields:
public static final MouseButtonState[] VALUES
private final int value
