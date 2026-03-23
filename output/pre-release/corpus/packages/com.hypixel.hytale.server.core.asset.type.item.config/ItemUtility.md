# ItemUtility

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemUtility

Utility item configuration. Defines consumable/usable item behaviors that are neither weapons, tools, nor armor.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public boolean isUsable()
  public boolean isCompatible()
  public Int2ObjectMap<StaticModifier[]> getStatModifiers()
  public int[] getEntityStatsToClear()
  public com.hypixel.hytale.protocol.ItemUtility toPacket()
  public String toString()

Fields:
public static final ItemUtility DEFAULT
public static final BuilderCodec<ItemUtility> CODEC
protected boolean usable
protected boolean compatible
protected Map<String,StaticModifier[]> rawStatModifiers
protected Int2ObjectMap<StaticModifier[]> statModifiers
protected String[] rawEntityStatsToClear
protected int[] entityStatsToClear
