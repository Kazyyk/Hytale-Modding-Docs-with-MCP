# ItemDropListExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ItemDropListExistsValidator extends AssetValidator

## Fields

- private static final ItemDropListExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- public static ItemDropListExistsValidator required()
- @Nonnull public static ItemDropListExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
