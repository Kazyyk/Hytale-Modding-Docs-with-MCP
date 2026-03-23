# AssignmentsAsset

Type: abstract class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.propassignments | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, AssignmentsAsset>>

public abstract class AssignmentsAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, AssignmentsAsset>>

## Fields

- private static final Map<String, AssignmentsAsset> exportedNodes
- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName
- public SeedBox parentSeed
- public MaterialCache materialCache
- public ReferenceBundle referenceBundle
- public int runtime
- public WorkerIndexer.Id workerId

## Methods

- public abstract Assignments build(@Nonnull AssignmentsAsset.Argument var1)
- public boolean skip()
- public static AssignmentsAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Override public void cleanUp()

## Inner Types

- `AssignmentsAsset.Argument`

Known subclasses: ConstantAssignmentsAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssignmentsAsset

Also in this package: Argument, ConstantAssignmentsAsset, DelimiterAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets, WeightedAssignmentsAsset

Complete API:
  public abstract Assignments build(AssignmentsAsset.Argument var1)
  public boolean skip()
  public static AssignmentsAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,AssignmentsAsset> CODEC
private static final Map<String,AssignmentsAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<AssignmentsAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
