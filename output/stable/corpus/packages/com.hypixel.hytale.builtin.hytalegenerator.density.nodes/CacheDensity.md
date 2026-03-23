# CacheDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class CacheDensity extends Density

Caches the result of its input density to avoid redundant computation.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity, Entry (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private final CacheDensity.Cache cache
private Density input
