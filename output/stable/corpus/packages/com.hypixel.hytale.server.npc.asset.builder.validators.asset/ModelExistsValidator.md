# ModelExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ModelExistsValidator extends AssetValidator

## Fields

- private static final ModelExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String model)
- @Override @Nonnull public String errorMessage(String model, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ModelExistsValidator required()
- @Nonnull public static ModelExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
