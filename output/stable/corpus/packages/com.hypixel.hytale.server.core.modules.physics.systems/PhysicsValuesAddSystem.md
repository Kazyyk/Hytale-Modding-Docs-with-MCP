# PhysicsValuesAddSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.systems | Extends: HolderSystem

public class PhysicsValuesAddSystem extends HolderSystem

## Fields

- private final ComponentType<EntityStore,PhysicsValues> physicsValuesComponentType
- private final Query<EntityStore> query
- private final Set<Dependency<EntityStore>> dependencies

## Methods

- @Nonnull @Override public Set<Dependency<EntityStore>> getDependencies()
- @Override public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
- @Override public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
- @Nonnull @Override public Query<EntityStore> getQuery()

Also in this package: AddSystem, GenericVelocityInstructionSystem, IVelocityModifyingSystem, VelocitySystems

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
  public Query<EntityStore> getQuery()

Fields:
private final ComponentType<EntityStore,PhysicsValues> physicsValuesComponentType
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
