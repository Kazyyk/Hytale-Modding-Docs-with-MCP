# Normalizer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.math

public class Normalizer

Utility class for range normalization. Provides `normalizeNoise` as a convenience for mapping noise values from [-1, 1] to [0, 1], and a general-purpose `normalize` method for arbitrary range remapping.

## Methods

- public static double normalizeNoise(double input)
- public static double normalize(double fromMin, double fromMax, double toMin, double toMax, double input)

Also in this package: Calculator, InterpolatedCurve, Interpolation, NodeFunction

Complete API:
  public static double normalizeNoise(double input)
  public static double normalize(double fromMin, double fromMax, double toMin, double toMax, double input)
