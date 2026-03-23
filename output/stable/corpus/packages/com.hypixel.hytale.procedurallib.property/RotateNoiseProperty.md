# RotateNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class RotateNoiseProperty implements NoiseProperty

Noise property that rotates the sampling coordinates before querying a child noise source.

## Key Methods

- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty (and 4 more)

Complete API:
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty noise
protected final CoordinateRotator rotation
