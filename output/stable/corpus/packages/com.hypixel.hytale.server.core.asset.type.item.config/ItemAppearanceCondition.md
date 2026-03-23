# ItemAppearanceCondition

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemAppearanceCondition

Conditional appearance configuration for items. Defines conditions under which an item changes its visual appearance (model, texture) based on game state.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemReticleWithDuration (and 8 more)

Complete API:
  public ModelParticle[] getParticles()
  public String getModel()
  public String getTexture()
  public FloatRange getCondition()
  public ValueType getConditionValueType()
  public String getModelVFXId()
  public String getWorldSoundEventId()
  public int getWorldSoundEventIndex()
  public String getLocalSoundEventId()
  public int getLocalSoundEventIndex()
  public com.hypixel.hytale.protocol.ItemAppearanceCondition toPacket()
  public String toString()

Fields:
public static final BuilderCodec<ItemAppearanceCondition> CODEC
protected ModelParticle[] particles
protected ModelParticle[] firstPersonParticles
protected String worldSoundEventId
protected transient int worldSoundEventIndex
protected String localSoundEventId
protected transient int localSoundEventIndex
protected String model
protected String texture
protected FloatRange condition
protected ValueType conditionValueType
protected String modelVFXId
