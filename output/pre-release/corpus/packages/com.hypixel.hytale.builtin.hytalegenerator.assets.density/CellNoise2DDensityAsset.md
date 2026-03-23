# CellNoise2DDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class CellNoise2DDensityAsset extends DensityAsset

A density asset that generates 2D cellular/Voronoi noise values.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset, DensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public void cleanUp()

Fields:
private static Set<String> validCellTypes
public static final BuilderCodec<CellNoise2DDensityAsset> CODEC
private double scaleX
private double scaleZ
private double jitter
private int octaves
private String seedKey
private FastNoiseLite.CellularReturnType cellType
