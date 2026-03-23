# SimplexNoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise | Extends: NoiseField

public class SimplexNoiseField extends NoiseField

Extends `NoiseField`.

## Fields

- private long seed
- private double octaveAmplitudeMultiplier
- private double octaveFrequencyMultiplier
- private int numberOfOctaves
- private double scaleX
- private double scaleY
- private double scaleZ
- private double scaleW

## Methods

- throw new IllegalArgumentException("octaves can't be smaller than 1")
- @Nonnull public static SimplexNoiseField.Builder builder()
- @Override public double valueAt(double x, double y, double z, double w)
- @Override public double valueAt(double x, double y, double z)
- @Override public double valueAt(double x, double y)
- @Override public double valueAt(double x)
- public long getSeed()
- private Builder()
- @Nonnull public SimplexNoiseField.Builder withScale(double s)
- @Nonnull public SimplexNoiseField.Builder withScale(double x, double y, double z, double w)
- @Nonnull public SimplexNoiseField.Builder withNumberOfOctaves(int n)
- throw new IllegalArgumentException("invalid number")
- @Nonnull public SimplexNoiseField.Builder withFrequencyMultiplier(double f)
- @Nonnull public SimplexNoiseField.Builder withAmplitudeMultiplier(double a)
- @Nonnull public SimplexNoiseField.Builder withSeed(long s)

Also in this package: Builder, CellNoiseField, Grad, NoiseField, Simplex

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
