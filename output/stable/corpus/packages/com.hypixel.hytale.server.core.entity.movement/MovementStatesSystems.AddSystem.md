# MovementStatesSystems.AddSystem

Type: class | Package: com.hypixel.hytale.server.core.entity.movement | Extends: HolderSystem

public static class AddSystem extends HolderSystem<EntityStore>

## Fields

- private final ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType

## Methods

- public AddSystem(@Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType)
- public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
- public Query<EntityStore> getQuery()

Also in this package: MovementStatesComponent, MovementStatesSystems, PlayerInitSystem, TickingSystem

Complete API:
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,MovementStatesComponent> movementStatesComponentComponentType
