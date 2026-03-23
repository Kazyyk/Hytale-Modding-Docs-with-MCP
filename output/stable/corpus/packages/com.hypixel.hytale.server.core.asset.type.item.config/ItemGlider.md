# ItemGlider

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemGlider

Glider configuration for items. Defines glide physics parameters such as lift, drag, and speed limits.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public float getTerminalVelocity()
  public float getFallSpeedMultiplier()
  public float getHorizontalSpeedMultiplier()
  public float getSpeed()
  public com.hypixel.hytale.protocol.ItemGlider toPacket()

Fields:
public static final BuilderCodec<ItemGlider> CODEC
protected float terminalVelocity
protected float fallSpeedMultiplier
protected float horizontalSpeedMultiplier
protected float speed
