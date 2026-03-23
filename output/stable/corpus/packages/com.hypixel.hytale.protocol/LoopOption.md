# LoopOption

Type: enum | Package: com.hypixel.hytale.protocol

public enum LoopOption

Enum with 3 constants used in the protocol serialization layer.

## Constants

- PlayOnce | 0 | Play the animation/effect once and stop.
- Loop | 1 | Repeat the animation/effect continuously.
- LoopMirror | 2 | Repeat the animation/effect with alternating direction.

## Methods


public int getValue()

Returns the integer wire value for this `LoopOption` constant.


public static LoopOption fromValue(int value)

Returns the `LoopOption` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static LoopOption fromValue(int value)

Fields:
public static final LoopOption[] VALUES
private final int value
