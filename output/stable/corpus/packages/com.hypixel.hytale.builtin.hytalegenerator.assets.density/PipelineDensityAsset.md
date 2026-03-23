# PipelineDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class PipelineDensityAsset extends DensityAsset

A density asset that chains multiple density operations in sequence.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public void cleanUp()

Fields:
private static final DensityAsset[] EMPTY_INPUTS
public static final BuilderCodec<PipelineDensityAsset> CODEC
private DensityAsset[] pipeline
