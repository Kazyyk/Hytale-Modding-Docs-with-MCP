# SimplexNoiseField.Builder

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise

public static class Builder

Fluent builder for constructing SimplexNoiseField instances with configurable seed, octave count, frequency/amplitude multipliers, and per-axis scale.

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

- @Nonnull public SimplexNoiseField build()
- @Nonnull public SimplexNoiseField.Builder withScale(double s)
- @Nonnull public SimplexNoiseField.Builder withScale(double x, double y, double z, double w)
- @Nonnull public SimplexNoiseField.Builder withNumberOfOctaves(int n)
- @Nonnull public SimplexNoiseField.Builder withFrequencyMultiplier(double f)
- @Nonnull public SimplexNoiseField.Builder withAmplitudeMultiplier(double a)
- @Nonnull public SimplexNoiseField.Builder withSeed(long s)
