# InterpolatedCurve

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null | Implements: Double2DoubleFunction

public class InterpolatedCurve implements Double2DoubleFunction

## Fields

- private final Double2DoubleFunction functionA
- private final Double2DoubleFunction functionB
- private final double positionA
- private final double positionB
- private final double distance
- private final double smoothTransition
- double bRatio
- double aRatio
- double a
- double v

## Constructors

- public InterpolatedCurve(double positionA, double positionB, double smoothTransition, @Nonnull Double2DoubleFunction functionA, @Nonnull Double2DoubleFunction functionB)

## Methods

- throw new IllegalArgumentException()
- public double get(double x)
- public double transitionCurve(double ratio)
