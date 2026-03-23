# ScaleDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class ScaleDensity extends Density

Scales input coordinates by constant factors before sampling.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)

Fields:
private final Vector3d scale
private final boolean isInvalid
private Density input
private final Vector3d rChildPosition
private final Density.Context rChildContext
