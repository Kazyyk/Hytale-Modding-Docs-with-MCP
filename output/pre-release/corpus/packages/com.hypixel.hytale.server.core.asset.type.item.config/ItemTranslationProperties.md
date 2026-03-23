# ItemTranslationProperties

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemTranslationProperties

Localization properties for items. Stores translation keys and display text overrides used for item names and descriptions in different languages.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public String getName()
  public String getDescription()
  public com.hypixel.hytale.protocol.ItemTranslationProperties toPacket()
  public String toString()

Fields:
public static final BuilderCodec<ItemTranslationProperties> CODEC
private String name
private String description
