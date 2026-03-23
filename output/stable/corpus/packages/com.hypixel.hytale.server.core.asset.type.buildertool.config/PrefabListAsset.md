# PrefabListAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, PrefabListAsset>>

public class PrefabListAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, PrefabListAsset>>

Asset defining a named list of prefab file references, used by builder tools. Supports server, asset, and worldgen root directories, optional recursive directory scanning, and random prefab selection.

## Methods

- public static AssetStore<String, PrefabListAsset, DefaultAssetMap<String, PrefabListAsset>> getAssetStore()
- public static DefaultAssetMap<String, PrefabListAsset> getAssetMap()
- public Path[] getPrefabPaths()
- public PrefabListAsset.PrefabReference[] getPrefabReferences()
- public Path getRandomPrefab()
- public String getId()

## Inner Types

- PrefabListAsset.PrefabReference | class | Individual prefab path reference with optional recursion
- PrefabListAsset.PrefabRootDirectory | enum | Root directories: `Server`, `Asset`, `Worldgen

Also in this package: ArgData, BlockTypeListAsset, BrushData, BuilderTool, BuilderToolData, PrefabReference, PrefabRootDirectory, Values

Complete API:
  public static AssetStore<String,PrefabListAsset,DefaultAssetMap<String,PrefabListAsset>> getAssetStore()
  public static DefaultAssetMap<String,PrefabListAsset> getAssetMap()
  private void convertPrefabReferencesToPrefabPaths()
  public Path[] getPrefabPaths()
  public PrefabListAsset.PrefabReference[] getPrefabReferences()
  public Path getRandomPrefab()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,PrefabListAsset> CODEC
private static AssetStore<String,PrefabListAsset,DefaultAssetMap<String,PrefabListAsset>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
private String id
private Path[] prefabPaths
private PrefabListAsset.PrefabReference[] prefabReferences
private AssetExtraInfo.Data data
