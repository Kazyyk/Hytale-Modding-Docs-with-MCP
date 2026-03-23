# BlendNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class BlendNoiseProperty implements NoiseProperty

Noise property that blends between two child noise sources based on a blend factor.

## Key Methods

- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)

Also in this package: CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)

Fields:
private final NoiseProperty alpha
private final NoiseProperty[] noises
private final double[] thresholds
private final transient double[] normalize
