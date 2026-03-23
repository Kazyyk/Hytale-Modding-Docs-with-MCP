# ShopExistsValidator

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcshop.npc | Extends: AssetValidator

public class ShopExistsValidator extends AssetValidator

## Fields

- private static final ShopExistsValidator DEFAULT_INSTANCE

## Methods

- @Nonnull @Override public String getDomain()
- @Override public boolean test(String marker)
- @Nonnull @Override public String errorMessage(String marker, String attributeName)
- @Nonnull @Override public String getAssetName()
- public static ShopExistsValidator required()
- @Nonnull public static ShopExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: ActionOpenBarterShop, ActionOpenShop, BarterShopExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String marker)
  public String errorMessage(String marker, String attributeName)
  public String getAssetName()
  public static ShopExistsValidator required()
  public static ShopExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final ShopExistsValidator DEFAULT_INSTANCE
