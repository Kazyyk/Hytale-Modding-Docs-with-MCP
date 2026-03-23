# InventorySystems.InventoryChangeEventSystem

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: EntityTickingSystem<EntityStore>

public abstract static class InventorySystems.InventoryChangeEventSystem extends EntityTickingSystem<EntityStore>

Abstract generic base system. Polls `ItemContainerChangeEvent` from the queued change events on the inventory component, wraps each into an `InventoryChangeEvent`, and invokes it on the entity via the command buffer.

## Relationships

- Part of InventorySystems
- Operates on InventoryComponent subclasses

Known subclasses: ArmorChangeEventSystem, BackpackChangeEventSystem, HotbarChangeEventSystem, StorageChangeEventSystem, ToolChangeEventSystem, UtilityChangeEventSystem

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()

Fields:
protected final ComponentType<EntityStore,Inv> componentType
