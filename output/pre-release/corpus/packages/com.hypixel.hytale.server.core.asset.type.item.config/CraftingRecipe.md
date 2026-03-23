# CraftingRecipe

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, CraftingRecipe>>

public class CraftingRecipe implements JsonAssetWithMap<String, DefaultAssetMap<String, CraftingRecipe>>

Crafting recipe asset definition. Specifies input materials, output items, bench requirements, crafting time, knowledge requirements, memory level requirements, and fieldcraft category. Loaded from JSON and registered in a `DefaultAssetMap` for runtime lookup.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public static AssetStore<String,CraftingRecipe,DefaultAssetMap<String,CraftingRecipe>> getAssetStore()
  public static DefaultAssetMap<String,CraftingRecipe> getAssetMap()
  public static String generateIdFromItemRecipe(Item item, int i)
  public com.hypixel.hytale.protocol.CraftingRecipe toPacket(String id)
  private void processConfig()
  public MaterialQuantity[] getInput()
  public MaterialQuantity[] getOutputs()
  public BenchRequirement[] getBenchRequirement()
  public float getTimeSeconds()
  public boolean isKnowledgeRequired()
  public int getRequiredMemoriesLevel()
  public MaterialQuantity getPrimaryOutput()
  public boolean isRestrictedByBenchTierLevel(String benchId, int tierLevel)
  public String toString()
  public String getId()

Fields:
public static final String FIELDCRAFT_REQUIREMENT
public static final AssetBuilderCodec<String,CraftingRecipe> CODEC
private static final MaterialQuantity[] EMPTY_OUTPUT
private static AssetStore<String,CraftingRecipe,DefaultAssetMap<String,CraftingRecipe>> ASSET_STORE
private AssetExtraInfo.Data data
protected String id
protected MaterialQuantity[] input
protected MaterialQuantity[] outputs
protected MaterialQuantity primaryOutput
protected int primaryOutputQuantity
protected BenchRequirement[] benchRequirement
protected float timeSeconds
protected boolean knowledgeRequired
protected int requiredMemoriesLevel
