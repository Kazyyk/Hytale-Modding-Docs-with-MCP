# EntityInteractableSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class EntityInteractableSystems

Container class for ECS systems that synchronize the `Interactable` component state with the network entity tracker. Follows the standard add/remove/update tracker pattern used by IntangibleSystems, InvulnerableSystems, and RespondToHitSystems.

## Inner Classes

### EntityTrackerAddAndRemove


public static class EntityTrackerAddAndRemove extends RefChangeSystem<EntityStore, Interactable>

Reactive system that listens for changes to the `Interactable` component on entities that are also visible to players.

- **onComponentAdded**: Adds the entity reference to the `QueueResource` set so the tracker update system will send the state.
- **onComponentSet**: No-op.
- **onComponentRemoved**: Immediately queues a `ComponentUpdateType.Interactable` removal to all current viewers.

Queries for entities matching both `EntityTrackerSystems.Visible` and `Interactable` component types.

### EntityTrackerUpdate


public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>

Per-tick system that sends `InteractableUpdate` packets to players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

On each tick:
1. If the entity reference is in the `QueueResource` queue (i.e., the component was just added), queues an `InteractableUpdate` to all viewers and removes the ref from the queue.
2. Otherwise, if `newlyVisibleTo` is non-empty, queues the update to newly visible viewers only.

After all per-entity ticks complete, clears the `QueueResource` queue in the store-level `tick()` override.

### QueueResource


public static class QueueResource implements Resource<EntityStore>

Store-scoped resource holding a concurrent set of entity references that need interactable updates queued. Backed by `ConcurrentHashMap.newKeySet()`. The resource type is obtained from `EntityModule.get().getInteractableQueueResourceType()`.

## Related Types

- IntangibleSystems -- identical pattern for `Intangible` component
- InvulnerableSystems -- identical pattern for `Invulnerable` component
- RespondToHitSystems -- identical pattern for `RespondToHit` component
- `Interactable` -- the ECS component being tracked
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `EntityModule` -- registers these systems and provides the resource type
