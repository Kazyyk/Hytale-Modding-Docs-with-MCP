# DensityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density | Implements: JsonAssetWithMap

public abstract class DensityAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, DensityAsset>>, Cleanable

Abstract base class for all density function assets used in procedural world generation. Density assets define mathematical functions that produce scalar values at 3D positions, used to shape terrain, caves, and other world features. Supports an input pipeline where density assets can be chained together.

## Key Methods

- public static final AssetCodecMapCodec<String, DensityAsset> CODEC = new AssetCodecMapCodec<>( Codec.STRING, (t, k) -> t.id = k, t -> t.id, (t, data)
- public static final Codec<String> CHILD_ASSET_CODEC = new ContainedAssetCodec<>(DensityAsset.class, CODEC)
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY = new ArrayCodec<>(CHILD_ASSET_CODEC, String[]::new)
- public static final BuilderCodec<DensityAsset> ABSTRACT_CODEC = BuilderCodec.abstractBuilder(DensityAsset.class)
- public abstract Density build(DensityAsset.Argument var1)
- public void cleanUp()
- public static DensityAsset getFallbackAsset()
- public Density buildWithInputs(DensityAsset.Argument argument, Density[] inputs)
- public DensityAsset[] inputs()
- public List<Density> buildInputs(DensityAsset.Argument argument, boolean excludeSkipped)
- public Density[] buildInputsArray(DensityAsset.Argument argument)
- public DensityAsset firstInput()
- public DensityAsset secondInput()
- public Density buildFirstInput(DensityAsset.Argument argument)
- public Density buildSecondInput(DensityAsset.Argument argument)
- public boolean isSkipped()
- public static DensityAsset.Exported getExportedAsset(String name)
- public String getId()
- public static DensityAsset.Argument from(VectorProviderAsset.Argument argument)
- public static DensityAsset.Argument from(MaterialProviderAsset.Argument argument)

Known subclasses: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset, DistanceDensityAsset, DistanceToBiomeEdgeDensityAsset, EllipsoidDensityAsset, ExportedDensityAsset, FastGradientWarpDensityAsset, FloorDensityAsset, GradientDensityAsset, GradientWarpDensityAsset, ImportedDensityAsset, InverterDensityAsset, MaxDensityAsset, MinDensityAsset, MixDensityAsset, MultiMixDensityAsset, MultiplierDensityAsset, NormalizerDensityAsset, OffsetConstantAsset, OffsetDensityAsset, PipelineDensityAsset, PlaneDensityAsset, Positions3DDensityAsset, PositionsCellNoiseDensityAsset, PositionsPinchDensityAsset, PositionsTwistDensityAsset, PowDensityAsset, RotatorDensityAsset, ScaleDensityAsset, SelectorDensityAsset, ShellDensityAsset, SimplexNoise2dDensityAsset, SimplexNoise3DDensityAsset, SliderDensityAsset, SmoothCeilingDensityAsset, SmoothClampDensityAsset, SmoothFloorDensityAsset, SmoothMaxDensityAsset, SmoothMinDensityAsset, SqrtDensityAsset, SumDensityAsset, SwitchDensityAsset, SwitchStateDensityAsset, TerrainDensityAsset, VectorWarpDensityAsset, XOverrideDensityAsset, XValueDensityAsset, YOverrideDensityAsset, YSampledDensityAsset, YValueDensityAsset, ZOverrideDensityAsset, ZValueDensityAsset

Also in this package: AbsDensityAsset, AmplitudeConstantAsset, AmplitudeDensityAsset, AnchorDensityAsset, AngleDensityAsset, Argument, AxisDensityAsset, BaseHeightDensityAsset, Cache2dDensityAsset_Deprecated, CacheDensityAsset, CeilingDensityAsset, CellNoise2DDensityAsset, CellNoise3DDensityAsset, CellWallDistanceDensityAsset, ClampDensityAsset, ConstantDensityAsset, CubeDensityAsset, CuboidDensityAsset, CurveMapperDensityAsset, CylinderDensityAsset (and 51 more)

Complete API:
  public abstract Density build(DensityAsset.Argument var1)
  public void cleanUp()
  protected void cleanUpInputs()
  public static DensityAsset getFallbackAsset()
  public Density buildWithInputs(DensityAsset.Argument argument, Density[] inputs)
  public DensityAsset[] inputs()
  public List<Density> buildInputs(DensityAsset.Argument argument, boolean excludeSkipped)
  public Density[] buildInputsArray(DensityAsset.Argument argument)
  public DensityAsset firstInput()
  public DensityAsset secondInput()
  public Density buildFirstInput(DensityAsset.Argument argument)
  public Density buildSecondInput(DensityAsset.Argument argument)
  public boolean isSkipped()
  public static DensityAsset.Exported getExportedAsset(String name)
  public String getId()
  public static DensityAsset.Argument from(VectorProviderAsset.Argument argument)
  public static DensityAsset.Argument from(MaterialProviderAsset.Argument argument)
  public static DensityAsset.Argument from(PropAsset.Argument argument)
  public static DensityAsset.Argument from(PatternAsset.Argument argument)
  public static DensityAsset.Argument from(PositionProviderAsset.Argument argument)
  public static DensityAsset.Argument from(AssignmentsAsset.Argument argument)
  public static DensityAsset.Argument from(WorldStructureAsset.Argument argument, ReferenceBundle referenceBundle)
  public static DensityAsset.Argument from(EnvironmentProviderAsset.Argument argument)
  public static DensityAsset.Argument from(TintProviderAsset.Argument argument)

Fields:
private static final DensityAsset[] EMPTY_INPUTS
public static final AssetCodecMapCodec<String,DensityAsset> CODEC
private static final Map<String,DensityAsset.Exported> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<DensityAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private DensityAsset[] inputs
private boolean skip
protected String exportName
