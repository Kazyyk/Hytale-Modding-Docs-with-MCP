# CylinderDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class CylinderDensityAsset extends DensityAsset

A density asset that defines a cylinder-shaped density region.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, DensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<CylinderDensityAsset> CODEC
private CurveAsset radialCurveAsset
private CurveAsset axialCurveAsset
private Vector3d newYAxis
private double spinAngle
