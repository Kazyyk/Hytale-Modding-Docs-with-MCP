# CurveNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class CurveNoiseProperty implements NoiseProperty

Noise property that applies a curve transformation to its child noise output.

## Key Methods

- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()
- public double applyAsDouble(double operand)

Also in this package: BlendNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty noise
protected final DoubleUnaryOperator function
