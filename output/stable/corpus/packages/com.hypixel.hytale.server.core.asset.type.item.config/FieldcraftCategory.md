# FieldcraftCategory

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class FieldcraftCategory

Fieldcraft category definition for pocket/field crafting. Organizes fieldcraft recipes into named categories for the field crafting UI.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public static DefaultAssetMap<String,FieldcraftCategory> getAssetMap()
  public com.hypixel.hytale.protocol.ItemCategory toPacket()
  public String getId()
  public String getName()
  public String getIcon()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,FieldcraftCategory> CODEC
private static DefaultAssetMap<String,FieldcraftCategory> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected String name
protected String icon
protected int order
private SoftReference<com.hypixel.hytale.protocol.ItemCategory> cachedPacket
