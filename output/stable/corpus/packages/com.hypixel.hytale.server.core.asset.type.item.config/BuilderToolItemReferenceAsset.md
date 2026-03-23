# BuilderToolItemReferenceAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class BuilderToolItemReferenceAsset

Builder tool item reference asset. Links builder tool configurations to specific item assets for the builder tools system.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public static DefaultAssetMap<String,BuilderToolItemReferenceAsset> getAssetMap()
  public static AssetStore<String,BuilderToolItemReferenceAsset,DefaultAssetMap<String,BuilderToolItemReferenceAsset>> getAssetStore()
  public String[] getItems()
  public String getId()

Fields:
private static AssetStore<String,BuilderToolItemReferenceAsset,DefaultAssetMap<String,BuilderToolItemReferenceAsset>> ASSET_STORE
public static final AssetCodec<String,BuilderToolItemReferenceAsset> CODEC
private String id
protected String[] itemIds
private AssetExtraInfo.Data data
