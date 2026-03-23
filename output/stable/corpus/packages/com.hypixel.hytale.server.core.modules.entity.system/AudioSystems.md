# AudioSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class AudioSystems

Container class for ECS systems that synchronize entity audio state with the network entity tracker. Contains two inner systems: one that queues audio updates for visible players, and one that plays movement-related sounds based on the block the entity is inside.

## Inner Classes

### EntityTrackerUpdate


public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>

Per-tick system that queues `AudioUpdate` packets for visible players whenever an entity's `AudioComponent` becomes network-outdated or new players enter visibility range.

Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution via `EntityTickingSystem.maybeUseParallel()`.

Queries for entities matching both the `EntityTrackerSystems.Visible` and `AudioComponent` component types.

On each tick:
1. If `AudioComponent.consumeNetworkOutdated()` returns true, queues an `AudioUpdate` containing the current sound event IDs to all viewers in `visibleTo`.
2. Otherwise, if `newlyVisibleTo` is non-empty, queues the same update only to newly visible viewers.

### TickMovementAudio


public static class TickMovementAudio extends EntityTickingSystem<EntityStore>

Per-tick system that plays block-based movement sounds when an entity enters or moves within a block type that has a `BlockSoundSet`. Queries for entities matching `TransformComponent`, `PositionDataComponent`, `MovementAudioComponent`, and `MovementStatesComponent`.

On each tick:
1. Reads the current `insideBlockTypeId` from `PositionDataComponent`.
2. If the block type has changed since last tick, plays the `MoveIn` sound event for the new block type and the `MoveOut` sound event for the previous block type (if any). Stores a randomized repeat interval from the block sound set's `moveInRepeatRange`.
3. If the entity is not idle and the `MoveIn` repeat timer has elapsed, replays the `MoveIn` sound.

Sound events are resolved through `BlockType` -> `BlockSoundSet` -> sound event index lookups. Sounds are played as 3D positional audio via `SoundUtil.playSoundEvent3d()` with category `SoundCategory.SFX`.

## Related Types

- EntitySystems -- other entity system containers in this package
- TransformSystems -- transform tracker update follows a similar pattern
- ModelSystems -- animation tracker update follows a similar pattern
- `AudioComponent` -- the ECS component tracking entity sound event IDs
- `MovementAudioComponent` -- the ECS component tracking movement sound state
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `EntityTrackerSystems.QUEUE_UPDATE_GROUP` -- system group for tracker updates
