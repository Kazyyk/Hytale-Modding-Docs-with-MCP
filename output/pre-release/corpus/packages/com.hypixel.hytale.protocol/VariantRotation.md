# VariantRotation

Type: enum | Package: com.hypixel.hytale.protocol

public enum VariantRotation

Enum with 8 constants used in the protocol serialization layer.

## Constants

- None | 0 | No variant rotation.
- Wall | 1 | Wall-facing rotation variants.
- UpDown | 2 | Up/down orientation variants.
- Pipe | 3 | Single-axis pipe rotation.
- DoublePipe | 4 | Dual-axis pipe rotation.
- NESW | 5 | Four cardinal direction variants.
- UpDownNESW | 6 | Six-direction variants (up, down, N, E, S, W).
- All | 7 | All rotation variants.

## Methods


public int getValue()

Returns the integer wire value for this `VariantRotation` constant.


public static VariantRotation fromValue(int value)

Returns the `VariantRotation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`7`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static VariantRotation fromValue(int value)

Fields:
public static final VariantRotation[] VALUES
private final int value
