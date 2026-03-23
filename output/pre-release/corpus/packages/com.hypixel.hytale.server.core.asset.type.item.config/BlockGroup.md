# BlockGroup

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class BlockGroup

Block group definition. Groups multiple block types under a named category for crafting recipes, tool behaviors, and UI organization. Serialized to clients via `BlockGroupPacketGenerator`.

Also in this package: AssetIconProperties, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public static BlockGroup findItemGroup(Item item)
  public String getId()
  public String get(int index)
  public int size()
  public int getIndex(Item item)
  public com.hypixel.hytale.protocol.BlockGroup toPacket()

Fields:
private static final String[] DEFAULT_BLOCK_LIST
public static final AssetCodec<String,BlockGroup> CODEC
private String id
private AssetExtraInfo.Data data
private String[] blocks
