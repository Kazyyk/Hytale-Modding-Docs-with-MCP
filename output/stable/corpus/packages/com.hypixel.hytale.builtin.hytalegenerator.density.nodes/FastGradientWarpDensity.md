# FastGradientWarpDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class FastGradientWarpDensity extends Density

Applies fast gradient domain warping to input coordinates.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private static final double HALF_PI
private Density input
private final double warpScale
private final FastNoiseLite warper
private final FastNoiseLite.Vector3 rWarpedPosition
private final Density.Context rChildContext
private final Vector3d rPosition
