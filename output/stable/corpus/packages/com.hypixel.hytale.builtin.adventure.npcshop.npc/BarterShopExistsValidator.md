# BarterShopExistsValidator

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcshop.npc | Extends: AssetValidator

public class BarterShopExistsValidator extends AssetValidator

## Fields

- private static final BarterShopExistsValidator DEFAULT_INSTANCE

## Methods

- @Nonnull @Override public String getDomain()
- @Override public boolean test(String marker)
- @Nonnull @Override public String errorMessage(String marker, String attributeName)
- @Nonnull @Override public String getAssetName()
- public static BarterShopExistsValidator required()
- @Nonnull public static BarterShopExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
