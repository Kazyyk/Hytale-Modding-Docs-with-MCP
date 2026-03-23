# ItemStackContainerConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemStackContainerConfig

Configuration for items that act as containers (e.g., bags, pouches). Defines capacity, filter rules, and UI layout for the contained inventory.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public short getCapacity()
  public FilterType getGlobalFilter()
  public int getTagIndex()
  public String toString()

Fields:
public static final ItemStackContainerConfig DEFAULT
public static final BuilderCodec<ItemStackContainerConfig> CODEC
protected short capacity
protected FilterType globalFilter
protected String tag
protected volatile int tagIndex
