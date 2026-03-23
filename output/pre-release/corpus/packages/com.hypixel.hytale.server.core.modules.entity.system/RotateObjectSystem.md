# RotateObjectSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system | Extends: EntityTickingSystem<EntityStore>

public class RotateObjectSystem extends EntityTickingSystem<EntityStore>

Per-tick ECS system that continuously rotates entities with a `RotateObjectComponent` around the Y axis. Used for decorative spinning objects such as item displays or rotating props.

## Constructor


public RotateObjectSystem(
    @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType,
    @Nonnull ComponentType<EntityStore, RotateObjectComponent> rotateObjectComponentType
)

Takes the component types for `TransformComponent` and `RotateObjectComponent`.

## Query

Queries for entities matching both `RotateObjectComponent` and `TransformComponent`.

## Behavior

On each tick:
1. Reads the `RotateObjectComponent` to get the rotation speed.
2. Reads the current rotation from `TransformComponent`.
3. Increments `rotation.y` by `rotationSpeed * dt`.
4. Wraps the Y rotation at 360 degrees using modulo.
5. Writes the updated rotation back to the `TransformComponent`.

## Related Types

- TransformSystems -- sends transform changes to clients
- `RotateObjectComponent` -- ECS component specifying the rotation speed
- `TransformComponent` -- ECS component holding position and rotation

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,RotateObjectComponent> rotateObjectComponentType
