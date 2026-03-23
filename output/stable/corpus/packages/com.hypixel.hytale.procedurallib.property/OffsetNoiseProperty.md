# OffsetNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class OffsetNoiseProperty implements NoiseProperty

Noise property that adds a constant offset to the output of a child noise source.

## Key Methods

- public NoiseProperty getNoiseProperty()
- public double getOffsetX()
- public double getOffsetY()
- public double getOffsetZ()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public NoiseProperty getNoiseProperty()
  public double getOffsetX()
  public double getOffsetY()
  public double getOffsetZ()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty noiseProperty
protected final double offsetX
protected final double offsetY
protected final double offsetZ
