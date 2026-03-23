# NoiseFormulaProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class NoiseFormulaProperty implements NoiseProperty

Noise property that evaluates a mathematical formula over child noise inputs.

## Key Methods

- public NoiseProperty getProperty()
- public NoiseFormulaProperty.NoiseFormula.Formula getFormula()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()
- public double eval(double noise)

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, FractalNoiseProperty, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public NoiseProperty getProperty()
  public NoiseFormulaProperty.NoiseFormula.Formula getFormula()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final NoiseProperty property
protected final NoiseFormulaProperty.NoiseFormula.Formula formula
