# ItemDropList

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ItemDropList>>

public class ItemDropList implements JsonAssetWithMap<String, DefaultAssetMap<String, ItemDropList>>

Named drop list asset. A reusable collection of `ItemDropContainer` entries that can be referenced by ID across multiple drop sources. Loaded from JSON and registered in a `DefaultAssetMap`.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public static AssetStore<String,ItemDropList,DefaultAssetMap<String,ItemDropList>> getAssetStore()
  public static DefaultAssetMap<String,ItemDropList> getAssetMap()
  public String getId()
  public ItemDropContainer getContainer()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ItemDropList> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ItemDropList,DefaultAssetMap<String,ItemDropList>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected ItemDropContainer container
