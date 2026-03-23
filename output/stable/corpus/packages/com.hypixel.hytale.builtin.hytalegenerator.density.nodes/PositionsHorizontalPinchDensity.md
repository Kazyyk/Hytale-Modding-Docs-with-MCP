# PositionsHorizontalPinchDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class PositionsHorizontalPinchDensity extends Density

Warps horizontal coordinates based on a density-driven pinch.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)
  private void consumer(Vector3d iteratedPosition)
  public void calculateWarpVector(Density.Context context, Vector3d vector_out)

Fields:
private Density input
private final PositionProvider positions
private final Double2DoubleFunction pinchCurve
private final PositionsHorizontalPinchDensity.Cache cache
private final double maxDistance
private final boolean distanceNormalized
private final double positionsMinY
private final double positionsMaxY
private final Vector3d rWarpVector
private final Vector3d rSamplePoint
private final Vector3d rMin
private final Vector3d rMax
private final Vector3d rPosition
private final Vector3d rConsumerResult
private final ReusableList<Vector3d> rWarpVectors
private final ReusableList<Double> rWarpDistances
private final ReusableList<Double> rWeights
private final PositionProvider.Context rPositionsContext
private final Density.Context rChildContext
