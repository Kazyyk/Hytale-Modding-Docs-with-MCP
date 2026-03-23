# SimplexNoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise | Extends: NoiseField

public class SimplexNoiseField extends NoiseField

Octave-layered simplex noise field. Combines multiple octaves of Simplex noise with configurable frequency and amplitude multipliers. Each octave uses a random offset derived from the seed. The final value is normalized so the output range is independent of octave count.

## Inner Types

- SimplexNoiseField.Builder | class

## Fields

- private final long seed
- @Nonnull private final double[] offsetX
- @Nonnull private final double[] offsetY
- @Nonnull private final double[] offsetZ
- @Nonnull private final double[] offsetW
- private final int numberOfOctaves
- @Nonnull private final double[] octaveFrequency
- @Nonnull private final double[] octaveAmplitude
- private final double normalizer

## Constructors

- SimplexNoiseField(long seed, double octaveAmplitudeMultiplier, double octaveFrequencyMultiplier, int numberOfOctaves)

## Methods

- @Nonnull public static SimplexNoiseField.Builder builder()
- @Override public double valueAt(double x, double y, double z, double w)
- @Override public double valueAt(double x, double y, double z)
- @Override public double valueAt(double x, double y)
- @Override public double valueAt(double x)
- public long getSeed()

Also in this package: Builder, CellNoiseField, CellularDistanceFunction, CellularReturnType, DomainWarpType, FastNoiseLite, FractalType, Grad, NoiseField, NoiseType, RotationType3D, Simplex, TransformType3D, Vector2, Vector3

Complete API:
  public static SimplexNoiseField.Builder builder()
  public double valueAt(double x, double y, double z, double w)
  public double valueAt(double x, double y, double z)
  public double valueAt(double x, double y)
  public double valueAt(double x)
  public long getSeed()

Fields:
private final long seed
private final double[] offsetX
private final double[] offsetY
private final double[] offsetZ
private final double[] offsetW
private final int numberOfOctaves
private final double[] octaveFrequency
private final double[] octaveAmplitude
private final double normalizer
