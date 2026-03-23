# DrawType

Type: enum | Package: com.hypixel.hytale.protocol

public enum DrawType

Determines how a block or entity is visually rendered.

## Constants

- Empty | 0 | Not rendered (invisible/air block).
- GizmoCube | 1 | Editor-only gizmo cube for debugging.
- Cube | 2 | Standard cube block with per-face textures.
- Model | 3 | Custom 3D model (non-cube shapes).
- CubeWithModel | 4 | Cube collision with additional model overlay.

## Methods


public int getValue()

Returns the integer wire value for this `DrawType` constant.


public static DrawType fromValue(int value)

Returns the `DrawType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static DrawType fromValue(int value)

Fields:
public static final DrawType[] VALUES
private final int value
