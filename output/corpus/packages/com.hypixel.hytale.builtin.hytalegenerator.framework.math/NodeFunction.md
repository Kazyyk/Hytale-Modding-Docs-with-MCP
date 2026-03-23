# NodeFunction

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null | Implements: Function<Double, Double>, Double2DoubleFunction

public class NodeFunction implements Function<Double, Double>, Double2DoubleFunction

## Fields

- private static final double FALLBACK_VALUE
- private final List<double[]> points
- private final List<RangeDouble> ranges
- int indexBefore
- double[] before
- double[] after
- double differenceY
- double ratio

## Methods

- public Double apply(@Nonnull Double input)
- public double get(double input)
- public NodeFunction addPoint(double in, double out)
- public boolean contains(double x)
- private void initializeRanges()
- private int indexBefore(double input)
