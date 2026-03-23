# ImportedDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class ImportedDensityAsset extends DensityAsset

A density asset that imports a density definition exported by another asset via the `ExportAs` mechanism.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public DensityAsset[] inputs()
  public void cleanUp()

Fields:
public static final BuilderCodec<ImportedDensityAsset> CODEC
private String importedNodeName
