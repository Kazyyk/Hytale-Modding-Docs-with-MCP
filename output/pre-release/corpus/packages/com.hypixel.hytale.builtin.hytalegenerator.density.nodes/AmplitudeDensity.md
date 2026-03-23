# AmplitudeDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class AmplitudeDensity extends Density

Multiplies input density by a height-dependent amplitude function.

Also in this package: AbsDensity, AmplitudeConstantDensity, AnchorDensity, AngleDensity, AxisDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity, Entry (and 49 more)

Complete API:
  public double process(Density.Context context)
  public boolean skipInputs(double y)
  public void setInputs(Density[] inputs)

Fields:
public static final double ZERO_DELTA
private NodeFunction amplitudeFunc
private Density input
