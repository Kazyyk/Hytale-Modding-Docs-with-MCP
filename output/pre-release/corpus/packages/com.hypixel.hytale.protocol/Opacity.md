# Opacity

Type: enum | Package: com.hypixel.hytale.protocol

public enum Opacity

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Solid | 0 | Fully opaque rendering.
- Semitransparent | 1 | Partially transparent rendering with blending.
- Cutout | 2 | Binary transparency (alpha test cutout).
- Transparent | 3 | Fully transparent rendering.

## Methods


public int getValue()

Returns the integer wire value for this `Opacity` constant.


public static Opacity fromValue(int value)

Returns the `Opacity` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static Opacity fromValue(int value)

Fields:
public static final Opacity[] VALUES
private final int value
