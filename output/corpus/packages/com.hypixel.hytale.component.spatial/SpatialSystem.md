# SpatialSystem

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: TickingSystem<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class SpatialSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE> implements QuerySystem<ECS_TYPE>

Abstract ECS system that rebuilds a spatial index each tick. Iterates all entities in the store, extracts positions via the abstract `getPosition()` method, populates the `SpatialData`, and triggers `SpatialStructure.rebuild()`. Subclasses define which component provides the entity position.
