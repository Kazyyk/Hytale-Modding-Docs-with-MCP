# VectorWarpDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class VectorWarpDensity extends Density

Warps sampling coordinates using a vector provider.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private Density input
private Density warpInput
private final double warpFactor
private final Vector3d warpVector
private final Vector3d rSamplePoint
private final Density.Context rChildContext
