# RotatorDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class RotatorDensity extends Density

Rotates the sampling coordinates by a specified angle around an axis.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private static final Vector3d Y_AXIS
private Density input
private Vector3d rotationAxis
private Vector3d tiltAxis
private double tiltAngle
private final double spinAngle
private final RotatorDensity.SpecialCase axisSpecialCase
private final Vector3d rChildPosition
private final Density.Context rChildContext
