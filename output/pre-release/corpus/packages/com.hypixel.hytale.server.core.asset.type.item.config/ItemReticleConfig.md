# ItemReticleConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemReticleConfig

Reticle configuration for items. Defines crosshair/reticle appearance and behavior when an item is equipped, including duration-based reticle changes.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public static AssetStore<String,ItemReticleConfig,IndexedLookupTableAssetMap<String,ItemReticleConfig>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,ItemReticleConfig> getAssetMap()
  protected void processConfig()
  public String getId()
  public com.hypixel.hytale.protocol.ItemReticleConfig toPacket()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,ItemReticleConfig> CODEC
public static final int DEFAULT_INDEX
public static final String DEFAULT_ID
public static final ItemReticleConfig DEFAULT
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ItemReticleConfig,IndexedLookupTableAssetMap<String,ItemReticleConfig>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected String[] base
protected Map<String,ItemReticleConfig.ItemReticleWithDuration> serverEvents
protected Int2ObjectMap<ItemReticleConfig.ItemReticleWithDuration> indexedServerEvents
protected Map<ItemReticleClientEvent,ItemReticleConfig.ItemReticle> clientEvents
private SoftReference<com.hypixel.hytale.protocol.ItemReticleConfig> cachedPacket
