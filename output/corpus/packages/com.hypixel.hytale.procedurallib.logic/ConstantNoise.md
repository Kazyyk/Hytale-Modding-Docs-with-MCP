# ConstantNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class ConstantNoise implements NoiseFunction

A noise function that always returns a fixed value regardless of input coordinates or seed. Used as a placeholder or base value in noise composition chains.

## Fields

- protected final double value

## Constructor


public ConstantNoise(double value)

## Methods

- public double getValue()
- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
