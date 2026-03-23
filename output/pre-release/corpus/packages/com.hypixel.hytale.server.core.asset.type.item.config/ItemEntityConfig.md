# ItemEntityConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config

public class ItemEntityConfig

Entity spawning configuration for items. Defines how an item spawns as a dropped entity in the world, including model, physics, and despawn settings.

Also in this package: AssetIconProperties, BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public PhysicsValues getPhysicsValues()
  public float getPickupRadius()
  public Float getTtl()
  public com.hypixel.hytale.protocol.ItemEntityConfig toPacket()
  public String toString()

Fields:
public static final String DEFAULT_PARTICLE_SYSTEM_ID
public static final ItemEntityConfig DEFAULT
public static final ItemEntityConfig DEFAULT_BLOCK
public static final BuilderCodec<ItemEntityConfig> CODEC
protected PhysicsValues physicsValues
protected float pickupRadius
protected Float ttl
protected String particleSystemId
protected Color particleColor
protected boolean showItemParticles
