# MaxNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class MaxNoiseProperty implements NoiseProperty

Noise property that returns the maximum value from two child noise sources.

## Constants

- double MAX_EPSILON

## Key Methods

- public NoiseProperty[] getNoiseProperties()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public NoiseProperty[] getNoiseProperties()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
public static final double MAX_EPSILON
protected final NoiseProperty[] noiseProperties
