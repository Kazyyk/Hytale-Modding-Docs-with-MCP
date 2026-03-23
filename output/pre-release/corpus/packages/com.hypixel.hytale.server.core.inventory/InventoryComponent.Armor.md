# InventoryComponent.Armor

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: InventoryComponent | Implements: Component<EntityStore>

public static class InventoryComponent.Armor extends InventoryComponent implements Component<EntityStore>

Armor inventory section. Applies armor-specific slot filters after decode. Extends InventoryComponent.

## Static Fields

- public static BuilderCodec<InventoryComponent.Armor> CODEC

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Armor> getComponentType()
- public void ensureCapacity(short capacity, List<ItemStack> remainder)
- public Component<EntityStore> clone()

Also in this package: ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public static ComponentType<EntityStore,InventoryComponent.Armor> getComponentType()
  private void afterDecode()
  public void ensureCapacity(short capacity, List<ItemStack> remainder)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<InventoryComponent.Armor> CODEC
