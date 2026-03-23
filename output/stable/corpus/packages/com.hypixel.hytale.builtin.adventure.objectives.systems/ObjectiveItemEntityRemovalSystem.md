# ObjectiveItemEntityRemovalSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.systems | Extends: HolderSystem

public class ObjectiveItemEntityRemovalSystem extends HolderSystem

## Fields

- private static final ComponentType<EntityStore,ItemComponent> COMPONENT_TYPE

## Methods

- @Nonnull @Override public Query<EntityStore> getQuery()
- @Override public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
- @Override public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
