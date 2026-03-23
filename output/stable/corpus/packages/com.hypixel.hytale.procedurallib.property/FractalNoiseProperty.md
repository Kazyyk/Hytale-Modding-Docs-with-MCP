# FractalNoiseProperty

Type: class | Package: com.hypixel.hytale.procedurallib.property | Implements: NoiseProperty

public class FractalNoiseProperty implements NoiseProperty

Noise property that layers multiple octaves of a child noise source for fractal detail.

## Key Methods

- public int getSeedOffset()
- public NoiseFunction getFunction()
- public FractalNoiseProperty.FractalFunction getFractalFunction()
- public int getOctaves()
- public double getLacunarity()
- public double getPersistence()
- public double get(int seed, double x, double y)
- public double get(int seed, double x, double y, double z)
- public String toString()
- public double get(int seed, int offsetSeed, double x, double y, int octaves, double lacunarity, double persistence, @Nonnull NoiseFunction2d noise)
- public double get(int seed, int offsetSeed, double x, double y, double z, int octaves, double lacunarity, double persistence, @Nonnull NoiseFunction3d noise)

Also in this package: BlendNoiseProperty, CurveNoiseProperty, DistortedNoiseProperty, Entry, Formula, FractalFunction, FractalMode, GradientMode, GradientNoiseProperty, InvertNoiseProperty, MaxNoiseProperty, MinNoiseProperty, MultiplyNoiseProperty, NoiseFormula, NoiseFormulaProperty, NoiseProperty, NoisePropertyType, NormalizeNoiseProperty, OffsetNoiseProperty, PowerCurve (and 4 more)

Complete API:
  public int getSeedOffset()
  public NoiseFunction getFunction()
  public FractalNoiseProperty.FractalFunction getFractalFunction()
  public int getOctaves()
  public double getLacunarity()
  public double getPersistence()
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final int seedOffset
protected final NoiseFunction function
protected final FractalNoiseProperty.FractalFunction fractalFunction
protected final int octaves
protected final double lacunarity
protected final double persistence
