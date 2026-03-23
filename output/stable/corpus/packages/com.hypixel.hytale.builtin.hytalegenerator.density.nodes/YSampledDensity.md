# YSampledDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class YSampledDensity extends Density

Evaluates the input density at a fixed or computed Y coordinate.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  private double toY0(double position)
  private double toCellGrid(double position)
  public void setInputs(Density[] inputs)

Fields:
private Density input
private final double sampleDistance
private final double sampleDistanceInverse
private final double sampleOffset
private double value0
private double value1
private double y0
private double y1
private double x
private double z
private boolean isEmpty
private final Vector3d rChildPosition
private final Density.Context rChildContext
