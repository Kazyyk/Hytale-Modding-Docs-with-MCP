# MultiMixDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class MultiMixDensity extends Density

Blends multiple densities using gauge-based segmented interpolation.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity (and 49 more)

Complete API:
  public double process(Density.Context context)
  public void setInputs(Density[] inputs)
  public static boolean isKeysUnique(List<MultiMixDensity.Key> keys)

Fields:
private final List<MultiMixDensity.Segment> segments
private final double min
private final double max
private final Density firstDensity
private final Density lastDensity
private Density influenceDensity
