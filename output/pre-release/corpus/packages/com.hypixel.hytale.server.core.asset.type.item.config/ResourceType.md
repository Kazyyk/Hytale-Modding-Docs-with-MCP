# ResourceType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ResourceType

Resource type definition for material-based crafting. Allows recipes to accept any item of a given resource type rather than a specific item ID.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public static AssetStore<String,ResourceType,DefaultAssetMap<String,ResourceType>> getAssetStore()
  public static DefaultAssetMap<String,ResourceType> getAssetMap()
  public String getId()
  public String getName()
  public String getDescription()
  public String getIcon()
  public com.hypixel.hytale.protocol.ResourceType toPacket()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ResourceType> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ResourceType,DefaultAssetMap<String,ResourceType>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected String name
protected String description
protected String icon
private SoftReference<com.hypixel.hytale.protocol.ResourceType> cachedPacket
