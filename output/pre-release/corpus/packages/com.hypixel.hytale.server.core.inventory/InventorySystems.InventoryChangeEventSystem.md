# InventorySystems.InventoryChangeEventSystem

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: EntityTickingSystem<EntityStore>

public abstract static class InventorySystems.InventoryChangeEventSystem extends EntityTickingSystem<EntityStore>

Abstract generic base system. Polls `ItemContainerChangeEvent` from the queued change events on the inventory component, wraps each into an `InventoryChangeEvent`, and invokes it on the entity via the command buffer.

## Relationships

- Part of InventorySystems
- Operates on InventoryComponent subclasses
