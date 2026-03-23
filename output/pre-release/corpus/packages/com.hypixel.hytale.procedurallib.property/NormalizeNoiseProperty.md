# NormalizeNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class NormalizeNoiseProperty implements NoiseProperty

Noise property that normalizes the output of a child noise source to a 0-1 range.

## Key Methods

- public NoiseProperty getNoiseProperty()
- public double getMin()
- public double getRange()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public NoiseProperty getNoiseProperty()
  public double getMin()
  public double getRange()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty noiseProperty
protected final double min
protected final double range
