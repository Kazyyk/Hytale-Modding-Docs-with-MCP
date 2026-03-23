# InterpolatedCurve

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.math | Implements: Double2DoubleFunction

public class InterpolatedCurve implements Double2DoubleFunction

A piecewise function that blends between two `Double2DoubleFunction` instances over a transition region. Below `positionA`, returns `functionA`; above `positionB`, returns `functionB`; between the two, blends using a cosine-based smooth transition controlled by the `smoothTransition` parameter (0.0 = linear, 1.0 = fully smooth cosine).

## Fields

- @Nonnull private final Double2DoubleFunction functionA
- @Nonnull private final Double2DoubleFunction functionB
- private final double positionA
- private final double positionB
- private final double distance
- private final double smoothTransition

## Constructors

- public InterpolatedCurve(double positionA, double positionB, double smoothTransition, @Nonnull Double2DoubleFunction functionA, @Nonnull Double2DoubleFunction functionB)

## Methods

- public double get(double x)
- public double transitionCurve(double ratio)
