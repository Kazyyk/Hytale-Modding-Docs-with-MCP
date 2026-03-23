# PortalKey

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class PortalKey

Portal key item configuration. Defines portal access requirements and destination world references for portal-activated items.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public String getPortalTypeId()
  public int getTimeLimitSeconds()
  public String toString()

Fields:
public static final BuilderCodec<PortalKey> CODEC
private String portalTypeId
private int timeLimitSeconds
