# InventorySystems.LegacyArmorChangeStatSystem

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: EntityTickingSystem<EntityStore>

public static class InventorySystems.LegacyArmorChangeStatSystem extends EntityTickingSystem<EntityStore>

Deprecated (for removal). Invalidates equipment network and schedules stat recalculation when armor inventory change events are pending.

## Relationships

- Part of InventorySystems
- Operates on InventoryComponent subclasses

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()

Fields:
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
