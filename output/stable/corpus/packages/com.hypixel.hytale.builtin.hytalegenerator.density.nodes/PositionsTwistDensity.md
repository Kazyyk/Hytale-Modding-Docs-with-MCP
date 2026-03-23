# PositionsTwistDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class PositionsTwistDensity extends Density

Applies a twist transformation to input coordinates around the Y axis.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public void consumer(Vector3d p)
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private Density input
private PositionProvider positions
private Double2DoubleFunction twistCurve
private Vector3d twistAxis
private double maxDistance
private boolean distanceNormalized
private boolean zeroPositionsY
private final Vector3d rMin
private final Vector3d rMax
private final Vector3d rSamplePoint
private final Vector3d rQueryPosition
private final Vector3d rWarpVector
private final ReusableList<Vector3d> rWarpVectors
private final ReusableList<Double> rWarpDistances
private final ReusableList<Double> rWeights
private final PositionProvider.Context rPositionsContext
private final Density.Context rChildContext
