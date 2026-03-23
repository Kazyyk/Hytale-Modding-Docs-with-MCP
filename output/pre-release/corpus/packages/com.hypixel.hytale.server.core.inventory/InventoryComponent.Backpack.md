# InventoryComponent.Backpack

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: InventoryComponent | Implements: Component<EntityStore>

public static class InventoryComponent.Backpack extends InventoryComponent implements Component<EntityStore>

Resizable backpack inventory section. Can be dynamically resized via `resize()`. Extends InventoryComponent.

## Static Fields

- public static BuilderCodec<InventoryComponent.Backpack> CODEC

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Backpack> getComponentType()
- public void resize(short capacity, List<ItemStack> remainder)
- public Component<EntityStore> clone()

Also in this package: Armor, ArmorChangeEventSystem, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public static ComponentType<EntityStore,InventoryComponent.Backpack> getComponentType()
  public void resize(short capacity, List<ItemStack> remainder)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<InventoryComponent.Backpack> CODEC
