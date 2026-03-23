# ObjectivePlayerSetupSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.systems | Extends: RefSystem

public class ObjectivePlayerSetupSystem extends RefSystem

## Fields

- private final ComponentType<EntityStore,ObjectiveHistoryComponent> objectiveHistoryComponentType
- private final ComponentType<EntityStore,Player> playerComponentType
- private final ComponentType<EntityStore,UUIDComponent> uuidComponentType
- private final Query<EntityStore> query

## Methods

- @Nonnull @Override public Query<EntityStore> getQuery()
- @Override public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Override public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
