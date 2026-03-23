# PatternAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.patterns | Implements: Cleanable, JsonAssetWithMap

public abstract class PatternAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PatternAsset>>

## Fields

- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName
- public SeedBox parentSeed
- public MaterialCache materialCache
- public ReferenceBundle referenceBundle
- public WorkerIndexer.Id workerId

## Methods

- protected PatternAsset()
- public abstract Pattern build(@Nonnull PatternAsset.Argument var1)
- public boolean isSkipped()
- public static PatternAsset getExportedAsset(@Nonnull String name)
- public String getId()
- public void cleanUp()
- public static PatternAsset.Argument argumentFrom(@Nonnull DirectionalityAsset.Argument argument)
- public static PatternAsset.Argument argumentFrom(@Nonnull PropAsset.Argument argument)

Known subclasses: AndPatternAsset, BlockSetPatternAsset, CeilingPatternAsset, ConstantPatternAsset, CuboidPatternAsset, DensityPatternAsset, FloorPatternAsset, ImportedPatternAsset, MaterialPatternAsset, NotPatternAsset, OffsetPatternAsset, OrPatternAsset, RotatorPatternAsset, SurfacePatternAsset, WallPatternAsset

Also in this package: AndPatternAsset, Argument, BlockSetPatternAsset, CeilingPatternAsset, ConstantPatternAsset, CuboidPatternAsset, DelimiterAsset, DensityPatternAsset, FloorPatternAsset, ImportedPatternAsset, MaterialPatternAsset, NotPatternAsset, OffsetPatternAsset, OrPatternAsset, RotatorPatternAsset, SurfacePatternAsset, WallPatternAsset

Complete API:
  public abstract Pattern build(PatternAsset.Argument var1)
  public boolean isSkipped()
  public static PatternAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()
  public static PatternAsset.Argument argumentFrom(DirectionalityAsset.Argument argument)
  public static PatternAsset.Argument argumentFrom(PropAsset.Argument argument)

Fields:
public static final AssetCodecMapCodec<String,PatternAsset> CODEC
private static final Map<String,PatternAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<PatternAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
