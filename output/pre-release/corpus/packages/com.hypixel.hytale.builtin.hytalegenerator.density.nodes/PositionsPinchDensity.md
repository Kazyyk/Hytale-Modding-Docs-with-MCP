# PositionsPinchDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class PositionsPinchDensity extends Density

Warps all coordinates based on a density-driven pinch function.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  private void pipe(Vector3d p, Control control)
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private Density input
private PositionProvider positions
private Double2DoubleFunction pinchCurve
private double maxDistance
private boolean distanceNormalized
private final Vector3d rMin
private final Vector3d rMax
private final Vector3d rSamplePoint
private final Vector3d rWarpVector
private final ReusableList<Vector3d> rWarpVectors
private final ReusableList<Double> rWarpDistances
private final ReusableList<Double> rWeights
private final Density.Context rChildContext
