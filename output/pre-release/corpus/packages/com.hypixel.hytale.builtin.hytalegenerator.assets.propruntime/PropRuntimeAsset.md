# PropRuntimeAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.propruntime | Implements: Cleanable, JsonAssetWithMap>

public class PropRuntimeAsset implements Cleanable, JsonAssetWithMap>

Asset definition mapping a prop distribution to a runtime execution index. Determines when during world generation a particular prop distribution is evaluated.

Complete API:
  public boolean isSkip()
  public void cleanUp()
  public PositionProvider buildPositionProvider_deprecated(SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
  public Assignments buildAssignments_deprecated(SeedBox parentSeed, MaterialCache materialCache, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
  public PropDistribution buildPropDistribution(SeedBox parentSeed, MaterialCache materialCache, int runtime, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
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
private PropDistributionAsset propDistributionAsset
