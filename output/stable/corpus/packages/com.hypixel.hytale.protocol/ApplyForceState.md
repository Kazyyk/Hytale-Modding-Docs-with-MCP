# ApplyForceState

Type: enum | Package: com.hypixel.hytale.protocol

public enum ApplyForceState

Tracks the resolution state of an ApplyForceInteraction, indicating what terminated the force application.

## Constants

- Waiting | 0
- Ground | 1
- Collision | 2
- Timer | 3

## Methods


public int getValue()

Returns the integer wire value for this `ApplyForceState` constant.


public static ApplyForceState fromValue(int value)

Returns the `ApplyForceState` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ApplyForceInteraction
- InteractionSyncData

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static ApplyForceState fromValue(int value)

Fields:
public static final ApplyForceState[] VALUES
private final int value
