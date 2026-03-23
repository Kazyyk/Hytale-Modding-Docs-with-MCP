# ItemCategory

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemCategory

Item categorization for UI and sorting. Assigns items to display categories in the inventory and crafting interfaces.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public static AssetStore<String,ItemCategory,DefaultAssetMap<String,ItemCategory>> getAssetStore()
  public static DefaultAssetMap<String,ItemCategory> getAssetMap()
  public com.hypixel.hytale.protocol.ItemCategory toPacket()
  public String getId()
  public String getName()
  public String getIcon()
  public int getOrder()
  public ItemGridInfoDisplayMode getInfoDisplayMode()
  public ItemCategory[] getChildren()
  public String toString()

Fields:
private static final AssetBuilderCodec.Builder<String,ItemCategory> CODEC_BUILDER
public static final AssetBuilderCodec<String,ItemCategory> CODEC
private static AssetStore<String,ItemCategory,DefaultAssetMap<String,ItemCategory>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
protected String name
protected String icon
protected int order
protected ItemGridInfoDisplayMode infoDisplayMode
protected ItemCategory[] children
private SoftReference<com.hypixel.hytale.protocol.ItemCategory> cachedPacket
