# InventorySystems.PlayerInventoryChangeEventSystem

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: EntityEventSystem<EntityStore, InventoryChangeEvent>

public static class InventorySystems.PlayerInventoryChangeEventSystem extends EntityEventSystem<EntityStore, InventoryChangeEvent>

Handles `InventoryChangeEvent` for players. In Creative mode, auto-saves the hotbar when the hotbar container changes.

## Relationships

- Part of InventorySystems
- Operates on InventoryComponent subclasses

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata (and 7 more)

Complete API:
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, InventoryChangeEvent event)
  public Query<EntityStore> getQuery()
