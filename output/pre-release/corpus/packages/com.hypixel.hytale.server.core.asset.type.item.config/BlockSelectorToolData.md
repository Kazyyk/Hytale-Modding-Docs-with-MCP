# BlockSelectorToolData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class BlockSelectorToolData

Configuration for block selector tools (creative/builder mode). Defines block selection UI behavior and filtering.

Also in this package: AssetIconProperties, BlockGroup, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public com.hypixel.hytale.protocol.BlockSelectorToolData toPacket()
  public double getDurabilityLossOnUse()

Fields:
public static final BuilderCodec<BlockSelectorToolData> CODEC
protected double durabilityLossOnUse
