# SumNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class SumNoiseProperty implements NoiseProperty

Noise property that sums the outputs of two child noise sources.

## Key Methods

- public SumNoiseProperty.Entry[] getEntries()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()
- public NoiseProperty getNoiseProperty()
- public void setNoiseProperty(NoiseProperty noiseProperty)
- public double getFactor()
- public void setFactor(double factor)

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty (and 4 more)

Complete API:
  public SumNoiseProperty.Entry[] getEntries()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final SumNoiseProperty.Entry[] entries
