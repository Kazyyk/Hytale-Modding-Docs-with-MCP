# InventoryComponent.Combined

Type: class | Package: com.hypixel.hytale.server.core.inventory | Implements: Component<EntityStore>

public static class InventoryComponent.Combined implements Component<EntityStore>

Cache component that stores `CombinedItemContainer` views keyed by arrays of component types. Avoids recomputing combined views repeatedly. Extends nothing; implements `Component<EntityStore>`.

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Combined> getComponentType()
- public Component<EntityStore> clone()

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public static ComponentType<EntityStore,InventoryComponent.Combined> getComponentType()
  public Component<EntityStore> clone()

Fields:
private final Object2ObjectOpenCustomHashMap<ComponentType[],CombinedItemContainer> inventories
