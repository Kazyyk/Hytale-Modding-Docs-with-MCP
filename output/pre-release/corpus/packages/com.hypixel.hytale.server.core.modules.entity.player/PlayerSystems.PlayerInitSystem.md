# PlayerSystems.PlayerInitSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerSystems.PlayerInitSystem extends HolderSystem<EntityStore>

ECS holder system that initializes newly added player entities. Ensures required components are present on the player holder, including `PlayerInput`, `EffectControllerComponent`, `UniqueItemUsagesComponent`, and all inventory component types (`Storage`, `Armor`, `Hotbar`, `Utility`, `Tool`, `Backpack`). Also performs inventory migration from the legacy format to component-based storage.

On entity removal, removes the `PlayerInput` component from the holder.

## Methods

- Query<EntityStore> getQuery()
- void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)

## Query

Matches entities with `PlayerRef` component type.

## See Also

- PlayerSystems

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
