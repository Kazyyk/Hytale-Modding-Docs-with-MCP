# ItemArmor

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemArmor

Armor configuration for items. Defines defense value, armor slot, armor set bonuses, and visual appearance when equipped.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public com.hypixel.hytale.protocol.ItemArmor toPacket()
  public ItemArmorSlot getArmorSlot()
  public double getBaseDamageResistance()
  public Int2ObjectMap<List<RegeneratingValue>> getRegeneratingValues()
  public Int2ObjectMap<StaticModifier[]> getStatModifiers()
  public Map<DamageCause,StaticModifier[]> getDamageResistanceValues()
  public Map<DamageCause,StaticModifier[]> getDamageEnhancementValues()
  public Map<DamageClass,StaticModifier[]> getDamageClassEnhancement()
  public Map<DamageCause,Float> getKnockbackEnhancements()
  public Map<DamageCause,Float> getKnockbackResistances()
  public Int2ObjectMap<StaticModifier> getInteractionModifier(String Key)
  private static void processConfig(ItemArmor item)
  private static void processStatModifiers(ItemArmor item)
  private static void processRegenModifiers(ItemArmor item)
  private static void processInteractionModifiers(ItemArmor item)
  public static Map<DamageCause,T> convertStringKeyToDamageCause(Map<String,T> rawData)
  public String toString()

Fields:
public static final BuilderCodec<ItemArmor> CODEC
protected ItemArmorSlot armorSlot
protected Map<String,StaticModifier[]> damageResistanceValuesRaw
protected Map<DamageCause,StaticModifier[]> damageResistanceValues
protected Map<String,StaticModifier[]> damageEnhancementValuesRaw
protected Map<DamageCause,StaticModifier[]> damageEnhancementValues
protected double baseDamageResistance
protected Map<String,StaticModifier[]> rawStatModifiers
protected Int2ObjectMap<StaticModifier[]> statModifiers
protected Cosmetic[] cosmeticsToHide
protected Map<String,EntityStatType.Regenerating[]> regenerating
protected Int2ObjectMap<List<RegeneratingValue>> regeneratingValues
protected Map<String,Float> knockbackResistancesRaw
protected Map<DamageCause,Float> knockbackResistances
protected Map<String,Float> knockbackEnhancementsRaw
protected Map<DamageCause,Float> knockbackEnhancements
protected Map<String,Map<String,StaticModifier>> interactionModifiersRaw
protected Map<String,Int2ObjectMap<StaticModifier>> interactionModifiers
protected Map<DamageClass,StaticModifier[]> damageClassEnhancement
