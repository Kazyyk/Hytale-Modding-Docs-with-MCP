# InventorySystems

Type: class | Package: com.hypixel.hytale.server.core.inventory

public class InventorySystems

Container class for ECS systems that process inventory change events. Each inner system polls queued change events from a specific `InventoryComponent` subtype and dispatches InventoryChangeEvent via the command buffer. Also includes legacy stat-recalculation systems and a player-specific hotbar save system.

## Inner Classes

- InventorySystems.ArmorChangeEventSystem | InventoryChangeEventSystem | Dispatches change events for armor inventory
- InventorySystems.BackpackChangeEventSystem | InventoryChangeEventSystem | Dispatches change events for backpack inventory
- InventorySystems.HotbarChangeEventSystem | InventoryChangeEventSystem | Dispatches change events for hotbar inventory
- InventorySystems.InventoryChangeEventSystem | EntityTickingSystem<EntityStore> | Abstract base that polls change events and invokes InventoryChangeEvent
- InventorySystems.LegacyArmorChangeStatSystem | EntityTickingSystem<EntityStore> | Deprecated. Recalculates stats on armor changes
- InventorySystems.LegacyHotbarChangeStatSystem | EntityTickingSystem<EntityStore> | Deprecated. Recalculates stats on hotbar changes
- InventorySystems.LegacyUtilityChangeStatSystem | EntityTickingSystem<EntityStore> | Deprecated. Recalculates stats on utility changes
- InventorySystems.PlayerInventoryChangeEventSystem | EntityEventSystem<EntityStore, InventoryChangeEvent> | Saves creative hotbar on change
- InventorySystems.StorageChangeEventSystem | InventoryChangeEventSystem | Dispatches change events for storage inventory
- InventorySystems.ToolChangeEventSystem | InventoryChangeEventSystem | Dispatches change events for tool inventory
- InventorySystems.UtilityChangeEventSystem | InventoryChangeEventSystem | Dispatches change events for utility inventory

## Relationships

- Dispatches InventoryChangeEvent
- Operates on InventoryComponent subclasses
