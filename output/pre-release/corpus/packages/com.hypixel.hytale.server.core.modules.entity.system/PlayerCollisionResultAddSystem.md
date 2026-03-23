# PlayerCollisionResultAddSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system | Extends: HolderSystem<EntityStore>

public class PlayerCollisionResultAddSystem extends HolderSystem<EntityStore>

Holder system that initializes the `CollisionResultComponent` for player entities when they are added to the store. Queries for entities that have `Player` but do not yet have `CollisionResultComponent`.

## Constructor


public PlayerCollisionResultAddSystem(
    @Nonnull ComponentType<EntityStore, Player> playerComponentType,
    @Nonnull ComponentType<EntityStore, CollisionResultComponent> collisionResultComponentType
)

Takes the component types for `Player` and `CollisionResultComponent`.

## Behavior

On entity add:
1. Creates a new `CollisionResultComponent`.
2. Reads the `CollisionResult` from the component and calls `setDefaultPlayerSettings()` to initialize default collision parameters.
3. Calls `resetLocationChange()` on the component.
4. Configures the player's trigger block processing via `Player.configTriggerBlockProcessing(true, true, collisionResultComponent)`.
5. Adds the component to the entity holder.

On entity removed: No-op.

## Related Types

- PlayerSpatialSystem -- spatial indexing for player entities
- UpdateLocationSystems -- chunk location tracking for entities
- `Player` -- the player ECS component
- `CollisionResultComponent` -- ECS component storing collision detection results
- `CollisionResult` -- collision data with default player settings

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)

Complete API:
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
  public Query<EntityStore> getQuery()

Fields:
private final Query<EntityStore> query
private final ComponentType<EntityStore,CollisionResultComponent> collisionResultComponentType
private final ComponentType<EntityStore,Player> playerComponentType
