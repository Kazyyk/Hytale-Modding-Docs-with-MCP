# ShaderType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ShaderType

Enum with 10 constants used in the protocol serialization layer.

## Constants

- None | 0 | No special shader.
- Wind | 1 | Wind animation shader.
- WindAttached | 2 | Wind shader attached to surface.
- WindRandom | 3 | Randomized wind shader.
- WindFractal | 4 | Fractal wind pattern shader.
- Ice | 5 | Ice surface shader.
- Water | 6 | Water surface shader.
- Lava | 7 | Lava surface shader.
- Slime | 8 | Slime surface shader.
- Ripple | 9 | Ripple effect shader.

## Methods


public int getValue()

Returns the integer wire value for this `ShaderType` constant.


public static ShaderType fromValue(int value)

Returns the `ShaderType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`9`). The static `VALUES` array is used for O(1) lookup by ordinal.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static ShaderType fromValue(int value)

Fields:
public static final ShaderType[] VALUES
private final int value
