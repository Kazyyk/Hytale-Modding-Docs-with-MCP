# SwitchDensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Extends: DensityAsset

public class SwitchDensityAsset extends DensityAsset

A density asset that selects between multiple input densities based on matching conditions.

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public Density build(DensityAsset.Argument argument)
  public static int getHashFromState(String state)
  public void cleanUp()

Fields:
public static final BuilderCodec<SwitchDensityAsset> CODEC
public static final String DEFAULT_STATE
public static final int DEFAULT_STATE_HASH
private SwitchDensityAsset.SwitchCaseAsset[] switchCaseAssets
