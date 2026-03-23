# ItemTool.DurabilityLossBlockTypes

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemTool.DurabilityLossBlockTypes

Inner class of `ItemTool` defining durability loss rates per block type. Maps block type names to durability loss multipliers via `BuilderCodec`.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public String[] getBlockTypes()
  public String[] getBlockSets()
  public double getDurabilityLossOnHit()
  public int[] getBlockTypeIndexes()
  public int[] getBlockSetIndexes()
  public String toString()

Fields:
public static final BuilderCodec<ItemTool.DurabilityLossBlockTypes> CODEC
protected String[] blockTypes
protected String[] blockSets
protected double durabilityLossOnHit
protected int[] blockTypeIndexes
protected int[] blockSetIndexes
