# Item

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, Item>>, NetworkSerializable<ItemBase>

public class Item implements JsonAssetWithMap<String, DefaultAssetMap<String, Item>>, NetworkSerializable<ItemBase>

Primary item asset definition. Central configuration class for all items in the game, loaded from JSON via `BuilderCodec`. Defines item identity, appearance, behavior (weapon, tool, armor, glider, utility), interactions, sounds, models, resource types, crafting categories, and placement rules. Provides static asset map access for runtime lookup by string ID or integer index.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public static AssetStore<String,Item,DefaultAssetMap<String,Item>> getAssetStore()
  public static DefaultAssetMap<String,Item> getAssetMap()
  public ItemBase toPacket()
  public String getItemIdForState(String state)
  public Item getItemForState(String state)
  public boolean isState()
  public String getStateForItem(Item item)
  public String getStateForItem(String key)
  public AssetExtraInfo.Data getData()
  public String getId()
  public String getBlockId()
  public String getTranslationKey()
  public String getDescriptionTranslationKey()
  public String getModel()
  public String getTexture()
  public boolean isConsumable()
  public boolean isVariant()
  public boolean getUsePlayerAnimations()
  public String getPlayerAnimationsId()
  public String getIcon()
  public AssetIconProperties getIconProperties()
  public ItemTranslationProperties getTranslationProperties()
  public float getScale()
  public String getReticleId()
  public int getItemLevel()
  public int getMaxStack()
  public int getQualityIndex()
  public ItemTool getTool()
  public BlockSelectorToolData getBlockSelectorToolData()
  public BuilderTool getBuilderTool()
  public ItemArmor getArmor()
  public ItemGlider getGlider()
  public ItemUtility getUtility()
  public PortalKey getPortalKey()
  public ItemStackContainerConfig getItemStackContainerConfig()
  public String[] getCategories()
  public String getSubCategory()
  public String getSoundEventId()
  public int getSoundEventIndex()
  public boolean hasBlockType()
  public ItemWeapon getWeapon()
  public ItemResourceType[] getResourceTypes()
  public double getMaxDurability()
  public ColorLight getLight()
  public Map<InteractionType,String> getInteractions()
  public Map<String,String> getInteractionVars()
  public ItemEntityConfig getItemEntityConfig()
  public String getDroppedItemAnimation()
  public double getDurabilityLossOnHit()
  public boolean getDurabilityLossOnDeath()
  public int[] getDisplayEntityStatsHUD()
  public ItemPullbackConfig getPullbackConfig()
  public boolean getClipsGeometry()
  public boolean getRenderDeployablePreview()
  public double getFuelQuality()
  public InteractionConfiguration getInteractionConfig()
  public int getItemSoundSetIndex()
  public void collectRecipesToGenerate(Collection<CraftingRecipe> recipes)
  public boolean hasRecipesToGenerate()
  public boolean dropsOnDeath()
  protected void processConfig()

Fields:
private static final AssetBuilderCodec.Builder<String,Item> CODEC_BUILDER
public static final AssetCodec<String,Item> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,Item,DefaultAssetMap<String,Item>> ASSET_STORE
public static final String UNKNOWN_TEXTURE
public static final Item UNKNOWN
protected AssetExtraInfo.Data data
protected String id
protected String icon
protected AssetIconProperties iconProperties
protected ItemTranslationProperties translationProperties
protected String reticleId
protected int reticleIndex
protected int itemLevel
protected int maxStack
protected String qualityId
protected int qualityIndex
protected CraftingRecipe recipeToGenerate
protected String blockId
protected boolean hasBlockType
protected boolean consumable
protected boolean variant
protected ItemTool tool
protected BlockSelectorToolData blockSelectorToolData
protected BuilderTool builderTool
protected ItemWeapon weapon
protected ItemArmor armor
protected ItemGlider glider
protected ItemUtility utility
protected ItemStackContainerConfig itemStackContainerConfig
protected PortalKey portalKey
protected String playerAnimationsId
protected boolean usePlayerAnimations
protected String model
protected float scale
protected String texture
protected String animation
protected String[] categories
protected String subCategory
protected String set
protected String soundEventId
protected transient int soundEventIndex
protected String itemSoundSetId
protected transient int itemSoundSetIndex
protected ModelParticle[] particles
protected ModelParticle[] firstPersonParticles
protected ModelTrail[] trails
protected ColorLight light
protected ItemResourceType[] resourceTypes
protected Map<String,String> stateToBlock
protected Map<String,String> blockToState
protected Map<InteractionType,String> interactions
protected Map<String,String> interactionVars
protected InteractionConfiguration interactionConfig
protected ItemEntityConfig itemEntityConfig
protected String droppedItemAnimation
protected double maxDurability
protected double fuelQuality
protected double durabilityLossOnHit
protected Map<String,ItemAppearanceCondition[]> itemAppearanceConditions
protected String[] rawDisplayEntityStatsHUD
protected int[] displayEntityStatsHUD
protected ItemPullbackConfig pullbackConfig
protected boolean clipsGeometry
protected boolean renderDeployablePreview
protected ItemHudUI[] hudUI
protected boolean dropOnDeath
protected boolean durabilityLossOnDeath
private transient SoftReference<ItemBase> cachedPacket
