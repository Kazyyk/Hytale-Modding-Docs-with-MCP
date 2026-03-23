# InteractionTarget

Type: enum | Package: com.hypixel.hytale.protocol

public enum InteractionTarget

Identifies the target entity for an interaction effect.

## Constants

- User | 0
- Owner | 1
- Target | 2

## Methods


public int getValue()

Returns the integer wire value for this `InteractionTarget` constant.


public static InteractionTarget fromValue(int value)

Returns the `InteractionTarget` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ApplyEffectInteraction
- ClearEntityEffectInteraction
- ChangeStatInteraction
- EffectConditionInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static InteractionTarget fromValue(int value)

Fields:
public static final InteractionTarget[] VALUES
private final int value
