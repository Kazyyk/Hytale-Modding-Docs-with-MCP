# BlockSetExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class BlockSetExistsValidator extends AssetValidator

## Fields

- private static final BlockSetExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String blockSet)
- @Override @Nonnull public String errorMessage(String blockSet, String attribute)
- @Override @Nonnull public String getAssetName()
- public static BlockSetExistsValidator required()
- @Nonnull public static BlockSetExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
