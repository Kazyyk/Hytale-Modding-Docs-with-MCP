# ItemTool

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemTool

Tool configuration for items. Defines tool type, mining speed, durability loss settings, block type targeting, and tool-specific behaviors. Contains the inner class `DurabilityLossBlockTypes` for per-block-type durability configuration.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 8 more)

Complete API:
  protected void processConfig()
  public com.hypixel.hytale.protocol.ItemTool toPacket()
  public ItemToolSpec[] getSpecs()
  public float getSpeed()
  public ItemTool.DurabilityLossBlockTypes[] getDurabilityLossBlockTypes()
  public int getHitSoundLayerIndex()
  public int getIncorrectMaterialSoundLayerIndex()
  public String toString()

Fields:
public static final BuilderCodec<ItemTool> CODEC
protected ItemToolSpec[] specs
protected float speed
protected ItemTool.DurabilityLossBlockTypes[] durabilityLossBlockTypes
protected String hitSoundLayerId
protected transient int hitSoundLayerIndex
protected String incorrectMaterialSoundLayerId
protected transient int incorrectMaterialSoundLayerIndex
