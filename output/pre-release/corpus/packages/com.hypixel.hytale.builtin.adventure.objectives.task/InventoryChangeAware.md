# InventoryChangeAware

Type: interface | Package: com.hypixel.hytale.builtin.adventure.objectives.task

public interface InventoryChangeAware

Marker interface for objective tasks that need to react to player inventory changes. Implemented by task types that track item counts (e.g., `GatherObjectiveTask`). The `ObjectiveInventoryChangeSystem` invokes `onInventoryChange` on tasks that implement this interface whenever an `InventoryChangeEvent` fires for a player with active objectives.

## Methods

- void onInventoryChange(@Nonnull Objective var1, @Nonnull Ref<EntityStore> var2, @Nonnull Store<EntityStore> var3, @Nonnull InventoryChangeEvent var4)

## Known Implementations

- GatherObjectiveTask -- recounts objective items across all participating player inventories on each change

## Related Types

- ObjectiveInventoryChangeSystem -- the system that dispatches to this interface
