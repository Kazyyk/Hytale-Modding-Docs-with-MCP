# NPCSystems

Type: class | Package: com.hypixel.hytale.server.npc.systems

public class NPCSystems

Container class for eleven ECS systems managing NPC lifecycle events: entity addition, removal, spawn effects, model changes, death handling, teleport handling, kill feed events, and prefab placement.

## Inner Systems

### NPCSystems.AddedSystem


public static class AddedSystem extends RefSystem<EntityStore>

Core lifecycle system that fires when an NPC entity is added or removed. On add: initializes the block-change blackboard view, calls `role.loaded()`, ensures `PrefabCopyableComponent`, `NPCMarkerComponent`, `PositionDataComponent`, and `MovementAudioComponent`. For spawned entities (`AddReason.SPAWN`), adds a `NewSpawnComponent` with the role's spawn lock time.

On remove: cleans up block type view, calls `role.removed()` (for `REMOVE`) or `role.unloaded()` (for `UNLOAD`).

### NPCSystems.AddedFromExternalSystem


public static class AddedFromExternalSystem extends RefSystem<EntityStore>

Runs **after** `AddedSystem`. For NPCs loaded from world gen or prefabs: sets the leash point to the spawn position, stores the spawn heading/pitch, records the spawn instant, calls `role.onLoadFromWorldGenOrPrefab()`. For world-gen entities, removes the `Frozen` component.

**Query:** `NPCEntity AND TransformComponent AND (FromWorldGen OR FromPrefab)`

### NPCSystems.AddedFromWorldGenSystem


public static class AddedFromWorldGenSystem extends HolderSystem<EntityStore>

Copies the world-gen ID from `FromWorldGen` into a `WorldGenId` component for entities from world generation.

### NPCSystems.AddSpawnEntityEffectSystem


public static class AddSpawnEntityEffectSystem extends RefSystem<EntityStore>

Applies the spawn entity effect from the role's balance asset configuration to the NPC's `EffectControllerComponent` on entity add.

### NPCSystems.OnDeathSystem


public static class OnDeathSystem extends DeathSystems.OnDeathSystem

On NPC death, adds a `DeferredCorpseRemoval` component with the role's `deathAnimationTime` if it is greater than zero, allowing the death animation to play before corpse removal.

### NPCSystems.OnTeleportSystem


public static class OnTeleportSystem extends RefChangeSystem<EntityStore, Teleport>

Runs **after** `TeleportSystems.MoveSystem`. When a `Teleport` component is added to an NPC, calls `role.teleported(fromWorld, toWorld)` to notify the role of the teleportation.

### NPCSystems.ModelChangeSystem


public static class ModelChangeSystem extends RefChangeSystem<EntityStore, ModelComponent>

Runs **after** `ModelSystems.UpdateBoundingBox`. When the model component is added, set, or removed, calls `role.updateMotionControllers()` to reconfigure the motion controller with the new model's bounding box.

### NPCSystems.KillFeedDecedentEventSystem


public static class KillFeedDecedentEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>

Cancels kill feed messages where an NPC is the decedent (NPC deaths are not shown in the kill feed).

### NPCSystems.KillFeedKillerEventSystem


public static class KillFeedKillerEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.KillerMessage>

For NPC killers: if the target is not a player, cancels the message. Otherwise, sets the kill feed message to the NPC's display name (or role name fallback).

### NPCSystems.PrefabPlaceEntityEventSystem


public static class PrefabPlaceEntityEventSystem extends WorldEventSystem<EntityStore, PrefabPlaceEntityEvent>

When a prefab entity is placed, remaps flock IDs for NPC entities with `FlockMembership` and marks the entity for save.

### NPCSystems.LegacyWorldGenId


@Deprecated(forRemoval = true)
public static class LegacyWorldGenId extends HolderSystem<EntityStore>

Legacy support for NPCs without `FromWorldGen` or `WorldGenId` components. Reads the legacy world-gen ID from `NPCEntity.getLegacyWorldgenId()` and creates a `WorldGenId` component. Deprecated and scheduled for removal.

## Related Types

- RoleBuilderSystem -- role construction that precedes lifecycle systems
- BalancingInitialisationSystem -- stat initialization
- NPCDamageSystems -- damage event handling
- NPCDeathSystems -- death event handling
