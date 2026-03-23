# GradientDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class GradientDensity extends Density

Produces a linear gradient along a specified direction.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private static final double HALF_PI
private Density input
private final double slopeRange
private final Vector3d axis
private final Density.Context rChildContext
private final Vector3d rSlopeDirection
private final Vector3d rPosition
