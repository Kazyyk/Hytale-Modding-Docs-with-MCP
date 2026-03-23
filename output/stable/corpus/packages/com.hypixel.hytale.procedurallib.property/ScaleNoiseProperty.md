# ScaleNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class ScaleNoiseProperty implements NoiseProperty

Noise property that scales the sampling coordinates before querying a child noise source.

## Key Methods

- public NoiseProperty getNoiseProperty()
- public double getScaleX()
- public double getScaleY()
- public double getScaleZ()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty (and 4 more)

Complete API:
  public NoiseProperty getNoiseProperty()
  public double getScaleX()
  public double getScaleY()
  public double getScaleZ()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty noiseProperty
protected final double scaleX
protected final double scaleY
protected final double scaleZ
