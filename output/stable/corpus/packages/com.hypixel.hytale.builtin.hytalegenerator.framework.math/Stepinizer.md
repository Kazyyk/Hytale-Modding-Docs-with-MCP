# Stepinizer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null | Implements: Function<Double, Double>, Double2DoubleFunction

public class Stepinizer implements Function<Double, Double>, Double2DoubleFunction

## Fields

- private double stepSize
- private double stepSizeHalf
- private double slope
- private double topSmooth
- private double bottomSmooth
- double polarity
- double steepness
- double bottomStep
- double topStep
- double result
- double remainder
- double midPoint

## Constructors

- public Stepinizer()

## Methods

- public Stepinizer setSmooth(double top, double bottom)
- throw new IllegalArgumentException("invalid values provided")
- public Stepinizer setEdgeSlope(double slope)
- throw new IllegalArgumentException("negative slope")
- public Stepinizer setStep(double size)
- throw new IllegalArgumentException("negative size")
- public double apply(double x)
- public double get(double x)
- private double closestStep(double x)
- private double topStep(double x)
- private double bottomStep(double x)
- private double polarity(double x)
- private double steepness(double x)

## Related Types

- Calculator
- Normalizer
