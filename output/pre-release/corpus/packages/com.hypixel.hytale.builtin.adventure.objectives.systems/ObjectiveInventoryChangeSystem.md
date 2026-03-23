# ObjectiveInventoryChangeSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.systems | Extends: EntityEventSystem<EntityStore, InventoryChangeEvent>

public class ObjectiveInventoryChangeSystem extends EntityEventSystem<EntityStore, InventoryChangeEvent>

ECS event system that listens for `InventoryChangeEvent` on entities with a `Player` component and notifies active objective tasks. Handles two responsibilities: removing players from objectives configured with `removeOnItemDrop` when the objective item is no longer in the player's inventory, and forwarding inventory change events to any active tasks that implement the `InventoryChangeAware` interface (such as `GatherObjectiveTask`).

## Constructors

- public ObjectiveInventoryChangeSystem()

## Methods

- public void handle(int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InventoryChangeEvent event)
- @Nullable @Override public Query<EntityStore> getQuery()

## Behavior

- The query filters to entities that have the `Player` component type.
- On each inventory change, iterates over the player's active objective UUIDs and:
  1. Calls `handleRemoveOnItemDrop` to check whether the player still holds the objective item. If the item is missing and the objective has `removeOnItemDrop` enabled, the player is removed from that objective.
  2. For each active objective, iterates the current tasks and delegates to `InventoryChangeAware.onInventoryChange` for tasks that implement it.

## Related Types

- ObjectivePlayerSetupSystem -- companion system for player setup
- ObjectiveItemEntityRemovalSystem -- companion system for item entity removal
- InventoryChangeAware -- interface for tasks that react to inventory changes
