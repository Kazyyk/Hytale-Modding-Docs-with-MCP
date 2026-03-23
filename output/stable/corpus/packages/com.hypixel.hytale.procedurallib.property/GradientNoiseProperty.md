# GradientNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class GradientNoiseProperty implements NoiseProperty

Noise property that generates a linear gradient along a specified axis.

## Enum Constants

- `MAGNITUDE`
- `ANGLE`
- `ANGLE_ABS`

## Key Methods

- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- protected static double getAngle(double dx, double dy)
- protected static double getAbsAngle(double dx, double dy)
- protected static double getMagnitude(double dx, double dy, double invNormalize)
- protected static float convertRange(float angle)
