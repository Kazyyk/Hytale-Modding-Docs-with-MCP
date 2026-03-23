# RespondToHitSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class RespondToHitSystems

Container class for ECS systems that synchronize the `RespondToHit` component state with the network entity tracker. Follows the standard add/remove/update tracker pattern used by EntityInteractableSystems, IntangibleSystems, and InvulnerableSystems. Also includes a player settings change listener that toggles respond-to-hit behavior in Creative mode.

## Inner Classes

### EntityTrackerAddAndRemove


public static class EntityTrackerAddAndRemove extends RefChangeSystem<EntityStore, RespondToHit>

Reactive system that listens for changes to the `RespondToHit` component on visible entities.

- **onComponentAdded**: Adds the entity reference to the `QueueResource` set for deferred update.
- **onComponentSet**: No-op.
- **onComponentRemoved**: Queues a `ComponentUpdateType.RespondToHit` removal to all current viewers.

Queries for entities matching both `EntityTrackerSystems.Visible` and `RespondToHit` component types.

### EntityTrackerUpdate


public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>

Per-tick system that sends `RespondToHitUpdate` packets to players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

On each tick:
1. If the entity reference is in the `QueueResource` queue, queues a `RespondToHitUpdate` to all viewers and removes the ref from the queue.
2. Otherwise, if `newlyVisibleTo` is non-empty, queues the update to newly visible viewers only.

After all per-entity ticks, clears the `QueueResource` queue.

### OnPlayerSettingsChange


public static class OnPlayerSettingsChange extends RefChangeSystem<EntityStore, PlayerSettings>

Reactive system that toggles the `RespondToHit` component on player entities when their `PlayerSettings` change. Queries for entities with the `Player` component type.

On component added or set:
1. Checks if the player is in `GameMode.Creative`.
2. If so, reads `PlayerSettings.creativeSettings().respondToHit()`:
   - If true, ensures the `RespondToHit` component exists via `commandBuffer.ensureComponent()`.
   - If false, tries to remove the `RespondToHit` component via `commandBuffer.tryRemoveComponent()`.

This allows Creative mode players to toggle whether they respond to hits based on their personal settings.

### QueueResource


public static class QueueResource implements Resource<EntityStore>

Store-scoped resource holding a concurrent set of entity references that need respond-to-hit updates queued. The resource type is obtained from `EntityModule.get().getRespondToHitQueueResourceType()`.

## Related Types

- EntityInteractableSystems -- identical tracker pattern for `Interactable` component
- IntangibleSystems -- identical tracker pattern for `Intangible` component
- InvulnerableSystems -- identical tracker pattern for `Invulnerable` component
- HideEntitySystems -- also reacts to player settings for visibility
- `RespondToHit` -- the ECS component being tracked
- `PlayerSettings` -- player settings component with creative mode preferences
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `EntityModule` -- registers these systems and provides the resource type

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)
