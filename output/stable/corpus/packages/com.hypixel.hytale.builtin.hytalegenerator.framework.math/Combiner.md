# Combiner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null

public class Combiner

## Fields

- private final double y
- private double value
- MAX_POLICY, MIN_POLICY
- private final Combiner parent
- private double value
- private double floor
- private double ceiling
- private double paddingFloor
- private double paddingCeiling
- private Combiner.IntersectionPolicy intersectionPolicy
- private double intersectionSmoothingRange
- private boolean withLimitsCheck
- private boolean withPaddingCheck
- private boolean withIntersectionPolicyCheck
- private boolean isFinished
- double floorPaddingMultiplier
- double ceilingPaddingMultiplier
- double paddingMultiplier

## Constructors

- public Combiner(double background, double y)

## Methods

- public Combiner.Layer addLayer(double density)
- public double getValue()
- private Layer(@Nonnull Combiner combiner, double value)
- throw new NullPointerException()
- public Combiner finishLayer()
- throw new IllegalStateException("incomplete")
- throw new IllegalStateException("method was already called")
- public Combiner.Layer withLimits(double floor, double ceiling)
- public Combiner.Layer withPadding(double paddingFloor, double paddingCeiling)
- throw new IllegalArgumentException("negative padding values")
- public Combiner.Layer withIntersectionPolicy(@Nonnull Combiner.IntersectionPolicy policy, double smoothRange)

## Inner Types

- `Combiner.IntersectionPolicy`
- `Combiner.Layer`

## Related Types

- Calculator

Also in this package: Area, BitConverter, Calculator, CoPrimeGenerator, InterpolatedCurve, Interpolation, IntersectionPolicy, Layer, MultipliedIteration, NodeFunction, Normalizer, Probability, Range, RegionGrid, SeedGenerator, Splitter, Stepinizer

Complete API:
  public Combiner.Layer addLayer(double density)
  public double getValue()

Fields:
private final double y
private double value
