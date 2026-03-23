# ItemQuality

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemQuality

Item quality/rarity configuration. Defines quality tiers (common, uncommon, rare, etc.) with associated colors and display properties.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public static AssetStore<String,ItemQuality,IndexedLookupTableAssetMap<String,ItemQuality>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,ItemQuality> getAssetMap()
  public String getId()
  public int getQualityValue()
  public String getItemTooltipTexture()
  public String getItemTooltipArrowTexture()
  public String getSlotTexture()
  public String getBlockSlotTexture()
  public String getSpecialSlotTexture()
  public Color getTextColor()
  public String getLocalizationKey()
  public boolean isVisibleQualityLabel()
  public boolean isRenderSpecialSlot()
  public boolean isHiddenFromSearch()
  public ItemEntityConfig getItemEntityConfig()
  public com.hypixel.hytale.protocol.ItemQuality toPacket()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ItemQuality> CODEC
public static final int DEFAULT_INDEX
public static final String DEFAULT_ID
public static final ItemQuality DEFAULT_ITEM_QUALITY
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ItemQuality,IndexedLookupTableAssetMap<String,ItemQuality>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected int qualityValue
protected String itemTooltipTexture
protected String itemTooltipArrowTexture
protected String slotTexture
protected String blockSlotTexture
protected String specialSlotTexture
protected Color textColor
protected String localizationKey
protected boolean visibleQualityLabel
protected boolean renderSpecialSlot
protected ItemEntityConfig itemEntityConfig
protected boolean hideFromSearch
private transient SoftReference<com.hypixel.hytale.protocol.ItemQuality> cachedPacket
