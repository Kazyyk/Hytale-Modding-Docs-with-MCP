# PositionsPinchDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class PositionsPinchDensityAsset extends DensityAsset

A density asset that applies a positional pinch transformation, compressing coordinates toward a center point.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<PositionsPinchDensityAsset> CODEC
private PositionProviderAsset positionProviderAsset
private CurveAsset pinchCurveAsset
private double maxDistance
private boolean normalizeDistance
private boolean isHorizontal
private double positionsMinY
private double positionsMaxY
