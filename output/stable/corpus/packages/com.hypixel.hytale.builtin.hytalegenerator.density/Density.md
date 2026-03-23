# Density

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density

public abstract class Density

Class in the density subsystem.

## Fields

- DEFAULT_VALUE | double | Static final double field.
- DEFAULT_DENSITY | double | Static final double field.

## Methods

- process(@Nonnull Density.Context var1) | double | public method.
- setInputs(Density[] inputs) | void | public method.

Known subclasses: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity, FastGradientWarpDensity, FloorDensity, FunctionDensity, GradientDensity, GradientWarpDensity, InverterDensity, MaxDensity, MinDensity, MixDensity, MultiCacheDensity, MultiMixDensity, MultiplierDensity, Noise2dDensity, Noise3dDensity, NormalizerDensity, OffsetConstantDensity, OffsetDensity, PlaneDensity, PositionsDensity, PositionsHorizontalPinchDensity, PositionsPinchDensity, PositionsTwistDensity, PowDensity, RotatorDensity, ScaleDensity, SelectorDensity, ShellDensity, SliderDensity, SmoothCeilingDensity, SmoothClampDensity, SmoothFloorDensity, SmoothMaxDensity, SmoothMinDensity, SqrtDensity, SumDensity, SwitchDensity, SwitchStateDensity, TerrainDensity, VectorWarpDensity, XOverrideDensity, XValueDensity, YOverrideDensity, YSampledDensity, YValueDensity, ZOverrideDensity, ZValueDensity

Also in this package: Context

Complete API:
  public abstract double process(Density.Context var1)
  public void setInputs(Density[] inputs)

Fields:
private static final Bounds3i DEFAULT_READ_BOUNDS
public static final double DEFAULT_VALUE
public static final double DEFAULT_DENSITY
