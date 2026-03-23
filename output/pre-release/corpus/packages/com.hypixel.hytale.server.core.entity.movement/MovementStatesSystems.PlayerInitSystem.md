# MovementStatesSystems.PlayerInitSystem

Type: class | Package: com.hypixel.hytale.server.core.entity.movement | Extends: RefSystem

public static class PlayerInitSystem extends RefSystem<EntityStore>

## Fields

- private final Query<EntityStore> query
- private final ComponentType<EntityStore, Player> playerComponentType
- private final ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentType

## Methods

- public PlayerInitSystem( @Nonnull ComponentType<EntityStore, Player> playerComponentType, @Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentType )
- public void onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public Query<EntityStore> getQuery()
