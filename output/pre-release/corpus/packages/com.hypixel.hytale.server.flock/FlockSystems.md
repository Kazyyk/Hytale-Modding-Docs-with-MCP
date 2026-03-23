# FlockSystems

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object

public class FlockSystems

Container for ECS systems that operate on flock entities. Contains four inner system classes registered by FlockPlugin.

## Inner Classes

### EntityRemoved


public static class EntityRemoved extends RefSystem<EntityStore>

Handles flock entity removal. On `REMOVE`: dissolves the group by removing FlockMembership from all members, marking chunks dirty, and clearing the `EntityGroup`. On `UNLOAD`: clears the group without dissolving. Query matches entities with `UUIDComponent`, `EntityGroup`, and Flock.

### Ticking


public static class Ticking extends EntityTickingSystem<EntityStore>

Swaps the double-buffered damage data each tick via `Flock.swapDamageDataBuffers()`. Supports parallel execution. Query matches entities with the Flock component.

### FlockDebugSystem


public static class FlockDebugSystem extends EntityTickingSystem<EntityStore>

Renders debug visualization when any flock member has the `VisFlock` debug flag set. Draws colored rings around members and lines connecting members to the leader. Ring colors are derived from the flock UUID. Only active when `Flock.hasVisFlockMember()` returns `true`.

### PlayerChangeGameModeEventSystem


public static class PlayerChangeGameModeEventSystem extends EntityEventSystem<EntityStore, ChangeGameModeEvent>

Removes FlockMembership when a player switches to a non-Adventure game mode.

## Related Types

- Flock -- the component these systems operate on
- FlockPlugin -- registers these systems
