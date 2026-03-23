# ObjectiveItemEntityRemovalSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.systems | Extends: HolderSystem

public class ObjectiveItemEntityRemovalSystem extends HolderSystem

## Fields

- private static final ComponentType<EntityStore,ItemComponent> COMPONENT_TYPE

## Methods

- @Nonnull @Override public Query<EntityStore> getQuery()
- @Override public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
- @Override public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Also in this package: ObjectiveInventoryChangeSystem, ObjectivePlayerSetupSystem

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private static final ComponentType<EntityStore,ItemComponent> COMPONENT_TYPE
