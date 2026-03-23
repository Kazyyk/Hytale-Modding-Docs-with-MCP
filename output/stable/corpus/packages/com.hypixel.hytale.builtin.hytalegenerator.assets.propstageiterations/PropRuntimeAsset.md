# PropRuntimeAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.propstageiterations | Implements: Cleanable, JsonAssetWithMap

public class PropRuntimeAsset implements Cleanable, JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,PropRuntimeAsset> CODEC
- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private int runtime
- private PositionProviderAsset positionProviderAsset
- private AssignmentsAsset assignmentsAsset

## Methods

- public boolean isSkip()
- @Override public void cleanUp()
- public PositionProvider buildPositionProvider(SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
- public Assignments buildPropDistribution(SeedBox parentSeed, MaterialCache materialCache, int runtime, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
- public int getRuntime()
- public String getId()

Complete API:
  public boolean isSkip()
  public void cleanUp()
  public PositionProvider buildPositionProvider(SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
  public Assignments buildPropDistribution(SeedBox parentSeed, MaterialCache materialCache, int runtime, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
  public int getRuntime()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,PropRuntimeAsset> CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private int runtime
private PositionProviderAsset positionProviderAsset
private AssignmentsAsset assignmentsAsset
