# ItemExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ItemExistsValidator extends AssetValidator

## Fields

- private static final ItemExistsValidator DEFAULT_INSTANCE
- public static final String DROPLIST_PREFIX
- private boolean requireBlock
- private boolean allowDroplist

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String item)
- @Override @Nonnull public String errorMessage(String item, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ItemExistsValidator required()
- @Nonnull public static ItemExistsValidator requireBlock()
- @Nonnull public static ItemExistsValidator orDroplist()
- @Nonnull public static ItemExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
- @Nonnull public static ItemExistsValidator orDroplistWithConfig(EnumSet<AssetValidator.Config> config)
