# PlayerItemEntityPickupSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public class PlayerItemEntityPickupSystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that handles players picking up item entities from the world. Queries item entities that have an `ItemComponent` and `TransformComponent` but lack `Interactable`, `PickupItemComponent`, and `PreventPickup` components.

Each tick, for items past their pickup delay and throttle, it searches for the nearest player within pickup radius using the player spatial resource. If the item has a Pickup interaction defined, it executes the interaction chain. Otherwise, it attempts to add the item to the nearest player's inventory via `Player.giveItem()`. Handles partial pickups (stack splits), death checking, despawn timer updates, and spawns visual pickup effects.

Runs single-threaded and depends on `PlayerSpatialSystem`.

## Related Types

- PlayerSystems -- other player systems

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,ItemComponent> itemComponentType
private final ComponentType<EntityStore,Player> playerComponentType
private final ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> playerSpatialComponent
private final ComponentType<EntityStore,InteractionManager> interactionManagerType
private final Set<Dependency<EntityStore>> dependencies
private final Query<EntityStore> query
