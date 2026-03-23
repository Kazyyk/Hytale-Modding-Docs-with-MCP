# AssetManager

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets | Extends: null

public class AssetManager

## Fields

- private final HashMap<String, DensityAsset> densityAssets
- private final HashMap<String, AssignmentsAsset> assigmentAssets
- private final HashMap<String, BiomeAsset> biomeAssets
- private final HashMap<String, WorldStructureAsset> worldStructureAssets
- private final HashMap<String, BlockMaskAsset> blockMaskAssets
- private SettingsAsset settingsAsset
- private final HytaleLogger logger
- private List<Runnable> reloadListeners
- SettingsAsset asset
- String msg

## Constructors

- public AssetManager(@Nonnull EventRegistry eventRegistry, @Nonnull HytaleLogger logger)

## Methods

- private void loadBlockMaskAssets(@Nonnull LoadedAssetsEvent<String, BlockMaskAsset, DefaultAssetMap<String, BlockMaskAsset>> event)
- private void loadDensityAssets(@Nonnull LoadedAssetsEvent<String, DensityAsset, DefaultAssetMap<String, DensityAsset>> event)
- private void loadAssignmentsAssets(@Nonnull LoadedAssetsEvent<String, AssignmentsAsset, DefaultAssetMap<String, AssignmentsAsset>> event)
- private void loadBiomeAssets(@Nonnull LoadedAssetsEvent<String, BiomeAsset, DefaultAssetMap<String, BiomeAsset>> event)
- private void loadWorldStructureAssets(@Nonnull LoadedAssetsEvent<String, WorldStructureAsset, DefaultAssetMap<String, WorldStructureAsset>> event)
- private void loadSettingsAssets(@Nonnull LoadedAssetsEvent<String, SettingsAsset, DefaultAssetMap<String, SettingsAsset>> event)
- public SettingsAsset getSettingsAsset()
- public WorldStructureAsset getWorldStructureAsset(@Nonnull String id)
- public void registerReloadListener(@Nonnull Runnable l)
- public void unregisterReloadListener(@Nonnull Runnable l)
- private void triggerReloadListeners()
- WorldStructureAsset.class, new DefaultAssetMap()
- BlockMaskAsset.class, new DefaultAssetMap()
- AssignmentsAsset.class, new DefaultAssetMap()
- SettingsAsset.class, new DefaultAssetMap()

## Related Types

- SettingsAsset
