# NodeFunction

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.math | Implements: Function<Double, Double>, Double2DoubleFunction

public class NodeFunction implements Function<Double, Double>, Double2DoubleFunction

A piecewise linear function defined by sorted (input, output) control points. For inputs between two adjacent points, linearly interpolates between their output values. Inputs below the first point return the first point's value; inputs above the last point return the last point's value. Uses binary search over pre-computed ranges for efficient lookup.

## Fields

- private static final double FALLBACK_VALUE
- @Nonnull private final List<double[]> points
- @Nonnull private final List<RangeDouble> ranges

## Methods

- public Double apply(@Nonnull Double input)
- public double get(double input)
- @Nonnull public NodeFunction addPoint(double in, double out)
- public boolean contains(double x)
- private void initializeRanges()
- private int indexBefore(double input)
