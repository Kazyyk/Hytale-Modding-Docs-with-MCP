# BiomeAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.biomes | Implements: JsonAssetWithMap, Cleanable

public class BiomeAsset implements JsonAssetWithMap, Cleanable

## Fields

- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,BiomeAsset,DefaultAssetMap<String,BiomeAsset>> STORE
- public static final AssetBuilderCodec<String,BiomeAsset> CODEC
- private String id
- private AssetExtraInfo.Data data
- private TerrainAsset terrainAsset
- private MaterialProviderAsset materialProviderAsset
- private PropRuntimeAsset[] propRuntimeAssets
- private EnvironmentProviderAsset environmentProviderAsset
- private TintProviderAsset tintProviderAsset
- private String biomeName
- private DensityAsset[] floatingFunctionNodeAssets

## Methods

- @Nonnull public static AssetStore<String,BiomeAsset,DefaultAssetMap<String,BiomeAsset>> getAssetStore()
- @Override public void cleanUp()
- @Nonnull public Biome build(MaterialCache materialCache, SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
- public String getBiomeName()
- public String getId()

Complete API:
  public static AssetStore<String,BiomeAsset,DefaultAssetMap<String,BiomeAsset>> getAssetStore()
  public void cleanUp()
  public Biome build(MaterialCache materialCache, SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)
  public String getBiomeName()
  public String getId()

Fields:
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,BiomeAsset,DefaultAssetMap<String,BiomeAsset>> STORE
public static final AssetBuilderCodec<String,BiomeAsset> CODEC
private String id
private AssetExtraInfo.Data data
private TerrainAsset terrainAsset
private MaterialProviderAsset materialProviderAsset
private PropRuntimeAsset[] propRuntimeAssets
private EnvironmentProviderAsset environmentProviderAsset
private TintProviderAsset tintProviderAsset
private String biomeName
private DensityAsset[] floatingFunctionNodeAssets
