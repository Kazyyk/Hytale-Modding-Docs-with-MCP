# ItemWeapon

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemWeapon

Weapon configuration for items. Defines damage values, attack speed, knockback, range, and weapon-type-specific behaviors (melee, ranged, thrown).

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 8 more)

Complete API:
  public Int2ObjectMap<StaticModifier[]> getStatModifiers()
  public int[] getEntityStatsToClear()
  public com.hypixel.hytale.protocol.ItemWeapon toPacket()
  public String toString()

Fields:
public static final BuilderCodec<ItemWeapon> CODEC
protected Map<String,StaticModifier[]> rawStatModifiers
protected Int2ObjectMap<StaticModifier[]> statModifiers
protected String[] rawEntityStatsToClear
protected int[] entityStatsToClear
protected boolean renderDualWielded
