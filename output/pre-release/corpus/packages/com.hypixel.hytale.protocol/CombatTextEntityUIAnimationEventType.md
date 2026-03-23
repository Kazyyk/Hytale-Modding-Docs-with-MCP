# CombatTextEntityUIAnimationEventType

Type: enum | Package: com.hypixel.hytale.protocol

public enum CombatTextEntityUIAnimationEventType

Identifies the type of animation applied to combat text UI elements.

## Constants

- Scale | 0
- Position | 1
- Opacity | 2

## Methods


public int getValue()

Returns the integer wire value for this `CombatTextEntityUIAnimationEventType` constant.


public static CombatTextEntityUIAnimationEventType fromValue(int value)

Returns the `CombatTextEntityUIAnimationEventType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- CombatTextEntityUIComponentAnimationEvent

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static CombatTextEntityUIAnimationEventType fromValue(int value)

Fields:
public static final CombatTextEntityUIAnimationEventType[] VALUES
private final int value
