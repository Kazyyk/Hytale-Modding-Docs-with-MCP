# PlaneDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class PlaneDensity extends Density

Evaluates a plane-based signed distance field.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  private double processAnchored(double x, double y, double z, Density.Context context)

Fields:
public static final double ZERO_DELTA
private static final Vector3d ZERO_VECTOR
private final Double2DoubleFunction distanceCurve
private final Vector3d planeNormal
private final boolean isPlaneHorizontal
private final boolean isAnchored
private final Vector3d rNearestPoint
private final Vector3d rPosition
private final Vector3d rVectorFromPlane
private final Vector3d r0
private final Vector3d r1
private final Vector3d r2
private final Vector3d r3
