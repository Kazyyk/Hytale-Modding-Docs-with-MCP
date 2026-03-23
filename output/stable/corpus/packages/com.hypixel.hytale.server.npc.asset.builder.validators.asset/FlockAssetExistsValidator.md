# FlockAssetExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class FlockAssetExistsValidator extends AssetValidator

## Fields

- private static final FlockAssetExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String flockAsset)
- @Override @Nonnull public String errorMessage(String flockAsset, String attribute)
- @Override @Nonnull public String getAssetName()
- public static FlockAssetExistsValidator required()
- @Nonnull public static FlockAssetExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
