# LivingEntity

Type: class | Package: com.hypixel.hytale.server.core.entity | Extends: Entity

public abstract class LivingEntity extends Entity

Abstract base class for entities with health, inventory, equipment, and stat modifiers. Extends `Entity` and adds an `Inventory` (deserialized via codec), a `StatModifiersManager` for equipment-based stat calculations, fall distance tracking, and armor inventory change event handling. Subclasses must implement `createDefaultInventory()`. Provides breathing logic that checks invulnerability and fluid/material state.

Known subclasses: NPCEntity, Player

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public boolean canBreathe(Ref<EntityStore> ref, BlockMaterial breathingMaterial, int fluidId, ComponentAccessor<EntityStore> componentAccessor)
  public static long getPackedMaterialAndFluidAtBreathingHeight(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public Inventory getInventory()
  private Inventory setInventory(Inventory inventory)
  public void moveTo(Ref<EntityStore> ref, double locX, double locY, double locZ, ComponentAccessor<EntityStore> componentAccessor)
  public static ItemStackSlotTransaction decreaseItemStackDurability(Ref<EntityStore> ref, ItemStack itemStack, int inventoryId, int slotId, ComponentAccessor<EntityStore> componentAccessor)
  public ItemStackSlotTransaction updateItemStackDurability(Ref<EntityStore> ref, ItemStack itemStack, ItemContainer container, int slotId, double durabilityChange, ComponentAccessor<EntityStore> componentAccessor)
  public void invalidateEquipmentNetwork()
  public boolean consumeEquipmentNetworkOutdated()
  public double getCurrentFallDistance()
  public void setCurrentFallDistance(double currentFallDistance)
  public String toString()

Fields:
public static final BuilderCodec<LivingEntity> CODEC
public static final int DEFAULT_ITEM_THROW_SPEED
private Inventory inventory
protected double currentFallDistance
private boolean isEquipmentNetworkOutdated
