# ItemDrop

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemDrop

Single item drop definition. Specifies an item ID, quantity range, and chance for a drop entry. Used by `ItemDropContainer` and loot table systems.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public String getItemId()
  public BsonDocument getMetadata()
  public int getQuantityMin()
  public int getQuantityMax()
  public int getRandomQuantity(Random random)
  public String toString()

Fields:
public static final BuilderCodec<ItemDrop> CODEC
protected String itemId
protected BsonDocument metadata
protected int quantityMin
protected int quantityMax
