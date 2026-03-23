# IntangibleSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class IntangibleSystems

Container class for ECS systems that synchronize the `Intangible` component state with the network entity tracker. Follows the identical add/remove/update tracker pattern used by EntityInteractableSystems, InvulnerableSystems, and RespondToHitSystems.

## Inner Classes

### EntityTrackerAddAndRemove


public static class EntityTrackerAddAndRemove extends RefChangeSystem<EntityStore, Intangible>

Reactive system that listens for changes to the `Intangible` component on visible entities.

- **onComponentAdded**: Adds the entity reference to the `QueueResource` set for deferred update.
- **onComponentSet**: No-op.
- **onComponentRemoved**: Queues a `ComponentUpdateType.Intangible` removal to all current viewers.

Queries for entities matching both `EntityTrackerSystems.Visible` and `Intangible` component types.

### EntityTrackerUpdate


public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>

Per-tick system that sends `IntangibleUpdate` packets to players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

On each tick:
1. If the entity reference is in the `QueueResource` queue, queues an `IntangibleUpdate` to all viewers and removes the ref from the queue.
2. Otherwise, if `newlyVisibleTo` is non-empty, queues the update to newly visible viewers only.

After all per-entity ticks, clears the `QueueResource` queue.

### QueueResource


public static class QueueResource implements Resource<EntityStore>

Store-scoped resource holding a concurrent set of entity references that need intangible updates queued. The resource type is obtained from `EntityModule.get().getIntangibleQueueResourceType()`.

## Related Types

- EntityInteractableSystems -- identical pattern for `Interactable` component
- InvulnerableSystems -- identical pattern for `Invulnerable` component
- RespondToHitSystems -- identical pattern for `RespondToHit` component
- EntitySpatialSystem -- excludes intangible entities from spatial queries
- `Intangible` -- the marker ECS component being tracked
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `EntityModule` -- registers these systems and provides the resource type
