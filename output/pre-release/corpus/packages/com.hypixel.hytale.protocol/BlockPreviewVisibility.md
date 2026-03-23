# BlockPreviewVisibility

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockPreviewVisibility

Controls whether the block placement preview ghost is shown.

## Constants

- AlwaysVisible | 0
- AlwaysHidden | 1
- Default | 2

## Methods


public int getValue()

Returns the integer wire value for this `BlockPreviewVisibility` constant.


public static BlockPreviewVisibility fromValue(int value)

Returns the `BlockPreviewVisibility` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockPlacementSettings

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static BlockPreviewVisibility fromValue(int value)

Fields:
public static final BlockPreviewVisibility[] VALUES
private final int value
