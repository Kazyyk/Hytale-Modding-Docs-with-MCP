# DistortedNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class DistortedNoiseProperty implements NoiseProperty

Noise property that distorts the input coordinates of a child noise source.

## Key Methods

- public NoiseProperty getNoiseProperty()
- public ICoordinateRandomizer getRandomizer()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()

Also in this package: BlendNoiseProperty, CurveNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public NoiseProperty getNoiseProperty()
  public ICoordinateRandomizer getRandomizer()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty noiseProperty
protected final ICoordinateRandomizer randomizer
