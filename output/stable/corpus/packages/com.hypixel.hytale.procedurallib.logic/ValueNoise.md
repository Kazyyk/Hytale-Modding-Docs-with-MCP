# ValueNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class ValueNoise implements NoiseFunction

Value noise that uses hash-based random values at integer lattice points with configurable interpolation (linear, Hermite, or quintic). Output is mapped to [-1, 1]. Supports both 2D and 3D evaluation.

## Fields

- protected final GeneralNoise.InterpolationFunction interpolationFunction

## Constructor


public ValueNoise(GeneralNoise.InterpolationFunction interpolationFunction)

## Methods

- public GeneralNoise.InterpolationFunction getInterpolationFunction()
- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
