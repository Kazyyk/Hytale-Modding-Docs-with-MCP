# FastGradientWarpDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class FastGradientWarpDensityAsset extends DensityAsset

A density asset that applies a fast gradient warp distortion to position coordinates before evaluating the input density.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<FastGradientWarpDensityAsset> CODEC
private float warpLacunarity
private float warpPersistence
private int warpOctaves
private float warpScale
private float warpFactor
private String seed
