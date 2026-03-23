# PlayerSystems.NameplateRefChangeSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefChangeSystem<EntityStore, DisplayNameComponent>

public static class PlayerSystems.NameplateRefChangeSystem extends RefChangeSystem<EntityStore, DisplayNameComponent>

An ECS component-change system that updates the `Nameplate` component text whenever the `DisplayNameComponent` is added, changed, or removed on a `Player` entity.

## Related Types

- PlayerSystems -- parent container class

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefSystem, PlayerAddedSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,DisplayNameComponent> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, DisplayNameComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, DisplayNameComponent oldComponent, DisplayNameComponent newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, DisplayNameComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
