# ItemToolSpec

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemToolSpec

Tool specification defining the exact capabilities of a tool type. Maps tool actions to efficiency values and compatible block categories.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle (and 10 more)

Complete API:
  public static AssetStore<String,ItemToolSpec,DefaultAssetMap<String,ItemToolSpec>> getAssetStore()
  public static DefaultAssetMap<String,ItemToolSpec> getAssetMap()
  protected void processConfig()
  public com.hypixel.hytale.protocol.ItemToolSpec toPacket()
  public String getId()
  public String getGatherType()
  public float getPower()
  public int getQuality()
  public boolean isIncorrect()
  public int getHitSoundLayerIndex()
  public String toString()

Fields:
public static final AssetCodec<String,ItemToolSpec> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ItemToolSpec,DefaultAssetMap<String,ItemToolSpec>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String gatherType
protected float power
protected int quality
protected boolean incorrect
protected String hitSoundLayerId
protected transient int hitSoundLayerIndex
private SoftReference<com.hypixel.hytale.protocol.ItemToolSpec> cachedPacket
