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
