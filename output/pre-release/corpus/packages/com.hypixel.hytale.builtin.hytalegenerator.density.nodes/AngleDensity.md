# AngleDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class AngleDensity extends Density

Computes angular distance between a position and a vector provider direction.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity, Entry (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private static final double HALF_PI
private VectorProvider vectorProvider
private final Vector3d vector
private final boolean toAxis
private final Vector3d rOtherVector
private final VectorProvider.Context rVectorProviderContext
