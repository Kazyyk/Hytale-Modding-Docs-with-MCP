# InventoryComponent.Hotbar

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: InventoryComponent | Implements: Component<EntityStore>

public static class InventoryComponent.Hotbar extends InventoryComponent implements Component<EntityStore>

Hotbar inventory section with active slot tracking. Tracks which slot is currently selected by the player. Extends InventoryComponent.

## Static Fields

- public static BuilderCodec<InventoryComponent.Hotbar> CODEC

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Hotbar> getComponentType()
- public byte getActiveSlot()
- public void setActiveSlot(byte activeSlot)
- public ItemStack getActiveItem()
- public void ensureCapacity(short capacity, List<ItemStack> remainder)
- public Component<EntityStore> clone()

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public static ComponentType<EntityStore,InventoryComponent.Hotbar> getComponentType()
  public void ensureCapacity(short capacity, List<ItemStack> remainder)
  private void afterDecode()
  public byte getActiveSlot()
  public void setActiveSlot(byte activeSlot)
  public ItemStack getActiveItem()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<InventoryComponent.Hotbar> CODEC
protected byte activeSlot
