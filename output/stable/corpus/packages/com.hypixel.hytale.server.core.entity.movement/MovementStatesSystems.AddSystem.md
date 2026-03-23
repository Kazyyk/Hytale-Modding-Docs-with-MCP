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
