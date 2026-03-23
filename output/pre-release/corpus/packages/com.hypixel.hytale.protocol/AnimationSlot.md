# AnimationSlot

Type: enum | Package: com.hypixel.hytale.protocol

public enum AnimationSlot

Identifies the animation layer/slot for concurrent animation playback. Each slot can play one animation independently.

## Constants

- Movement | 0 | Locomotion animations (walk, run, idle).
- Status | 1 | Status condition animations (stunned, burning).
- Action | 2 | Combat and tool use animations (swing, cast).
- Face | 3 | Facial expression animations.
- Emote | 4 | Player emote animations.

## Methods


public int getValue()

Returns the integer wire value for this `AnimationSlot` constant.


public static AnimationSlot fromValue(int value)

Returns the `AnimationSlot` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- Animation
- ActiveAnimationsUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, ApplicationEffects (and 381 more)

Complete API:
  public int getValue()
  public static AnimationSlot fromValue(int value)

Fields:
public static final AnimationSlot[] VALUES
private final int value
