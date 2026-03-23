# VectorWarpDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class VectorWarpDensityAsset extends DensityAsset

A density asset that warps sampling coordinates using a vector displacement field.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<VectorWarpDensityAsset> CODEC
private double warpFactor
private Vector3d warpVector
