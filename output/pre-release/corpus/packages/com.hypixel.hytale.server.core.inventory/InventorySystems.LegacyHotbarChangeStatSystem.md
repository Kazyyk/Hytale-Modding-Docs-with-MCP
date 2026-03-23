# InventorySystems.LegacyHotbarChangeStatSystem

Type: class | Package: com.hypixel.hytale.server.core.inventory | Extends: EntityTickingSystem<EntityStore>

public static class InventorySystems.LegacyHotbarChangeStatSystem extends EntityTickingSystem<EntityStore>

Deprecated (for removal). Recalculates stats and clears weapon entity stats when the active hotbar slot item changes.

## Relationships

- Part of InventorySystems
- Operates on InventoryComponent subclasses

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata, PlayerInventoryChangeEventSystem (and 7 more)

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()

Fields:
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
