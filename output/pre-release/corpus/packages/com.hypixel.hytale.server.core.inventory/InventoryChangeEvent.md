# InventoryChangeEvent

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: EcsEvent

public class InventoryChangeEvent extends EcsEvent

ECS event fired when an inventory component's item container changes. Carries the component type that changed, the inventory component instance, the affected item container, and the transaction that caused the change. Dispatched by the various `InventoryChangeEventSystem` implementations during entity ticking.

## Constructors

- public InventoryChangeEvent(ComponentType<EntityStore, ? extends InventoryComponent> componentType, InventoryComponent inventory, ItemContainer itemContainer, Transaction transaction)

## Methods

- public ComponentType<EntityStore, ? extends InventoryComponent> getComponentType()
- public InventoryComponent getInventory()
- public ItemContainer getItemContainer()
- public Transaction getTransaction()

## Relationships

- Extends `EcsEvent`
- Dispatched by InventorySystems inner event systems
- References InventoryComponent and `ItemContainer`

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public ComponentType<EntityStore,? extends InventoryComponent> getComponentType()
  public InventoryComponent getInventory()
  public ItemContainer getItemContainer()
  public Transaction getTransaction()

Fields:
private final ComponentType<EntityStore,? extends InventoryComponent> componentType
private final InventoryComponent inventory
private final ItemContainer itemContainer
private final Transaction transaction
